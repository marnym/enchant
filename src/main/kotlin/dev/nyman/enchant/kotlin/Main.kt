package dev.nyman.enchant.kotlin

import com.sun.jna.Native

fun main() {
    val enchant = Native.load("enchant-2", EnchantLib::class.java) as EnchantLib
    println(enchant.enchant_get_version())
}