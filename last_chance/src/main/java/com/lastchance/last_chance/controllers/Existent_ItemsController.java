package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Existent_Items;
import com.lastchance.last_chance.services.Existent_ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/existent_items")
public class Existent_ItemsController {

    private Existent_ItemsService existent_itemsService;

    @Autowired
    public Existent_ItemsController(Existent_ItemsService existent_itemsService) {
        this.existent_itemsService = existent_itemsService;
    }

    @GetMapping("get")
    public ArrayList<Existent_Items> getAllExistent_Items(){
        return existent_itemsService.getAllExistent_Items();
    }

    @PostMapping("add")
    public Existent_Items addExistent_Item(@RequestBody Existent_Items existent_item){
        return existent_itemsService.addExistent_Item(existent_item);
    }
}
