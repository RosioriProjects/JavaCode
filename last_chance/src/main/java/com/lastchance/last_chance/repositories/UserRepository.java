package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface UserRepository extends JpaRepository<User, Integer> {

    ArrayList<User> findAll();
}
