package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Terrain;
import com.lastchance.last_chance.repositories.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TerrainService {

    private TerrainRepository terrainRepository;

    @Autowired

    public TerrainService(TerrainRepository terrainRepository) {
        this.terrainRepository = terrainRepository;
    }

    public ArrayList<Terrain> getAllTerrain(){
        return terrainRepository.findAll();
    }

    public Terrain addTerrain(Terrain terrain){
        return terrainRepository.save(terrain);
    }
}

