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
        expenseMeter = ExpenseMeter.SAVE;
    }

    //Getters
    public ExpenseRepository getExpenseRepository() {
        return expenseRepository;
    }

    public double getLimitMonth() {
        return limitMonth;
    }

    public ExpenseMeter getExpenseMeter() {
        return expenseMeter;
    }

    //Setters
    public void setExpenseRepository(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void reduceLimitMonth(double expenseValue) {
        this.limitMonth -= expenseValue;
        this.expenseMeter = ExpenseMeter.value(this.limitMonth, originalLimit);
    }

    public void expandLimith(double expenseValueRemoved) {
        this.limitMonth += expenseValueRemoved;
        this.expenseMeter = ExpenseMeter.value(this.limitMonth, originalLimit);
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
