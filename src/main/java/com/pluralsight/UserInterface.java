package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    static Scanner scan = new Scanner(System.in);
    public void getHomePage() {
        System.out.println("""
                ===============================
                       START YOUR ORDER
                ===============================
                A) START ORDER
                B) EXIT APPLICATION
                """);
        String userInput = scan.nextLine().trim();
        if (userInput.equalsIgnoreCase("A")) {
            System.out.println("dsdfs");
        } else if (userInput.equalsIgnoreCase("B")) {
            System.out.println("blajd");
        } else {
            System.out.println("Invalid Input, please enter \"A\" or \"B\".");
        }

    }
}
