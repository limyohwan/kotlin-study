package com.yohwan.kotlin.hello

fun main(args: Array<String>) {
    val sum = sumPrice(100, 200)
    println("sum = $sum")
}

//fun sumPrice(price1: Int, price2: Int): Int {
//    return price1 + price2
//}

//fun sumPrice(price1: Int, price2: Int): Int = price1 + price2

fun sumPrice(price1: Int, price2: Int) = price1 + price2