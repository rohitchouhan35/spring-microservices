package com.rohichouhan35.ProductService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class Home {

    @GetMapping
    public String home() {
        return "Hi time is now " + LocalDateTime.now().toString();
    }

}
