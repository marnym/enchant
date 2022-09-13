package dev.nyman.enchant.kotlin

import com.sun.jna.Native
import com.sun.jna.ptr.IntByReference
import dev.nyman.enchant.kotlin.enchant.EnchantLib

fun main() {
    val enchant = Native.load("enchant-2", EnchantLib::class.java) as EnchantLib
    val broker = enchant.enchant_broker_init()
    val dict = enchant.enchant_broker_request_dict(broker, "fi")
    println(enchant.enchant_dict_check(dict, "kissa", 5))
    println(enchant.enchant_dict_check(dict, "kisssa", 6))

    val ns = IntByReference()
    val suggestions = enchant.enchant_dict_suggest(dict, "kisssa", 6, ns)
    suggestions.forEach(::println)

    enchant.enchant_broker_free_dict(broker, dict)
    enchant.enchant_broker_free(broker)
}