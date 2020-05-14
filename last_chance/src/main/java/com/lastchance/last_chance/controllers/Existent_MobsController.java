package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Existent_Mobs;
import com.lastchance.last_chance.services.Existent_MobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/existent_mobs")
public class Existent_MobsController {

    private Existent_MobsService existent_mobsService;

    @Autowired
    public Existent_MobsController(Existent_MobsService existent_mobsService) {
        this.existent_mobsService = existent_mobsService;
    }

    @GetMapping("get")
    public ArrayList<Existent_Mobs> getAllExistent_Mobs(){
        return existent_mobsService.getAllExistent_Mobs();
    }

    @PostMapping("add")
    public Existent_Mobs addExistent_Mob(@RequestBody Existent_Mobs existent_mob){
        return existent_mobsService.addExistent_Mob(existent_mob);
    }
}
