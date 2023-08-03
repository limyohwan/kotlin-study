package com.yohwan.kotlin.hello.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/api/hello")
    fun helloWorld(): String {
        return "hello"
    }
}