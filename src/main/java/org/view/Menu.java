package org.view;

import org.utils.InputUtils;

public class Menu {

    public static int menuList() {
        System.out.print(
                """
                        0: Exit\
                        
                        1: register expense\
                        
                        2: Remove expense\
                        
                        3: Show expenses\
                        
                        4: Show limit
                        
                        Option:""");

        return InputUtils.returnInt();
    }
}
