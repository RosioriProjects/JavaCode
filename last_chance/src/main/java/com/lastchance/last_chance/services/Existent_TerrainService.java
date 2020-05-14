package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Existent_Terrain;
import com.lastchance.last_chance.repositories.Existent_TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Existent_TerrainService {

    private Existent_TerrainRepository existent_terrainRepository;

    @Autowired
    public Existent_TerrainService(Existent_TerrainRepository existent_terrainRepository){
        this.existent_terrainRepository = existent_terrainRepository;
    }

    public ArrayList<Existent_Terrain> getAllExistent_Terrains(){
        return existent_terrainRepository.findAll();
    }

    public Existent_Terrain addExistent_Terrain(Existent_Terrain existent_terrain){
        return existent_terrainRepository.save(existent_terrain);
    }
}
