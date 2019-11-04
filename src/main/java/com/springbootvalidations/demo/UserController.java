package com.springbootvalidations.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping(value = "/user")
    public User postUser(@Valid @RequestBody User user){
        return user;
    }
}
