package com.lastchance.last_chance.repositories;


import com.lastchance.last_chance.models.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ItemsRepository extends JpaRepository<Items,Integer> {

    ArrayList<Items> findAll();

}
