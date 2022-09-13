package dev.nyman.enchant.kotlin.enchant

import com.sun.jna.Library

interface EnchantLib : Library {
    fun enchant_get_version(): String
    fun enchant_broker_init(): EnchantBroker
    fun enchant_broker_free(broker: EnchantBroker)
    fun enchant_broker_dict_exists(broker: EnchantBroker, tag: String): Int
    fun enchant_broker_request_dict(broker: EnchantBroker, tag: String): EnchantDict
    fun enchant_broker_free_dict(broker: EnchantBroker, dict: EnchantDict)
}