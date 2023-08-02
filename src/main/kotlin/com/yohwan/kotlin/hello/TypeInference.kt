package com.yohwan.kotlin.hello

fun main(args: Array<String>) {
    val s = "ABC"
    val i = 1
    val l = 1L
    val d = 1.0
    val f = 1.0f

    println("s = " + s::class)
    println("i = " + i::class)
    println("l = " + l::class)
    println("d = " + d::class)
    println("f = " + f::class)
}