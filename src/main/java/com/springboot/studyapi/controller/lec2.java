package com.springboot.studyapi.controller;

import com.springboot.studyapi.dto.Lec2Dto;
import com.springboot.studyapi.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/lec2")
public class lec2 {
    @GetMapping("lec2/get/{id}/{name}/{p_n}/{email}")
    public String lec2get(@PathVariable("id") String id,
                          @PathVariable("name") String name,
                          @PathVariable("p_n") String p_n,
                          @PathVariable("email") String email) {
        return "Student_ID : " + id + "\n Name : " + name + "\n Phone_number : " + p_n + "\n Email : " + email;
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
    @PostMapping("/post/info")
    public Lec2Dto lecpost(@RequestBody Lec2Dto lec2Dto) {
        return lec2Dto;
    }

    @PutMapping(value = "/put")
    public String lecput(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.forEach((key, value) -> {
            sb.append("Key: ").append(key).append(", Value: ").append(value).append("\n");
        });

        return sb.toString();
    }
    @DeleteMapping("delete/{id}/{name}/{p_n}/{email}")
    public void delete(@PathVariable String id, String name, String p_n, String email) {

        System.out.println(id);
        System.out.println(name);
        System.out.println(p_n);
        System.out.println(email);
    }
}