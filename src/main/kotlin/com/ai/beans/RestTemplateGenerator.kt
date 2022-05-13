package com.ai.beans

import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

class RestTemplateGenerator {
    @Bean
    fun getRestTemplate(): RestTemplate {
        return RestTemplate()
    }
}