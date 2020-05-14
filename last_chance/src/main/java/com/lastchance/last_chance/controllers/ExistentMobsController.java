package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.ExistentMobs;
import com.lastchance.last_chance.services.ExistentMobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/existent_mobs")
public class ExistentMobsController {

    private ExistentMobsService existent_mobsService;

    @Autowired
    public ExistentMobsController(ExistentMobsService existent_mobsService) {
        this.existent_mobsService = existent_mobsService;
    }

    @GetMapping("get")
    public ArrayList<ExistentMobs> getAllExistent_Mobs(){
        return existent_mobsService.getAllExistent_Mobs();
    }

    @PostMapping("add")
    public ExistentMobs addExistent_Mob(@RequestBody ExistentMobs existent_mob){
        return existent_mobsService.addExistent_Mob(existent_mob);
    }
}
