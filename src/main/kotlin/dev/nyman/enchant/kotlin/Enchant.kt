package dev.nyman.enchant.kotlin

import com.sun.jna.Native

const val LIB_NAME = "enchant-2"

class Enchant() {
    private val lib: EnchantLib by lazy {
        Native.load(LIB_NAME, EnchantLib::class.java)
    }

    fun getVersion(): String = lib.enchant_get_version()
}