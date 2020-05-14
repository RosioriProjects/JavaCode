package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.ExistentTerrain;
import com.lastchance.last_chance.services.ExistentTerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/existent_terrain")
public class ExistentTerrainController {
    private ExistentTerrainService existent_terrainService;

    @Autowired
    public ExistentTerrainController(ExistentTerrainService existent_terrainService) {
        this.existent_terrainService = existent_terrainService;
    }

    @GetMapping("get")
    public List<ExistentTerrain> getAllExistent_Terrain(){
        return existent_terrainService.getAllExistent_Terrains();
    }

    @PostMapping("add")
    public ExistentTerrain addExistent_Terrain(@RequestBody ExistentTerrain existent_terrain){
        return existent_terrainService.addExistent_Terrain(existent_terrain);
    }
}
