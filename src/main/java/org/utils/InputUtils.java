package org.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
    private static final Scanner INPUT = new Scanner(System.in);

    public static int returnInt(){

        //arrumar bug de loop no menu ao digitar valor invalido.




        try {
            return INPUT.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Digite um valor correto");
        }
        return 401;
    }

    public static String returnString(){
        return INPUT.nextLine();
    }

    public static double returnDouble(){
        try {
            return INPUT.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Digite um valor correto");
        }
        return 0;
    }

}
