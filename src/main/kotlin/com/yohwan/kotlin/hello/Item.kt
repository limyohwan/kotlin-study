package com.yohwan.kotlin.hello

fun main(args: Array<String>) {
    val item = Item("Book", 10000)
    println("Item name is ${item.name}, price is ${item.price}")
}

class Item(
    val name: String,
    val price: Int
)