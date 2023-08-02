package com.yohwan.kotlin.hello

fun main(args: Array<String>) {
    var i: Int = 10 // var = 읽기, 쓰기 가능
    val j: Int = 10 // val = 읽기만 가능(Immutable)

    i = 20;
//    j = 20; // compile error

    println(i)
    println(j)
}