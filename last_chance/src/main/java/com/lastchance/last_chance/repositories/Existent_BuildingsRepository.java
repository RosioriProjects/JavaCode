package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Existent_Buildings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface Existent_BuildingsRepository extends JpaRepository<Existent_Buildings,Integer> {

    ArrayList<Existent_Buildings> findAll();

}
