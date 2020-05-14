package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface TerrainRepository extends JpaRepository<Terrain,Integer> {

    ArrayList<Terrain> findAll();

}
