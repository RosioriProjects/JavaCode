package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.ExistentItems;
import com.lastchance.last_chance.repositories.ExistentItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExistentItemsService {
    private ExistentItemsRepository existent_ItemsRepository;

    @Autowired
    public ExistentItemsService(ExistentItemsRepository existent_itemsRepository){
        this.existent_ItemsRepository = existent_itemsRepository;
    }

    public ArrayList<ExistentItems> getAllExistent_Items(){
        return new ArrayList<>(existent_ItemsRepository.findAll());
    }

    public ExistentItems addExistent_Item(ExistentItems existent_item){
        return existent_ItemsRepository.save(existent_item);
    }

}
