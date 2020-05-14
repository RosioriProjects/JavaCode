package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.ExistentMobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ExistentMobsRepository extends JpaRepository<ExistentMobs,Integer> {

    ArrayList<ExistentMobs> findAll();

}
