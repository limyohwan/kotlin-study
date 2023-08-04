package com.yohwan.kotlin.core.exception

import java.lang.RuntimeException

class InvalidInputException (
    message: String = "Invalid Input"
) : RuntimeException(message)