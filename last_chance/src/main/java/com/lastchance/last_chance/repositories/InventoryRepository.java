package com.lastchance.last_chance.repositories;


import com.lastchance.last_chance.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;


public interface InventoryRepository extends JpaRepository<Inventory,Integer> {

    ArrayList<Inventory> findAll();

}
