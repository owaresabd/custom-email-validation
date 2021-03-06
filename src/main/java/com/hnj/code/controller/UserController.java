package com.hnj.code.controller;

import com.hnj.code.model.User;
import com.hnj.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
//@Validated
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User saveUser(@Valid @RequestBody User user){
        return userService.saveUser(user);
    }
}
