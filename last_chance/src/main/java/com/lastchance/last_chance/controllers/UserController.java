package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.User;
import com.lastchance.last_chance.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("get")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
