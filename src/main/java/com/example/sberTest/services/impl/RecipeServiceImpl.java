package com.example.sberTest.services.impl;

import com.example.sberTest.models.Recipe;
import com.example.sberTest.repository.RecipeRepositoryHiber;
import com.example.sberTest.services.RecipeService;
import org.springframework.stereotype.Service;


@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepositoryHiber recipeRepositoryHiber;

    public RecipeServiceImpl(RecipeRepositoryHiber recipeRepositoryHiber) {
        this.recipeRepositoryHiber = recipeRepositoryHiber;
    }

    @Override
    public Recipe getRecipeById(int id) {
        return recipeRepositoryHiber.findRecipeById(id);
    }

}
