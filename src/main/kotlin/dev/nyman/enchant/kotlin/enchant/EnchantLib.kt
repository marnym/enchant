package dev.nyman.enchant.kotlin.enchant

import com.sun.jna.Library
import com.sun.jna.ptr.IntByReference

interface EnchantLib : Library {
    fun enchant_get_version(): String
    fun enchant_broker_init(): EnchantBroker
    fun enchant_broker_free(broker: EnchantBroker)
    fun enchant_broker_dict_exists(broker: EnchantBroker, tag: String): Int
    fun enchant_broker_request_dict(broker: EnchantBroker, tag: String): EnchantDict
    fun enchant_broker_free_dict(broker: EnchantBroker, dict: EnchantDict)
    fun enchant_dict_check(dict: EnchantDict, word: String, len: Int): Int
    fun enchant_dict_suggest(dict: EnchantDict, word: String, len: Int, out_n_suggs: IntByReference): Array<String>

}