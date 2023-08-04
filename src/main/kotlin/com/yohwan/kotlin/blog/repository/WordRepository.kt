package com.yohwan.kotlin.blog.repository

import com.yohwan.kotlin.blog.entity.Wordcount
import org.springframework.data.jpa.repository.JpaRepository

interface WordRepository: JpaRepository<Wordcount, String> {
    fun findTop10ByOrderByCntDesc(): List<Wordcount>
}