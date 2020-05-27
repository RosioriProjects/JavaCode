package com.lastchance.last_chance.services;

import com.lastchance.last_chance.dtos.LoginRequest;
import com.lastchance.last_chance.dtos.LogoutRequest;
import com.lastchance.last_chance.dtos.RegisterRequest;
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

    public ResponseEntity<Object> register(RegisterRequest user){
        String username = user.getUsername();
        String password = user.getPassword();
        String nickname = user.getNickname();
        Optional<User> existingUser=userRepository.findByUsername(username);

        if(existingUser.isPresent()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        else {
            User u = new User();
            u.setUsername(username);
            u.setPassword(password);
            u.setNickname(nickname);
            u.setId_user(-2);
            u.setArmor(10);
            u.setAttack_value(15);
            u.setHp(20);
            u.setHp(10);
            u.setHunger(0);
            u.setLongitude(20);
            u.setLatitude(-144);
            u.setSickness(0);
            u.setSpeed(10);
            userRepository.save(u);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

    }

    public ResponseEntity<Object> logout(LogoutRequest user){
        String username=user.getUsername();
        int longitude=user.getLongitude();
        int latitude=user.getLatitude();
        Optional<User> existingUser=userRepository.findByUsername(username);

        if(existingUser.isPresent()){
            userRepository.setUserCoordById(longitude,latitude,username);
            return new ResponseEntity<>(existingUser.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
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
