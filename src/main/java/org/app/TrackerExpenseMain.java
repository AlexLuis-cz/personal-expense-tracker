package org.app;

import org.controller.MenuController;

public class TrackerExpenseMain {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.menuAuth();
    }
}
