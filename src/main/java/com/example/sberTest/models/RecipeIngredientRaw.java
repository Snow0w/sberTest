package com.example.sberTest.models;

public class RecipeIngredientRaw {
    private String name;
    private Integer duration;
    private String description;
    private String ingName;
    private Integer quantity;
    private Integer measureUnit;
    private String ingDescription;


    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngName() {
        return ingName;
    }

    public void setIngName(String ingName) {
        this.ingName = ingName;
    }

    public Integer getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(Integer measureUnit) {
        this.measureUnit = measureUnit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getIngDescription() {
        return ingDescription;
    }

    public void setIngDescription(String ingDescription) {
        this.ingDescription = ingDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RecipeIngredientRaw{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", ingName='" + ingName + '\'' +
                ", quantity=" + quantity +
                ", measureUnit=" + measureUnit +
                ", ingDescription='" + ingDescription + '\'' +
                '}';
    }
}
