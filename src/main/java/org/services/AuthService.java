package org.services;

import org.models.User;
import org.repository.ExpenseRepository;
import org.utils.InputUtils;

public class AuthService {

    public User createAccount() {
        System.out.print("Enter the monthly limit:");
        double limitMonth = InputUtils.returnDouble();

        if (limitMonth <= 0) {
            System.out.println("Invalid value");
            createAccount();
        }

        User user = new User(limitMonth);
        ExpenseRepository expenseRepository = new ExpenseRepository();
        user.setExpenseRepository(expenseRepository);

        return user;
    }
}
