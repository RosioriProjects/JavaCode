package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.StoredItems;
import com.lastchance.last_chance.repositories.StoredItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StoredItemsService {

    private StoredItemsRepository stored_itemsRepository;

    @Autowired
    public StoredItemsService(StoredItemsRepository stored_itemsRepository) {
        this.stored_itemsRepository = stored_itemsRepository;
    }

    public ArrayList<StoredItems> getAllStored_Items(){
        return stored_itemsRepository.findAll();
    }

    public StoredItems addStored_Item(StoredItems stored_item){
        return stored_itemsRepository.save(stored_item);
    }
}
