package com.example.kopring_demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping("/get")
    fun helloWorld(): String = "Hello, this is HelloWorldController!"

}