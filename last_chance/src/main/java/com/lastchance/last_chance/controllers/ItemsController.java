package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Items;
import com.lastchance.last_chance.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
    private ItemsService itemsService;

    @Autowired
    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping("get")
    public List<Items> getAllItems(){
        return itemsService.getAllItems();
    }

    @PostMapping("add")
    public Items addItem(@RequestBody Items item){
        return itemsService.addItem(item);
    }
}
