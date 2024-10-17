package com.example.sberTest.models;

public class Ingredient {
    private String name;
    private Integer quantity;
    private String measureUnit;
    private String description;

    public Ingredient() {
    }

    public Ingredient(String name, Integer quantity, String measureUnit, String description) {
        this.name = name;
        this.quantity = quantity;
        this.measureUnit = measureUnit;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }
}
