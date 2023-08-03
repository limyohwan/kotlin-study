package com.yohwan.kotlin.blog.service

import com.yohwan.kotlin.blog.dto.BlogDto
import org.springframework.stereotype.Service

@Service
class BlogService {
    fun searchKakao(blogDto: BlogDto): String? {
        println(blogDto.toString())
        return "SearchKakao"
    }
}