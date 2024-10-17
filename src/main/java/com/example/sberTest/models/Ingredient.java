package com.example.sberTest.models;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Ingredient")
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "measureUnit")
    private String measureUnit;
    @Column(name = "description")
    private String description;

    public Ingredient() {
    }

    public Ingredient(Integer id, String name, Integer quantity, String measureUnit, String description) {
        this.id = id;
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
