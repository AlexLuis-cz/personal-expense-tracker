package org.models;

import java.time.LocalDate;

public class Expense {
    private String description;
    private String category;
    private double value;
    private final LocalDate LOCAL_DATE;

    public Expense(String description, String category, double value, LocalDate LOCAL_DATE) {
        this.description = description;
        this.category = category;
        this.value = value;
        this.LOCAL_DATE = LOCAL_DATE;
    }

    //Getters
    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getLOCAL_DATE() {
        return LOCAL_DATE;
    }

    //Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
