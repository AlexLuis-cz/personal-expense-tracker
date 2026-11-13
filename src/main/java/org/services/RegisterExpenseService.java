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
        InputUtils.returnString();

        if (!description.isBlank() && value > 0) {
            //Expense registration with (Description, Category, Value, Monthly Limit, Current Data)
            Expense expense = new Expense(description, category, value, LocalDate.now());
            user.reduceLimitMonth(value);

            user.getExpenseRepository().addExpense(expense);
            return;
        }

        System.out.println("It is not possible to enter numbers equal to or below zero.");
        register(user);
    }
}