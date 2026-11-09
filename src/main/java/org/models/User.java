package org.models;

import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Expense> expense;
    private double limitMonth;

    public User(String name, double limitMonth){
        this.name = name;
        this.limitMonth = limitMonth;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public double getLimitMonth() {
        return limitMonth;
    }


    public ArrayList<Expense> getExpense() {
        return expense;
    }

    //Setters
    public void setExpense(ArrayList<Expense> expense) {
        this.expense = expense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLimitMonth(double limitMonth) {
        this.limitMonth = limitMonth;
    }
}
