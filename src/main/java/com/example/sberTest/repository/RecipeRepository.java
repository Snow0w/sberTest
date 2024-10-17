package com.example.sberTest.repository;

import com.example.sberTest.models.Recipe;
import com.example.sberTest.models.RecipeIngredientRaw;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    @Query(
            "select recipe.name as name," +
            "recipe.duration as duration," +
            "recipe.description as description," +
            "ingredient.name as ingName," +
            "quantity, measureUnit," +
            "ingredient.description as ingDescription " +
            "from recipe " +
            "inner join recipeingredient " +
            "on recipe.id = recipeingredient.recipe_id " +
            "inner join ingredient " +
            "on ingredient.id = recipeingredient.ingredient_id " +
            "where recipe.id = :id"
    )
    public List<RecipeIngredientRaw> getRecipeById(@Param("id") Integer id);

}
