package com.hellomesengingapp.springhelloapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request Method
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
