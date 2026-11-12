package org.services;

import org.models.Expense;
import org.models.RegisterExpense;
import org.models.User;
import org.utils.InputUtils;

import java.time.LocalDate;

public class RegisterExpenseService implements RegisterExpense {

    @Override
    public void register(User user) {
        System.out.print("Description:");
        String description = InputUtils.returnString();

        System.out.print("Category:");
        String category = InputUtils.returnString();

        System.out.print("Value:");
        double value = InputUtils.returnDouble();

        while (value <= 0) {
            System.out.println("It is not possible to enter numbers equal to or below zero.");
            System.out.print("Value:");
            value = InputUtils.returnDouble();
        }

        //Expense registration with (Description, Category, Value, Monthly Limit, Current Data)
        Expense expense = new Expense(description, category, value, LocalDate.now());
        user.setLimitMonth(user.getLimitMonth() - expense.getValue());

        user.getExpenseRepository().addExpense(expense);
    }
}