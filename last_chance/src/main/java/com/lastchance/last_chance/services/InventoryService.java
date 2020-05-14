package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Inventory;
import com.lastchance.last_chance.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InventoryService {

    private InventoryRepository inventoryRepository;

    @Autowired

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public ArrayList<Inventory> getAllInventory(){
        return inventoryRepository.findAll();
    }

    public Inventory addInventory(Inventory Inventory){
        return inventoryRepository.save(Inventory);
    }
}
