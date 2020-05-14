package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Stored_Items;
import com.lastchance.last_chance.services.Stored_ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stored_items")
public class Stored_ItemsController {
    private Stored_ItemsService stored_itemsService;

    @Autowired
    public Stored_ItemsController(Stored_ItemsService stored_itemsService) {
        this.stored_itemsService = stored_itemsService;
    }

    @GetMapping("get")
    public List<Stored_Items> getAllStored_Items(){
        return stored_itemsService.getAllStored_Items();
    }

    @PostMapping("add")
    public Stored_Items addStored_Item(@RequestBody Stored_Items stored_item){
        return stored_itemsService.addStored_Item(stored_item);
    }
}
