package org.models;

import org.repository.ExpenseRepository;

public class User {

    private ExpenseRepository expenseRepository;
    private ExpenseMeter expenseMeter;
    private double limitMonth;
    private final double originalLimit;

    public User(double limitMonth) {
        this.limitMonth = limitMonth;
        this.originalLimit = limitMonth;
    }

    //Getters
    public ExpenseRepository getExpenseRepository() {
        return expenseRepository;
    }

    public double getLimitMonth() {
        return limitMonth;
    }

    public ExpenseMeter getExpenseMeter() {
        if (expenseMeter == null) {
            expenseMeter = ExpenseMeter.SAVE;
        }
        return expenseMeter;
    }

    public double getOriginalLimit() {
        return originalLimit;
    }

    //Setters
    public void setExpenseRepository(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void setLimitMonth(double limitMonth) {
        this.limitMonth = limitMonth;

        if (this.limitMonth <= 0) {
            this.expenseMeter = ExpenseMeter.DANGER;
        } else if (this.limitMonth <= originalLimit / 2) {
            this.expenseMeter = ExpenseMeter.ALERT;
        } else {
            this.expenseMeter = ExpenseMeter.SAVE;
        }
    }

    @Override
    public String toString() {
        return String.format("---------------------%n" +
                "Limit alert:%s %n" +
                "Limit:%.2f%n" +
                "Total spent:%.2f%n" +
                "---------------------%n", this.getExpenseMeter(), this.limitMonth, (this.originalLimit - this.limitMonth));
    }
}
