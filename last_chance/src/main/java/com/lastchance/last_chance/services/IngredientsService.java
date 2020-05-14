package com.lastchance.last_chance.services;

import com.lastchance.last_chance.models.Ingredients;
import com.lastchance.last_chance.repositories.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IngredientsService {

    private IngredientsRepository ingredientsRepository;

    @Autowired

    public IngredientsService(IngredientsRepository ingredientsRepository) {
        this.ingredientsRepository = ingredientsRepository;
    }

    public ArrayList<Ingredients> getAllIngredients(){
        return ingredientsRepository.findAll();
    }

    public Ingredients addIngredient(Ingredients ingredients){
        return ingredientsRepository.save(ingredients);
    }
}
