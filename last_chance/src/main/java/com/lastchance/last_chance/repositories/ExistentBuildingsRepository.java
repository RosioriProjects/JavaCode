package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.ExistentBuildings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ExistentBuildingsRepository extends JpaRepository<ExistentBuildings,Integer> {

    ArrayList<ExistentBuildings> findAll();

}
