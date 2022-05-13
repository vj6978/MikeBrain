package com.ai.brain.aibrain.randomness.randomjoke

import com.ai.brain.aibrain.randomness.generator.GenerationStrategy
import com.ai.brain.aibrain.randomness.generator.RandomGeneratorRequestType
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.Collections

@Service
class RandomJokeGenerator: GenerationStrategy
{
    override var maxRange: Int = Int.MAX_VALUE
    override var minRange: Int = Int.MIN_VALUE
    override var type: RandomGeneratorRequestType = RandomGeneratorRequestType.JOKE

    private val restTemplate = RestTemplate()

    override fun generate(): String {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON
        headers.accept = Collections.singletonList(MediaType.APPLICATION_JSON)

        val httpEntity = HttpEntity(null, headers)
        val response = restTemplate.exchange("https://icanhazdadjoke.com/", HttpMethod.GET, httpEntity, JokeDTO::class.java).body
        return response?.joke ?: "I couldn't find any jokes!"
    }
}