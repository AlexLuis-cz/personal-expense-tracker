package org.view;

import org.utils.InputUtils;

public class Menu {

    public static int menuList() {
        System.out.println(
                """
                        0: Exit\
                        
                        1: register expense\
                        
                        2: Remove expense""");


        return InputUtils.returnInt();
    }
}
