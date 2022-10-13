package com.travel.app.flightservice

import feign.Headers
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "goFlightLabs", url = "\${goFlightLabs.url}", configuration = [FeignHeaderConfiguration::class])
interface GoFlightLabsClient {

    @GetMapping("/flights")
    fun test() : String
}