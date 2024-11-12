package com.springboot.studyapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {
    @GetMapping("/member/{email}")
    public String findByEmail(@PathVariable("email") String email ) {//email 받기
        return "email: " + email;
    }
}