package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.dtos.LoginRequest;
import com.lastchance.last_chance.dtos.LogoutRequest;
import com.lastchance.last_chance.dtos.RegisterRequest;
import com.lastchance.last_chance.models.User;
import com.lastchance.last_chance.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody LoginRequest request){
        return userService.login(request);
    }

    @PostMapping("/logout")
    public  ResponseEntity<Object> logout(@RequestBody LogoutRequest request){ return userService.logout(request); }

    @PostMapping("/register")
    public  ResponseEntity<Object> register(@RequestBody RegisterRequest request){ return userService.register(request); }
}
