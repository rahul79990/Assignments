package com.advums.userManagementSystem.controller;

import com.advums.userManagementSystem.model.UserEntity;
import com.advums.userManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("users")
    List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("getUserById/{userId}")
    public UserEntity getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
    @PostMapping("users")
    public String addUsers(@Valid @RequestBody List<UserEntity> users){
        return userService.addUsers(users);
    }

    @PostMapping("user")
    public String addUser(@Valid @RequestBody UserEntity user){
       return userService.addUser(user);
    }

    @PutMapping("/updateUserInfo/{userId}")
    public String updateUserInfo(@PathVariable Integer userId, @RequestBody UserEntity user) {
        userService.updateUserInfo(userId, user);
        return "User Updated for user id :" + userId;
    }
    @DeleteMapping("user/{userId}")
    public String deleteUserInfo(@PathVariable Integer userId){
        return userService.removeInfo(userId);
    }

}