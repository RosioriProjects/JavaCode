package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Buildings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface BuildingsRepository extends JpaRepository<Buildings,Integer> {

    ArrayList<Buildings> findAll();
}
