package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Items;
import com.lastchance.last_chance.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemsService {

    private ItemsRepository itemsRepository;

    @Autowired

    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public ArrayList<Items> getAllItems(){
        return itemsRepository.findAll();
    }

    public Items addItem(Items items){
        return itemsRepository.save(items);
    }
}