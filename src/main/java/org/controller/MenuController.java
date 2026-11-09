package org.controller;

import org.models.User;
import org.services.AuthService;
import org.services.RegisterExpenseService;
import org.services.RemoveExpenseService;
import org.view.Menu;

public class MenuController {
    private final RegisterExpenseService registerExpenseService = new RegisterExpenseService();
    private final RemoveExpenseService removeExpenseService = new RemoveExpenseService();
    private final AuthService AuthService = new AuthService();

    public void menuAuth(){
        User user = AuthService.createAccount();
        menu(user);
    }

    public void menu(User user){
        int optionMenu = 1;

        while (optionMenu != 0){
            optionMenu = Menu.menuList();

            switch (optionMenu){
                case 1:
                    registerExpenseService.register(user);
                    break;
                case 2:
                    removeExpenseService.removeExpense(user);
                    break;
                default:
                    System.out.println("valor invalido");
                    break;
            }
        }
    }
}
