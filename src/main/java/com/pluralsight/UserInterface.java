package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    static PointOfSales pos = new PointOfSales();
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
                    orderChip();
                    break;
                case "D":
                    checkout();
                    break;
                case "X":
                    isRunning = false;
            }
        }
    }
    public void orderChip(){
        System.out.println("Please select a bag of chips");
        deliStore.displayChips();
        int userInput = scan.nextInt();
        scan.nextLine();
        if (DeliStore.availableChips.containsKey(userInput)) {
            Chips selectedChip = DeliStore.availableChips.get(userInput);
            confirmAdd(selectedChip);
        }

    }
    public void confirmAdd(StoreItem item){
        System.out.println("would you like to add " + item.toString() + " to your order? type out yes/no");
        String userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            pos.addItemToOrder(item);
        }
    }
    public void checkout(){
        pos.displayOrder();
        System.out.println("would you like to complete your order and print receipt? Type yes/no.");
        String userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            pos.printReceipt();
            System.out.println("Receipt printed! Have a wonderful day!");
        }
    }
}
