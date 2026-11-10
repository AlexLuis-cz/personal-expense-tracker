package org.repository;

import org.models.Expense;
import org.models.User;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {

    private List<Expense> expenses = new ArrayList<Expense>();

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(Expense expenses) {
        this.expenses.add(expenses);
    }

    public void listExpenses(User user) {
        int contador = 0;
        System.out.println("-------");
        System.out.println("Expense:");
        for (Expense expense : user.getExpenseRepository().getExpenses()) {
            System.out.printf("%d. %s %s R$ %.2f%n", ++contador, expense.getDescription(), expense.getCategory(), expense.getValue());
        }
        System.out.println("-------");

        System.out.printf("Limit alert:%s %n" +
                "Limit:%.2f%n" +
                "Total spent:%.2f%n", user.getExpenseMeter(), user.getLimitMonth(), (user.getOriginalLimit() - user.getLimitMonth()));
        System.out.println("-------");
    }
}
