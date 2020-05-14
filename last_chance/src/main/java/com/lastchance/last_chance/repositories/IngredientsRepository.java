package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface IngredientsRepository extends JpaRepository<Ingredients,Integer> {

    ArrayList<Ingredients> findAll();

}
