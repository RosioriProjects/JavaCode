package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Terrain;
import com.lastchance.last_chance.services.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terrain")
public class TerrainController {
    private TerrainService terrainService;

    @Autowired
    public TerrainController(TerrainService terrainService) {
        this.terrainService = terrainService;
    }

    @GetMapping("get")
    public List<Terrain> getAllTerrain(){
        return terrainService.getAllTerrain();
    }

    @PostMapping("add")
    public Terrain addTerrain(@RequestBody Terrain terrain){
        return terrainService.addTerrain(terrain);
    }
}
