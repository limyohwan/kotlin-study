package com.yohwan.kotlin.core.response

data class ErrorResponse (
    val message: String,
    val errorType: String = "Invalid Argument"
)