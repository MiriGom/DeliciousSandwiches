package com.pluralsight;

import java.util.HashMap;

public class DeliStore {
    static HashMap<Integer, Chips> availableChips = new HashMap<>();
    static HashMap<Integer, Drinks> availableDrinks = new HashMap<>();
    static HashMap<Integer, Meat> availableMeats = new HashMap<>();
    static HashMap<Integer, Cheese> availableCheeses = new HashMap<>();
    static HashMap<Integer, String> availableSauce = new HashMap<>();
    static HashMap<Integer, String> availableToppings = new HashMap<>();
    static HashMap<Integer, String> availableBreads = new HashMap<>();
    static HashMap<Integer, String> availableSides = new HashMap<>();

    public DeliStore() {
        availableChips.put(1, new Chips("Lay's"));
        availableChips.put(2, new Chips("Doritos"));
        availableChips.put(3, new Chips("Pringles"));

        availableDrinks.put(1, new Drinks("Coca Cola"));
        availableDrinks.put(2, new Drinks("Fanta"));
        availableDrinks.put(3, new Drinks("Sprite"));

        availableBreads.put(1, "WHITE");
        availableBreads.put(2, "WHEAT");
        availableBreads.put(3,"RYE");
        availableBreads.put(4, "WRAP");

        availableMeats.put(1, new Meat("STEAK"));
        availableMeats.put(2, new Meat("HAM"));
        availableMeats.put(3, new Meat("SALAMI"));
        availableMeats.put(4, new Meat("ROAST BEEF"));
        availableMeats.put(5, new Meat("CHICKEN"));
        availableMeats.put(6, new Meat("BACON"));

        availableCheeses.put(1, new Cheese("AMERICAN"));
        availableCheeses.put(2, new Cheese("PROVOLONE"));
        availableCheeses.put(3, new Cheese("CHEDDAR"));
        availableCheeses.put(4, new Cheese("SWISS"));

        availableToppings.put(1, "PEPPERS");
        availableToppings.put(2, "ONIONS");
        availableToppings.put(3, "TOMATOES");
        availableToppings.put(4, "JALEPENOS");
        availableToppings.put(5, "CUCUMBERS");
        availableToppings.put(6, "PICKLES");
        availableToppings.put(7, "GUACAMOLE");
        availableToppings.put(8, "MUSHROOMS");

        availableSides.put(1, "AU JUS");
        availableSides.put(2, "SALAD");

        availableSauce.put(1, "MAYO");
        availableSauce.put(2, "KETCHUP");
        availableSauce.put(3, "MUSTARD");
        availableSauce.put(4, "RANCH");
        availableSauce.put(5, "THOUSAND ISLANDS");
        availableSauce.put(6, "VINAIGRETTE");
    }

    public void displayChips(){
        for (int i = 1; i <= availableChips.size(); i++) {
            Chips chip = availableChips.get(i);
            System.out.println(i + ") " + chip.name);
        }
    }
    public void displayDrinks(){
        for(int i = 1; i <= availableDrinks.size(); i++) {
            Drinks drink = availableDrinks.get(i);
            System.out.println(i + ") " + drink.name);
        }
    }
    public void displayBreads() {
        for( int i = 1; i <= availableBreads.size(); i++) {
           String bread = availableBreads.get(i);
           System.out.println(i + ") " + bread);
        }
    }
    public void displayMeats(){
        for (int i = 1; i <= availableMeats.size(); i++) {
            Meat meat = availableMeats.get(i);
            System.out.println(i + ") " + meat);
        }
    }
    public void displayCheese(){
        for(int i = 1; i <= availableCheeses.size(); i++) {
            Cheese cheese = availableCheeses.get(i);
            System.out.println(i + ") " + cheese);
        }
    }
}
