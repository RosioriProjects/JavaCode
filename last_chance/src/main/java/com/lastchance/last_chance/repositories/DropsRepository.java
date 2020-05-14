package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Drops;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface DropsRepository extends JpaRepository<Drops,Integer>{

    ArrayList<Drops> findAll();
}
