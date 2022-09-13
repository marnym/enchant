package dev.nyman.enchant.kotlin

fun main() {
    val enchant = Enchant()
    val dict = enchant.loadDict("fi")

    println("checking 'kissa' ${dict.check("kissa")}")
    println("checking 'kisssa' ${dict.check("kisssa")}")

    println("suggestions for 'kissa': ${dict.suggest("kissa").joinToString(" ")}")
    println("suggestions for 'kisssa': ${dict.suggest("kisssa").joinToString(" ")}")
}