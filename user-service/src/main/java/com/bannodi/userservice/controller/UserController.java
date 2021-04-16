package com.bannodi.userservice.controller;

import com.bannodi.userservice.model.User;
import com.bannodi.userservice.repository.UserRepository;
import com.bannodi.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void registerUser(@RequestBody User newUser) {
        userService.registerUser(newUser);
    }
}
