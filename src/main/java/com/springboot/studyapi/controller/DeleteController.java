package com.springboot.studyapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete")
public class DeleteController {

    //http://localhost:8080/api/v1/delete/{userid}
    //http://localhost:8080/api/v1/delete/123?account=user01
    @DeleteMapping("/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {

        System.out.println(userId);
        System.out.println(account);
    }
}