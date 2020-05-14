package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Existent_Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface Existent_TerrainRepository extends JpaRepository<Existent_Terrain,Integer> {

    ArrayList<Existent_Terrain> findAll();

}
