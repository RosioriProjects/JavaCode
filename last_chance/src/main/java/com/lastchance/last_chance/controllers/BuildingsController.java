package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Buildings;
import com.lastchance.last_chance.services.BuildingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buildings")
public class BuildingsController {
    private BuildingsService buildingsService;

    @Autowired
    public BuildingsController(BuildingsService buildingsService) {
        this.buildingsService = buildingsService;
    }

    @GetMapping("get")
    public List<Buildings> getAllBuildings(){
        return buildingsService.getAllBuildings();
    }

    @PostMapping("add")
    public Buildings addBuilding(@RequestBody Buildings building){
        return buildingsService.addBuilding(building);
    }
}
