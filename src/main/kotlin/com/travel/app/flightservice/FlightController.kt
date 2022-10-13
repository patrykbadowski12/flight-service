package com.travel.app.flightservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FlightController(private val goFlightLabsClient: GoFlightLabsClient) {

    @GetMapping("/test")
    fun test(): String {
        return goFlightLabsClient.test()
    }
}