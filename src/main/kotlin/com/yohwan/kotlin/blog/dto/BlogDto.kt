package com.yohwan.kotlin.blog.dto

import com.yohwan.kotlin.core.annotation.ValidEnum
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class BlogDto(
    @field:NotBlank(message = "query must not null")
    val query: String?,

    @field:NotBlank(message = "sort must not null")
    @field:ValidEnum(enumClass = EnumSort::class, message = "sort is ACCURACY or RECENCY")
    val sort: String?,

    @field:NotNull(message = "page must not null")
    @field:Max(50, message = "page is less than 50")
    @field:Min(1, message = "page is more than 1")
    val page: Int?,

    @field:NotNull(message = "size must not null")
    val size: Int?
) {
    private enum class EnumSort {
        ACCURACY,
        RECENCY
    }
}