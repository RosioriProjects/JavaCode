package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Maps;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface MapsRepository extends JpaRepository<Maps,Integer> {

    ArrayList<Maps> findAll();

}
