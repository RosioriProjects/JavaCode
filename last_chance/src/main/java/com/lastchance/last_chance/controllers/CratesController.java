package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Crates;
import com.lastchance.last_chance.services.CratesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crates")
public class CratesController {
    private CratesService cratesService;

    @Autowired
    public CratesController(CratesService cratesService) {
        this.cratesService = cratesService;
    }

    @GetMapping("get")
    public List<Crates> getAllCrates(){
        return cratesService.getAllCrates();
    }

    @PostMapping("add")
    public Crates addCrate(@RequestBody Crates crate){
        return cratesService.addCrate(crate);
    }
}
