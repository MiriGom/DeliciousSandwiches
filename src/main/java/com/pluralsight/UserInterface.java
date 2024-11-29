package com.pluralsight;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
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
                    customizeSandwich();
                    break;
                case "B":
                     orderDrink();
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
    public void orderDrink(){
        Drinks drinks = new Drinks("");
        System.out.println("Please select a drink");
        deliStore.displayDrinks();
        int userInput = scan.nextInt();
        scan.nextLine();
        System.out.println("What size drink would you like?");
        displaySize();
        int userSizeInput = scan.nextInt();
        scan.nextLine();
        if (DeliStore.availableDrinks.containsKey(userInput)) {
            Drinks selectedDrink = DeliStore.availableDrinks.get(userInput);
            if (userSizeInput == Size.SMALL.ordinal() + 1) {
                selectedDrink.setSize(Size.SMALL);
            } else if (userSizeInput == Size.MEDIUM.ordinal() + 1) {
                selectedDrink.setSize(Size.MEDIUM);
            }else if (userSizeInput == Size.LARGE.ordinal() + 1) {
                selectedDrink.setSize(Size.LARGE);
            }
            confirmAdd(selectedDrink);
        }
    }
    public void displaySize(){
        for(Size size: Size.values()) {
            System.out.println((size.ordinal() + 1) + ") " + size);
        }
    }
    public void customizeSandwich() {
        Sandwich sandwich = new Sandwich();
        System.out.println("What size sandwich would you like?");
        displaySize();
        int userSizeInput = scan.nextInt();
        scan.nextLine();
            if (userSizeInput == Size.SMALL.ordinal() + 1) {
                sandwich.setSize(Size.SMALL);
            } else if (userSizeInput == Size.MEDIUM.ordinal() + 1) {
                sandwich.setSize(Size.MEDIUM);
            }else if (userSizeInput == Size.LARGE.ordinal() + 1) {
                sandwich.setSize(Size.LARGE);
            }
        System.out.println("Please select a bread type");
            deliStore.displayBreads();
            int userBreadSelection = scan.nextInt();
            scan.nextLine();
            if (DeliStore.availableBreads.containsKey(userBreadSelection)) {
                String selectedBread = DeliStore.availableBreads.get(userBreadSelection);
                sandwich.setBread(selectedBread);
            }
        System.out.println("Please select your choice of meats." +
                "\nIf you would like more than one type please separate your choices using commas");
            deliStore.displayMeats();
            String[] userMeatSelection = scan.nextLine().split(",");
            ArrayList<Meat> meats = new ArrayList<>();
            for (String selectionKey: userMeatSelection)
                if (DeliStore.availableMeats.containsKey(Integer.parseInt(selectionKey))){Meat selectedMeat = DeliStore.availableMeats.get(Integer.parseInt(selectionKey));
                meats.add(selectedMeat);
                sandwich.setMeats(meats);
            }
            System.out.println("would you like extra meat?");
            String extraMeat = scan.nextLine();
            if (extraMeat.equalsIgnoreCase("yes")) {
                sandwich.isExtraMeat(true);
            }
            System.out.println("Please select your choice of cheese." +
                    "\nIf you would like more than one type please separate your choices using commas");
            deliStore.displayCheese();
            String [] userCheeseSelection = scan.nextLine().split(",");
            ArrayList<Cheese> cheeseList = new ArrayList<>();
            for (String selectionKey: userCheeseSelection) {
                if (DeliStore.availableCheeses.containsKey(Integer.parseInt(selectionKey))){
                    Cheese selectedCheese = DeliStore.availableCheeses.get(Integer.parseInt(selectionKey));
                        cheeseList.add(selectedCheese);
                        sandwich.setCheeseList(cheeseList);
                    }
                }

    }
}