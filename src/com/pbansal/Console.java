package com.pbansal;

import java.util.Scanner;

public class Console {
    // field
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Generic method to accept the user input and validate input criteria.
    public static double readNumber(String prompt, double min, double max){
        double userInput;
        while (true){
            System.out.print(prompt);
            userInput = scanner.nextDouble();
            if (userInput >= min && userInput <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max + ".");
        }
        return userInput;
    }
}
