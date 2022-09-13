package dev.nyman.enchant.kotlin

import com.sun.jna.Native
import dev.nyman.enchant.kotlin.enchant.EnchantLib

fun main() {
    val enchant = Native.load("enchant-2", EnchantLib::class.java) as EnchantLib
    val broker = enchant.enchant_broker_init()
    val dict = enchant.enchant_broker_request_dict(broker, "fi")
    enchant.enchant_broker_free_dict(broker, dict)
    enchant.enchant_broker_free(broker)
}