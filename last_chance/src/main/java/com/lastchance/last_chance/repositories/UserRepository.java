package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    ArrayList<User> findAll();


    Optional<User> findByUsername(String username);
    Optional<User> findByUsernameAndPassword(String username , String password);
    @Transactional
    @Modifying
    @Query("update user u set u.longitude=?1, u.latitude=?2 where u.username=?3")
    void setUserCoordById(Integer longitude, Integer latitude, String username);

    @Override
    <S extends User> S save(S s);
}
