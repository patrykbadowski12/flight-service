package com.travel.app.flightservice

import feign.Logger
import feign.RequestInterceptor
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FeignHeaderConfiguration {

    @Value("\${goFlightLabs.access_key}")
    var accessKey : String? = null

    @Bean
    fun requestInterceptor(): RequestInterceptor {
        return RequestInterceptor {
            it.query("access_key", accessKey)
        }
    }

    @Bean
    fun feignLoggerLevel(): Logger.Level {
        return Logger.Level.FULL
    }
}