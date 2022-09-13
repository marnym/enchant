package dev.nyman.enchant.jna

import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.Structure.FieldOrder

@FieldOrder(
    "user_data",
    "enchant_private_data",
    "check",
    "suggest",
    "add_to_personal",
    "add_to_session",
    "store_replacement",
    "add_to_exclude",
    "get_extra_word_characters",
    "is_word_character"
)
// No need to know types of the fields, since we can get the information out with the existing functions
class EnchantDictStruct : Structure() {
    @JvmField
    var user_data: Pointer? = null

    @JvmField
    var enchant_private_data: Pointer? = null

    @JvmField
    var check: Pointer? = null

    @JvmField
    var suggest: Pointer? = null

    @JvmField
    var add_to_personal: Pointer? = null

    @JvmField
    var add_to_session: Pointer? = null

    @JvmField
    var store_replacement: Pointer? = null

    @JvmField
    var add_to_exclude: Pointer? = null

    @JvmField
    var get_extra_word_characters: Pointer? = null

    @JvmField
    var is_word_character: Pointer? = null

}
