package dev.nyman.enchant.kotlin

import com.sun.jna.ptr.IntByReference
import dev.nyman.enchant.kotlin.jna.EnchantDictStruct
import dev.nyman.enchant.kotlin.jna.EnchantLib

class EnchantDict(
    private val lib: EnchantLib,
    private val freeDict: (dict: EnchantDictStruct) -> Unit,
    private val dict: EnchantDictStruct
) {
    fun check(word: String): Boolean {
        if (word.isEmpty()) return true

        return lib.enchant_dict_check(dict, word, word.length) == 0
    }

    fun suggest(word: String): List<String> {
        if (word.isEmpty()) return emptyList()

        val suggestions = lib.enchant_dict_suggest(dict, word, word.length, IntByReference())
        return suggestions.toList()
    }

    protected fun finalize() {
        freeDict(dict)
    }
}