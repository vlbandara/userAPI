package com.aggrandizer.userAPI.controller;

import com.aggrandizer.userAPI.model.User;
import com.aggrandizer.userAPI.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAPIController {
    public UserAPIController(UserService userService) {
        this.userService = userService;
    }

    UserService userService;


    @GetMapping("{id}")
    public User getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        userService.createUser(user);
        return "User created successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "User updated successfully";
    }

    @DeleteMapping("{id}")
    public String deleteUser(String id){
        userService.deleteUser(id);
        return "User deleted successfully";
    }


}
