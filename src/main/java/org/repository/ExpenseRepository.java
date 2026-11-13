package org.repository;

import org.models.Expense;
import org.models.User;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {
    private final List<Expense> expenses = new ArrayList<Expense>();

    //Setters

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    //Getters
    public List<Expense> getExpenses() {
        return expenses;
    }

    public void listExpenses(User user) {
        if (user.getExpenseRepository().expenses.isEmpty()) {
            System.out.println("No expense registered.");
            return;
        }

        int counter = 0;
        Expense mostExpense = user.getExpenseRepository().expenses.get(0);

        System.out.println("-------");
        System.out.println("Expense:");
        for (Expense expense : user.getExpenseRepository().getExpenses()) {
            System.out.println(++counter + ". " + expense);

            if (expense.getValue() > mostExpense.getValue()) {
                mostExpense = expense;
            }
        }
        System.out.println("Most expense");
        System.out.println(mostExpense);
        System.out.println("-------");
    }

    public void removeExpenseForIndex(int index, User user) {
        user.expandLimith(this.expenses.get(index).getValue());
        this.expenses.remove(index);
    }
}