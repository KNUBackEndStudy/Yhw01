package com.springboot.studyapi.controller;

import com.springboot.studyapi.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PostController {
    @PostMapping("/post/info")
    public PostRequestDto post1(@RequestBody PostRequestDto postRequestDto) {
        return postRequestDto;
    }
    @PostMapping("/post")
    public String post(@RequestBody Map<String, Object> requestData) {
        StringBuilder sb = new StringBuilder();

        requestData.forEach((key, value) -> {
            sb.append("key : ").append(key).append("\n");
            sb.append("value : ").append(value).append("\n");
        });

        return sb.toString();
    }
}