package org.services;

import org.models.User;
import org.repository.ExpenseRepository;
import org.repository.UserRepository;
import org.utils.InputUtils;

public class AuthService {

    public User createAccount() {
        System.out.print("Digite o limite mensal:");
        double limitMonth = InputUtils.returnDouble();

        User user = new User(limitMonth);

        ExpenseRepository expenseRepository = new ExpenseRepository();
        user.setExpenseRepository(expenseRepository);

        UserRepository.setUsers(user);
        return user;
    }
}
