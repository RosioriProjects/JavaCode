package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Drops;
import com.lastchance.last_chance.services.DropsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drops")
public class DropsController {
    private DropsService dropsService;

    @Autowired
    public DropsController(DropsService dropsService) {
        this.dropsService = dropsService;
    }

    @GetMapping("get")
    public List<Drops> getAllDrops(){
        return dropsService.getAllDrops();
    }

    @PostMapping("add")
    public Drops addDrop(@RequestBody Drops drop){
        return dropsService.addDrop(drop);
    }
}
