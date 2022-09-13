package dev.nyman.enchant.kotlin.jna

import com.sun.jna.Library
import com.sun.jna.ptr.IntByReference

interface EnchantLib : Library {
    fun enchant_get_version(): String
    fun enchant_broker_init(): EnchantBrokerStruct
    fun enchant_broker_free(broker: EnchantBrokerStruct)
    fun enchant_broker_dict_exists(broker: EnchantBrokerStruct, tag: String): Int
    fun enchant_broker_request_dict(broker: EnchantBrokerStruct, tag: String): EnchantDictStruct?
    fun enchant_broker_free_dict(broker: EnchantBrokerStruct, dict: EnchantDictStruct)
    fun enchant_dict_check(dict: EnchantDictStruct, word: String, len: Int): Int
    fun enchant_dict_suggest(dict: EnchantDictStruct, word: String, len: Int, out_n_suggs: IntByReference): Array<String>

}