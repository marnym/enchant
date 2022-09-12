
package dev.nyman.enchant.kotlin

class Greeter {
	companion object {
		init {
			NativeLoader.loadLibrary(Greeter::class.java.classLoader, "lib")
		}
	}

	external fun sayHello(name: String?): String?
}
