package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Inventory;
import com.lastchance.last_chance.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("get")
    public List<Inventory> getAllInventory(){
        return inventoryService.getAllInventory();
    }

    @PostMapping("add")
    public Inventory addInventory(@RequestBody Inventory inventory){
        return inventoryService.addInventory(inventory);
    }
}
