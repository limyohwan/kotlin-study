package com.yohwan.kotlin.hello

fun main(args: Array<String>) {
    // 대소 비교
    val priceA = 100
    val priceB = 200
    if(priceA >= priceB) {
        println("priceA = $priceA")
    } else {
        println("priceB = $priceB")
    }

    // null 체크
    val price: Int? = null
    if(price == null) {
        println("price is null")
    } else {
        println("price = $price")
    }

    // in 체크
    val array = arrayOf(100, 200, 300)
    if(100 in array) {
        println("contain")
    } else {
        println("not contained")
    }

    // when 문 -> 자바 switch 문과 유사한것 같음
    val num: Int = 301
    when(num) {
        100 -> println("1. num = $num")
        200 -> println("2. num = $num")
        300 -> println("3. num = $num")
        else -> println("4. Not")
    }

    // 범위문 작성
    when(num) {
        in 100..199 -> println("1. num = $num")
        in 200..299 -> println("2. num = $num")
        in 300..399 -> println("3. num = $num")
        else -> println("4. Not")
    }

    // 범위문을 이렇게도 사용 가능
    when {
        num in 100..199 -> println("1. num = $num")
        num in 200..299 -> println("2. num = $num")
        num in 300..399 -> println("3. num = $num")
        else -> println("4. Not")
    }
}