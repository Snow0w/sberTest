package com.example.sberTest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "RecipeIngredient")
@Table(name = "recipeingredient")
public class RecipeIngredient {

    @EmbeddedId
    private RecipeIngredientId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("recipeId")
    private Recipe recipe;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("ingredientId")
    private Ingredient ingredient;

    @Column(name = "quantity")
    private Integer quantity;

    private RecipeIngredient() {}

    public RecipeIngredient(Recipe recipe, Ingredient ingredient, Integer quantity) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public RecipeIngredientId getId() {
        return id;
    }

    public void setId(RecipeIngredientId id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return Objects.equals(getRecipe(), that.getRecipe()) && Objects.equals(getIngredient(), that.getIngredient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipe(), getIngredient());
    }
}
