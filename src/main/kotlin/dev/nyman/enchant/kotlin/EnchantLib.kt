package dev.nyman.enchant.kotlin

import com.sun.jna.Library

interface EnchantLib : Library {
    fun enchant_get_version(): String
}