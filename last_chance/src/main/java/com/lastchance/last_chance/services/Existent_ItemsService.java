package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Existent_Items;
import com.lastchance.last_chance.repositories.Existent_ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Existent_ItemsService {
    private Existent_ItemsRepository existent_ItemsRepository;

    @Autowired
    public Existent_ItemsService(Existent_ItemsRepository existent_itemsRepository){
        this.existent_ItemsRepository = existent_itemsRepository;
    }

    public ArrayList<Existent_Items> getAllExistent_Items(){
        return existent_ItemsRepository.findAll();
    }

    public Existent_Items addExistent_Item(Existent_Items existent_item){
        return existent_ItemsRepository.save(existent_item);
    }

}
