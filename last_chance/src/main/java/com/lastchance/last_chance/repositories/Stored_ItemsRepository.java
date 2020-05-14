package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Stored_Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface Stored_ItemsRepository extends JpaRepository<Stored_Items,Integer> {

    ArrayList<Stored_Items> findAll();

}
