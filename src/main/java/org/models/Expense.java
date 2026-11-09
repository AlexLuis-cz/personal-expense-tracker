package org.models;

public class Expense {

    private String description;
    private Category category;
    private double value;

    public Expense(String description, Category category, double value) {
        this.description = description;
        this.category = category;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
