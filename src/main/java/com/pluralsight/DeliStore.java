package com.pluralsight;

import java.util.HashMap;

public class DeliStore {
    static HashMap<Integer, Chips> availableChips = new HashMap<>();
    static HashMap<Integer, Drinks> availableDrinks = new HashMap<>();

    public DeliStore() {
        availableChips.put(1, new Chips("Lay's"));
        availableChips.put(2, new Chips("Doritos"));
        availableChips.put(3, new Chips("Pringles"));

        availableDrinks.put(1, new Drinks("Coca Cola"));
        availableDrinks.put(2, new Drinks("Fanta"));
        availableDrinks.put(3, new Drinks("Sprite"));
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
}
