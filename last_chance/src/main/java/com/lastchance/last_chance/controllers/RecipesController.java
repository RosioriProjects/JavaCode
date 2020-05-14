package com.lastchance.last_chance.controllers;

import com.lastchance.last_chance.models.Recipes;
import com.lastchance.last_chance.services.RecipesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipesController {
    private RecipesService recipesService;

    @Autowired
    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @GetMapping("get")
    public List<Recipes> getAllRecipes(){
        return recipesService.getAllRecipes();
    }

    @PostMapping("add")
    public Recipes addRecipe(@RequestBody Recipes recipe){
        return recipesService.addRecipe(recipe);
    }
}
