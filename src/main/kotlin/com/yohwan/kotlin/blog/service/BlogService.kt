package com.yohwan.kotlin.blog.service

import com.yohwan.kotlin.blog.dto.BlogDto
import com.yohwan.kotlin.blog.entity.Wordcount
import com.yohwan.kotlin.blog.repository.WordRepository
import com.yohwan.kotlin.core.exception.InvalidInputException
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono

@Service
class BlogService(
    val wordRepository: WordRepository
) {
    @Value("\${rest-api-key}")
    lateinit var restApiKey: String

    fun searchKakao(blogDto: BlogDto): String? {
//        val msgList = mutableListOf<ExceptionMsg>()
//
//        if (blogDto.query.trim().isEmpty()) {
//            msgList.add(ExceptionMsg.EMPTY_QUERY)
//        }
//
//        if (blogDto.sort.trim() !in arrayOf("accuracy", "recency")) {
//            msgList.add(ExceptionMsg.NOT_IN_SORT)
//        }
//
//        when {
//            blogDto.page < 1 -> msgList.add(ExceptionMsg.LESS_THAN_MIN)
//            blogDto.page > 50 -> msgList.add(ExceptionMsg.MORE_THAN_MAX)
//        }
//
//        if (msgList.isNotEmpty()) {
//            val message = msgList.joinToString { it.msg }
//            throw InvalidInputException(message)
//        }

        val webClient = WebClient.builder()
            .baseUrl("https://dapi.kakao.com")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build()

        val response = webClient.get()
            .uri {
                it.path("/v2/search/blog")
                    .queryParam("query", blogDto.query)
                    .queryParam("sort", blogDto.sort)
                    .queryParam("page", blogDto.page)
                    .queryParam("size", blogDto.size)
                    .build() }
            .header("Authorization", "KakaoAK $restApiKey")
            .retrieve()
            .bodyToMono<String>()

        val result = response.block()

        val lowQuery: String = blogDto.query.lowercase()
        val word:Wordcount = wordRepository.findById(lowQuery).orElse(Wordcount(lowQuery))
        word.cnt++

        wordRepository.save(word)

        return result
    }

    fun searchWordRank(): List<Wordcount> = wordRepository.findTop10ByOrderByCntDesc()
}

private enum class ExceptionMsg(val msg: String) {
    EMPTY_QUERY("query = no query"),
    NOT_IN_SORT("sort = accuracy or recency"),
    LESS_THAN_MIN("page = less than min"),
    MORE_THAN_MAX("page = more than max")
}