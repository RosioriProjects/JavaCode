package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Existent_Buildings;
import com.lastchance.last_chance.services.Existent_BuildingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/existent_buildings")
public class Existent_BuildingsController {
    private Existent_BuildingsService existent_buildingsService;

    @Autowired
    public Existent_BuildingsController(Existent_BuildingsService existent_buildingsService) {
        this.existent_buildingsService = existent_buildingsService;
    }

    @GetMapping("get")
    public List<Existent_Buildings> getAllExistent_Buildings(){
        return existent_buildingsService.getAllExistent_Buildings();
    }

    @PostMapping("add")
    public Existent_Buildings addExistent_Building(@RequestBody Existent_Buildings existent_building){
        return existent_buildingsService.addExistent_Building(existent_building);
    }
}

/* dsadsa */
//