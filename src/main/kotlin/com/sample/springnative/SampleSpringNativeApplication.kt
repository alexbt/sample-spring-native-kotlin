package com.sample.springnative

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleSpringNativeApplication

fun main(args: Array<String>) {
	runApplication<SampleSpringNativeApplication>(*args)
}
