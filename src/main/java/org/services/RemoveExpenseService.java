package org.services;

import org.models.RemoveExpense;
import org.models.User;
import org.utils.InputUtils;
import org.view.RemoveTxt;

public class RemoveExpenseService implements RemoveExpense {

    @Override
    public void removeExpense(User user) {
        if (user.getExpenseRepository().getExpenses().isEmpty()) {
            System.out.println("No expenses registered");
            return;
        }

        user.getExpenseRepository().listExpenses(user);
        System.out.print(RemoveTxt.removeInfoTxt());
        int number = InputUtils.returnInt();

        if (number - 1 >= user.getExpenseRepository().getExpenses().size() || number < 0 || number == 0) {
            System.out.println("invalid value");
            return;
        }

        //removendo
        System.out.printf("Expense:%s removed%n", user.getExpenseRepository().getExpenses().get(number - 1).getDescription());
        user.getExpenseRepository().removeExpenseForIndex(number - 1, user);
    }
}