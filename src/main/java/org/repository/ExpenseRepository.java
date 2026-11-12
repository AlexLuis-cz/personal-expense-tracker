package org.repository;

import org.models.Expense;
import org.models.User;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {
    private List<Expense> expenses = new ArrayList<Expense>();
    private Expense biggestExpense;

    //Setters
    public void setBiggestExpense(Expense biggestExpense) {
        this.biggestExpense = biggestExpense;
    }

    public void addExpense(Expense expense) {
        if (this.expenses.isEmpty()) {
            this.biggestExpense = expense;
        }

        if (expense.getValue() > biggestExpense.getValue()) {
            this.biggestExpense = expense;
        }

        this.expenses.add(expense);
    }

    //Getters
    public List<Expense> getExpenses() {
        return expenses;
    }

    public void listExpenses(User user) {
        int contador = 0;
        System.out.println("-------");
        System.out.println("Expense:");
        for (Expense expense : user.getExpenseRepository().getExpenses()) {
            System.out.println(++contador + ". " + expense);
        }

        System.out.println("-------");
        if (user.getExpenseRepository().biggestExpense == null) return;

        System.out.printf("Most expensive expense:%s%n" +
                        "Category:%s%n" +
                        "value:%.2f%n" +
                        "Date:%s%n"
                , user.getExpenseRepository().biggestExpense.getDescription(),
                user.getExpenseRepository().biggestExpense.getCategory(), user.getExpenseRepository().biggestExpense.getValue(),
                user.getExpenseRepository().biggestExpense.getLOCAL_DATE());
        System.out.println("-------");
    }

    public void removeExpenseForIndex(int index, User user) {
        user.setLimitMonth(user.getLimitMonth() + this.expenses.get(index).getValue());

        if (expenses.size() == 1) {
            biggestExpense = null;
        }

        this.expenses.remove(index);
        if (!expenses.isEmpty()) {
            this.biggestExpense = expenses.get(0);

            for (Expense expense : getExpenses()) {
                if (expense.getValue() > biggestExpense.getValue()) {
                    biggestExpense = expense;
                }
            }
        }
    }
}
