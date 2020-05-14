package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Mobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface MobsRepository extends JpaRepository<Mobs,Integer> {

    ArrayList<Mobs> findAll();

}
