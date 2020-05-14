package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Mobs;
import com.lastchance.last_chance.services.MobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobs")
public class MobsController {
    private MobsService mobsService;

    @Autowired
    public MobsController(MobsService mobsService) {
        this.mobsService = mobsService;
    }

    @GetMapping("get")
    public List<Mobs> getAllMobs(){
        return mobsService.getAllMobs();
    }

    @PostMapping("add")
    public Mobs addMob(@RequestBody Mobs mob){
        return mobsService.addMob(mob);
    }
}
