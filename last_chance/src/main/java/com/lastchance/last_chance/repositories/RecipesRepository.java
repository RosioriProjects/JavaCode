package com.lastchance.last_chance.repositories;

import com.lastchance.last_chance.models.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface RecipesRepository extends JpaRepository<Recipes,Integer> {

    ArrayList<Recipes> findAll();

}
