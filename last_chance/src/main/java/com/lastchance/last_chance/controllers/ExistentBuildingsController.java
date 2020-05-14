package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.ExistentBuildings;
import com.lastchance.last_chance.services.ExistentBuildingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/existent_buildings")
public class ExistentBuildingsController {
    private ExistentBuildingsService existent_buildingsService;

    @Autowired
    public ExistentBuildingsController(ExistentBuildingsService existent_buildingsService) {
        this.existent_buildingsService = existent_buildingsService;
    }

    @GetMapping("get")
    public List<ExistentBuildings> getAllExistent_Buildings(){
        return existent_buildingsService.getAllExistent_Buildings();
    }

    @PostMapping("add")
    public ExistentBuildings addExistent_Building(@RequestBody ExistentBuildings existent_building){
        return existent_buildingsService.addExistent_Building(existent_building);
    }
}

/* dsadsa */
//