package dev.nyman.enchant.kotlin.enchant

import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.Structure.FieldOrder

@FieldOrder("provider_list", "dict_map", "provider_ordering", "error")
// No need to know types of the fields, since we can get the information out with the existing functions
class EnchantBroker : Structure() {
    @JvmField
    var provider_list: Pointer? = null

    @JvmField
    var dict_map: Pointer? = null

    @JvmField
    var provider_ordering: Pointer? = null

    @JvmField
    var error: Pointer? = null
}