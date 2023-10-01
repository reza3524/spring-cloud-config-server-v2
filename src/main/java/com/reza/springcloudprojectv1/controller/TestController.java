package com.reza.springcloudprojectv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("v1/name")
    public String getTestName() {
        return "Hello Test!";
    }
}
