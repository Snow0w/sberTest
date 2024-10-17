package com.example.sberTest.models;

public class RecipeIngredientRaw {
    private String name;
    private Integer duration;
    private String description;
    private String ingname;
    private Integer quantity;
    private String ingdescription;
    private String measureunit;


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

    public String getIngname() {
        return ingname;
    }

    public void setIngname(String ingname) {
        this.ingname = ingname;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getIngdescription() {
        return ingdescription;
    }

    public void setIngdescription(String ingdescription) {
        this.ingdescription = ingdescription;
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
                ", ingName='" + ingname + '\'' +
                ", quantity=" + quantity +
                ", measureUnit=" + measureunit +
                ", ingDescription='" + ingdescription + '\'' +
                '}';
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    public String getMeasureunit() {return measureunit;}
}
