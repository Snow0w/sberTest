package com.example.sberTest.controllers;

import com.example.sberTest.models.Recipe;
import com.example.sberTest.services.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable int id) {
        Recipe recipe = recipeService.getRecipeById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(recipe);
    }

//    @GetMapping("/get/all")
//    public List<Recipe> getAllRecipes() {
//        return recipeService.getAllRecipes();
//    }

}
