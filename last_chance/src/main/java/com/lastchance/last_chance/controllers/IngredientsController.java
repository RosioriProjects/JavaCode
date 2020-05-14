package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Ingredients;
import com.lastchance.last_chance.services.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {
    private IngredientsService ingredientsService;

    @Autowired
    public IngredientsController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @GetMapping("get")
    public List<Ingredients> getAllIngredients(){
        return ingredientsService.getAllIngredients();
    }

    @PostMapping("add")
    public Ingredients addIngredient(@RequestBody Ingredients ingredient){
        return ingredientsService.addIngredient(ingredient);
    }
}
