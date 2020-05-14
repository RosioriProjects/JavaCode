package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Recipes;
import com.lastchance.last_chance.repositories.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RecipesService {

    private RecipesRepository recipiesRepository;

    @Autowired

    public RecipesService(RecipesRepository recipiesRepository) {
        this.recipiesRepository = recipiesRepository;
    }

    public ArrayList<Recipes> getAllRecipes(){
        return recipiesRepository.findAll();
    }

    public Recipes addRecipe(Recipes recipe){
        return recipiesRepository.save(recipe);
    }

}

