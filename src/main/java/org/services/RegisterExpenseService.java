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
        category = category.substring(0, 1).toUpperCase() + category.substring(1);

        System.out.print("Value:");
        double value = InputUtils.returnDouble();

        //Expense registration with (Description, Category, Value, Monthly Limit, Current Data)
        Expense expense = new Expense(description, category, value, LocalDate.now());
        user.setLimitMonth(user.getLimitMonth() - expense.getValue());

        user.getExpenseRepository().setExpenses(expense);
    }
}