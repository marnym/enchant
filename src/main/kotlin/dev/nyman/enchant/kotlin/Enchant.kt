package dev.nyman.enchant.kotlin

import com.sun.jna.Native
import dev.nyman.enchant.kotlin.jna.EnchantBrokerStruct
import dev.nyman.enchant.kotlin.jna.EnchantDictStruct
import dev.nyman.enchant.kotlin.jna.EnchantLib
import java.lang.Exception

const val LIB_NAME = "enchant-2"

class Enchant {
    private val lib: EnchantLib by lazy { Native.load(LIB_NAME, EnchantLib::class.java) }
    private val broker: EnchantBrokerStruct by lazy { lib.enchant_broker_init() }

    fun getVersion(): String = lib.enchant_get_version()

    fun dictExists(languageTag: String) = lib.enchant_broker_dict_exists(broker, languageTag) > 0

    fun loadDict(languageTag: String): EnchantDict {
        val dict = lib.enchant_broker_request_dict(broker, languageTag)
        return dict?.let { EnchantDict(lib, this::freeDict, it) }
            ?: throw Exception("Dictionary with languageTag: $languageTag not found")
    }

    private fun freeDict(dict: EnchantDictStruct) {
        lib.enchant_broker_free_dict(broker, dict)
    }

    protected fun finalize() {
        lib.enchant_broker_free(broker)
    }
}