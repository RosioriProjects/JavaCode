package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    ArrayList<User> findAll();

    Optional<User> findByUsernameAndPassword(String username , String password);
}
