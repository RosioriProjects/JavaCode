package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Existent_Mobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface Existent_MobsRepository extends JpaRepository<Existent_Mobs,Integer> {

    ArrayList<Existent_Mobs> findAll();

}
