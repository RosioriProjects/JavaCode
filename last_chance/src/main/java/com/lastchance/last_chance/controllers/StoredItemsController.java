package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.StoredItems;
import com.lastchance.last_chance.services.StoredItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stored_items")
public class StoredItemsController {
    private StoredItemsService stored_itemsService;

    @Autowired
    public StoredItemsController(StoredItemsService stored_itemsService) {
        this.stored_itemsService = stored_itemsService;
    }

    @GetMapping("get")
    public List<StoredItems> getAllStored_Items(){
        return stored_itemsService.getAllStored_Items();
    }

    @PostMapping("add")
    public StoredItems addStored_Item(@RequestBody StoredItems stored_item){
        return stored_itemsService.addStored_Item(stored_item);
    }
}
