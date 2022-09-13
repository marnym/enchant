package dev.nyman.enchant.kotlin

import dev.nyman.enchant.kotlin.enchant.Enchant
import org.junit.Test
import kotlin.test.assertEquals

class EnchantLibTests {
    private val enchant = Enchant()

    @Test
    fun getVersion() {
        assertEquals(enchant.getVersion(), "2.3.3")
    }
}