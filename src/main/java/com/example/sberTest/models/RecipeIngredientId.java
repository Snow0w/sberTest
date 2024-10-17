package com.example.sberTest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecipeIngredientId implements Serializable {

    @Column(name = "recipe_id")
    private Integer recipeId;

    @Column(name = "ingredient_id")
    private Integer ingredientId;

    private RecipeIngredientId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredientId that = (RecipeIngredientId) o;
        return Objects.equals(getRecipeId(), that.getRecipeId()) && Objects.equals(getIngredientId(), that.getIngredientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipeId(), getIngredientId());
    }

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public Integer getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Integer ingredientId) {
        this.ingredientId = ingredientId;
    }

    public RecipeIngredientId(Integer recipeId, Integer ingredientId) {
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
    }

}
