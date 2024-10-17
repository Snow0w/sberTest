package com.example.sberTest.services.impl;

import com.example.sberTest.exceptions.RecipeNotFoundException;
import com.example.sberTest.models.Ingredient;
import com.example.sberTest.models.Recipe;
import com.example.sberTest.models.RecipeIngredientRaw;
import com.example.sberTest.repository.RecipeRepository;
import com.example.sberTest.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Recipe getRecipeById(int id) {
        List<RecipeIngredientRaw> queryList = recipeRepository.getRecipeById(id);
        if (queryList.isEmpty())
            throw new RecipeNotFoundException();
        List<Ingredient> ingredients = new ArrayList<>();
        Recipe recipe = new Recipe();
        recipe.setName(queryList.getFirst().getName());
        recipe.setDuration(queryList.getFirst().getDuration());
        recipe.setDescription(queryList.getFirst().getDescription());
        for (var row : queryList){
            System.out.println(row);
            Ingredient ing = new Ingredient();
            ing.setName(row.getIngname());
            ing.setMeasureUnit(row.getMeasureunit());
            ing.setQuantity(row.getQuantity());
            ing.setDescription(row.getIngdescription());
            ingredients.add(ing);
        }
        recipe.setIngredients(ingredients);
        return recipe;
    }

//    @Override
//    public List<Recipe> getAllRecipes() {
//        return List.of();
//    }
}
