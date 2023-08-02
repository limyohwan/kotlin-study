package com.yohwan.kotlin.hello

fun main(args: Array<String>) {

    var i: Int = 10 // Int = null을 허용하지 않음
    var j: Int? = 10 // Int? = null을 허용함

//    i = null; // compile error
    j = null;

    println(i)
    println(j)

    var k: String = "yohwan" // String = null을 허용하지 않음
    var l: String? = "yohwan" // String? = null을 허용함

//    i = null; // compile error
    l = null;

    println(k)
    println(l)
}