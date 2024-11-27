package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    static DeliStore deliStore = new DeliStore();
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
            orderPrompt();
        } else if (userInput.equalsIgnoreCase("B")) {
            System.out.println("blajd");
        } else {
            System.out.println("Invalid Input, please enter \"A\" or \"B\".");
        }

    }
    public void orderPrompt() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                    
                    =================================
                    A) CUSTOMIZE SANDWICH
                    B) DRINKS
                    C) CHIPS
                    D) CHECKOUT
                    X) CANCEL ORDER
                    """);
            String userInput = scan.nextLine();
            switch (userInput.toUpperCase()) {
                case "A":
                    // customizeSandwich();
                    break;
                case "B":
                    // orderDrink();
                    break;
                case "C":
                    System.out.println("Please select a bag of chips");
                    orderChip();
                    break;
                case "D":
                    //checkout();
                    break;
                case "X":
                    isRunning = false;
            }
        }
    }
    public void orderChip(){

        deliStore.displayChips();
    }
}
