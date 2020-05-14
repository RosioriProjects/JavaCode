package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.ExistentTerrain;
import com.lastchance.last_chance.repositories.ExistentTerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExistentTerrainService {

    private ExistentTerrainRepository existent_terrainRepository;

    @Autowired
    public ExistentTerrainService(ExistentTerrainRepository existent_terrainRepository){
        this.existent_terrainRepository = existent_terrainRepository;
    }

    public ArrayList<ExistentTerrain> getAllExistent_Terrains(){
        return existent_terrainRepository.findAll();
    }

    public ExistentTerrain addExistent_Terrain(ExistentTerrain existent_terrain){
        return existent_terrainRepository.save(existent_terrain);
    }
}
