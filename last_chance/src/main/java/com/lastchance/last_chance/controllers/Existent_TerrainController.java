package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Existent_Terrain;
import com.lastchance.last_chance.services.Existent_TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/existent_terrain")
public class Existent_TerrainController {
    private Existent_TerrainService existent_terrainService;

    @Autowired
    public Existent_TerrainController(Existent_TerrainService existent_terrainService) {
        this.existent_terrainService = existent_terrainService;
    }

    @GetMapping("get")
    public List<Existent_Terrain> getAllExistent_Terrain(){
        return existent_terrainService.getAllExistent_Terrains();
    }

    @PostMapping("add")
    public Existent_Terrain addExistent_Terrain(@RequestBody Existent_Terrain existent_terrain){
        return existent_terrainService.addExistent_Terrain(existent_terrain);
    }
}
