package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Existent_Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface Existent_ItemsRepository extends JpaRepository<Existent_Items,Integer> {

    ArrayList<Existent_Items> findAll();

}
