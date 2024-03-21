package com.yohwan.kotlin.hello

fun main(args: Array<String>) {
    val item = Item("Book", 10000)
    println("Item name is ${item.name}, price is ${item.price}")

    item.buy()
    item.sell()

    val item2 = Item2("Book", 10_000)
    println("Item name is ${item2.name}, price is ${item2.price}")

}

class Item(
    val name: String,
    val price: Int
) : ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}

data class Item2(val name: String, val price: Int) // 기본적으로 Getter, Setter(var), equals, hashcode, tostring, copy, componentN 함수들이 생성됨

interface ItemTrade {
    fun buy()
    fun sell()
}

enum class Color2 {
    RED,
    GREEN,
    BLUE
}