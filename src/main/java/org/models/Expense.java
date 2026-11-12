package org.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expense {
    private String description;
    private String category;
    private double value;
    private final LocalDate LOCAL_DATE;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

    public String getLOCAL_DATE() {
        String dataFormat = formatter.format(this.LOCAL_DATE);
        return dataFormat;
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

    @Override
    public String toString() {
        return String.format("%s %s R$ %.2f %s", this.description, this.category, this.value, this.getLOCAL_DATE());
    }
}
