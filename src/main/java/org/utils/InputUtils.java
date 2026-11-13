package org.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
    private static final Scanner INPUT = new Scanner(System.in);

    public static int returnInt() {
        try {
            return INPUT.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a correct value");
            INPUT.nextLine();
        }
        return returnInt();
    }

    public static String returnString() {
        return INPUT.nextLine();
    }

    public static double returnDouble() {
        try {
            return INPUT.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Enter a correct value:");
            INPUT.nextLine();
        }
        return returnDouble();
    }

}
