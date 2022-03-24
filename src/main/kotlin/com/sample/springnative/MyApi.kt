package com.sample.springnative

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyApi {

    @GetMapping("/test")
    fun test(): String {
        return "ok"
    }
}