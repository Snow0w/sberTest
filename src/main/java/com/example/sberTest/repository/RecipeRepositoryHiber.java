package com.example.sberTest.repository;

import com.example.sberTest.models.Recipe;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jdbc.repository.query.Query;

public interface RecipeRepositoryHiber extends CrudRepository<Recipe,Integer> {

    @Query("SELECT r FROM Recipe r LEFT JOIN FETCH r.ingredients WHERE r.id = :id")
//    @Query(
//            "select recipe.name as name," +
//                    "recipe.duration as duration," +
//                    "recipe.description as description," +
//                    "ingredient.name as ingName," +
//                    "quantity, measureUnit," +
//                    "ingredient.description as ingDescription " +
//                    "from recipe " +
//                    "inner join recipeingredient " +
//                    "on recipe.id = recipeingredient.recipe_id " +
//                    "inner join ingredient " +
//                    "on ingredient.id = recipeingredient.ingredient_id " +
//                    "where recipe.id = :id"
//    )
//    @EntityGraph(attributePaths = {"ingredients", "ingredients.ingredient"})
//    Recipe findRecipeById(Integer id);
    Recipe findRecipeById(@Param("id") Integer id);
}

