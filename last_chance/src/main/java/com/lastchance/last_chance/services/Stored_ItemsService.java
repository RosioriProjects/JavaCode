package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Stored_Items;
import com.lastchance.last_chance.repositories.Stored_ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Stored_ItemsService{

    private Stored_ItemsRepository stored_itemsRepository;

    @Autowired
    public Stored_ItemsService(Stored_ItemsRepository stored_itemsRepository) {
        this.stored_itemsRepository = stored_itemsRepository;
    }

    public ArrayList<Stored_Items> getAllStored_Items(){
        return stored_itemsRepository.findAll();
    }

    public Stored_Items addStored_Item(Stored_Items stored_item){
        return stored_itemsRepository.save(stored_item);
    }
}
