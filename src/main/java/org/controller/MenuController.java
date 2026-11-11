package org.controller;

import org.models.User;
import org.repository.ExpenseRepository;
import org.services.AuthService;
import org.services.RegisterExpenseService;
import org.services.RemoveExpenseService;
import org.utils.InputUtils;
import org.view.Menu;

public class MenuController {
    private final RegisterExpenseService registerExpenseService = new RegisterExpenseService();
    private final RemoveExpenseService removeExpenseService = new RemoveExpenseService();
    private final AuthService AuthService = new AuthService();
    private final ExpenseRepository expenseRepository = new ExpenseRepository();

    public void menuAuth() {
        User user = AuthService.createAccount();
        menu(user);
    }

    public void menu(User user) {
        int optionMenu = 1;

        while (optionMenu != 0) {
            optionMenu = Menu.menuList();

            switch (optionMenu) {
                case 0:
                    break;
                case 1:
                    InputUtils.returnString();
                    registerExpenseService.register(user);
                    break;
                case 2:
                    removeExpenseService.removeExpense(user);
                    break;
                case 3:
                    expenseRepository.listExpenses(user);
                    break;
                case 4:
                    System.out.print(user);
                    break;
                default:
                    System.out.printf("valor invalido%n");
                    break;
            }
        }
    }
}
