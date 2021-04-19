package com.bannodi.userservice.controller;

import com.bannodi.userservice.model.Address;
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

    @PostMapping
    public String registerUser(@RequestBody User newUser) {
        return userService.registerUser(newUser);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("{userId}")
    public User getUser(@PathVariable long userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable long userId, @RequestBody User user) {
        return this.userService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable long userId) {
        this.userService.deleteUser(userId);
    }

    @GetMapping("/{userId}/addresses")
    public List<Address> getUserAddresses(@PathVariable long userId) {
        return userService.getUserAddresses(userId);
    }

    @PutMapping("/{addressId}")
    public void updateUserAddress(@PathVariable long addressId, Address address) {
        this.userService.updateUserAddress(addressId, address);
    }
}
