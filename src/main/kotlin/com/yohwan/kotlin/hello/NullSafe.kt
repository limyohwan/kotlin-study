package com.yohwan.kotlin.hello

fun main(args: Array<String>) {
//    val str0: String = null // 컴파일 에러, null 허용하지 않음

    val str1: String = "ABC"
    println(str1.length)

    val str2: String? = "ABC"
//    println(str3.length) // ?로 선언된 변수의 길이를 구하려니 null일 수도 있는 변수라 컴파일 에러가 발생함
    println(str2?.length) // ?. 를 사용하여 null safe call operator로 앞의 변수가 null이 아니라면 뒤에 명령어를 이어서 실행하게됨
    println(str2!!.length) // !!. 를 사용하여 실제로 null이 들어갈 수 있는 변수이긴 하지만 null이 아니라고 보장해줌

    val str3: String? = null // ? = null을 허용함
    str3 ?: println("str3 is null") // ?: 를 사용하여 앞에 있는 변수가 null이면 뒤에 있는 명령어를 실행함
    println(str3?.length) // ?. 를 사용하여 null safe call operator로 앞의 변수가 null이라면 에러가 발생하진 않고 null 값이 나옴
    println(str3!!.length) // !!. 를 사용하여 실제로 null이 들어갈 수 있는 변수이긴 하지만 null이 아니라고 보장해주지만 null 값일 시 에러 발생, 런타임 에러

}
