package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.StoredItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface StoredItemsRepository extends JpaRepository<StoredItems,Integer> {

    ArrayList<StoredItems> findAll();

}
