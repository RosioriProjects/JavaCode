package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.User;
import com.lastchance.last_chance.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ArrayList<User> getAllUsers(){
         return userRepository.findAll();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }
}
