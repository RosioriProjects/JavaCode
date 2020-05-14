package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Maps;
import com.lastchance.last_chance.services.MapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maps")
public class MapsController {
    private MapsService mapsService;

    @Autowired
    public MapsController(MapsService mapsService) {
        this.mapsService = mapsService;
    }

    @GetMapping("get")
    public List<Maps> getAllMaps(){
        return mapsService.getAllMaps();
    }

    @PostMapping("add")
    public Maps addMap(@RequestBody Maps map){
        return mapsService.addMap(map);
    }
}
