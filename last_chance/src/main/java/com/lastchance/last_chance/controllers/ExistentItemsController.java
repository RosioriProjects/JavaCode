package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.ExistentItems;
import com.lastchance.last_chance.services.ExistentItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/existentitems")
public class ExistentItemsController {

    private ExistentItemsService existent_itemsService;

    @Autowired
    public ExistentItemsController(ExistentItemsService existent_itemsService) {
        this.existent_itemsService = existent_itemsService;
    }

    @GetMapping("get")
    public ArrayList<ExistentItems> getAllExistent_Items(){
        return existent_itemsService.getAllExistent_Items();
    }

    @PostMapping("add")
    public ExistentItems addExistent_Item(@RequestBody ExistentItems existent_item){
        return existent_itemsService.addExistent_Item(existent_item);
    }
}
