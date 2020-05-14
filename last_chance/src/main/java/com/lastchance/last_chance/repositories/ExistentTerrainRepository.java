package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.ExistentTerrain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ExistentTerrainRepository extends JpaRepository<ExistentTerrain,Integer> {

    ArrayList<ExistentTerrain> findAll();

}
