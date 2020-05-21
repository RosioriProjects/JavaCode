package com.lastchance.last_chance.services;

import com.lastchance.last_chance.dtos.LoginRequest;
import com.lastchance.last_chance.models.User;
import com.lastchance.last_chance.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Object> login(LoginRequest user) {
        String username = user.getUsername();
        String password = user.getPassword();
        Optional<User> existingUser = userRepository.findByUsernameAndPassword(username,password);

        if(existingUser.isPresent()){
            return new ResponseEntity<>(existingUser.get() , HttpStatus.OK);
        }
        return new ResponseEntity<>(user , HttpStatus.NOT_FOUND);
    }

    public ArrayList<User> getAllUsers(){
         return userRepository.findAll();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }
}
