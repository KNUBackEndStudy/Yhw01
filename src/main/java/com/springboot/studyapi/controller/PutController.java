package com.springboot.studyapi.controller;

import com.springboot.studyapi.dto.PostRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put/")
public class PutController {
    @PutMapping(value = "/member")
    public String put1(@RequestBody Map<String, Object> putData) {
        StringBuilder sb= new StringBuilder();

        putData.forEach((key, value) -> {
            sb.append("Key : ").append(key).append(", value : ").append(value).append("\n");
        });
        return sb.toString();
    }
    @PutMapping(value="/member2")
    public PostRequestDto put2 (@RequestBody PostRequestDto postRequestDto) {
        return postRequestDto;
    }
    @PutMapping(value = "/member3")
    public ResponseEntity<PostRequestDto> put3 (@RequestBody PostRequestDto postRequestDto) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)// 202
                .body (postRequestDto);
    }
}
