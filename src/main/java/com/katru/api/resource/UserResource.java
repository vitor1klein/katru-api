package com.katru.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/users")
public class UserResource {

    @GetMapping()
    public String getMethodName() {
        return "mudei";
    }
    
}
