
package dev.nyman.enchant.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class GreeterTest {
	@Test
	fun testGreeter() {
		val greeter = Greeter()
		val greeting = greeter.sayHello("World")
		assertEquals(greeting, "Bonjour, World!")
	}

	@Test
	fun testNullGreeter() {
		val greeter = Greeter()
		val greeting = greeter.sayHello(null)
		assertEquals(greeting, "name cannot be null")
	}
}
