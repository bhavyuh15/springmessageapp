package com.hellomesengingapp.springhelloapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request Method
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // GET Request Method with Query Parameter
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}