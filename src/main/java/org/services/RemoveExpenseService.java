package org.services;

import org.models.RemoveExpense;
import org.models.User;
import org.utils.InputUtils;
import org.view.RemoveTxt;

public class RemoveExpenseService implements RemoveExpense {

    @Override
    public void removeExpense(User user) {
        user.getExpenseRepository().listExpenses(user);
        System.out.print(RemoveTxt.removeInfoTxt());

        System.out.print("Number:");
        int number = InputUtils.returnInt();

        user.getExpenseRepository().removeExpenseForIndex(number - 1, user);
    }
}
