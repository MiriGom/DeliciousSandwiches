package com.pluralsight;

import java.util.HashMap;

public class DeliStore {
    static HashMap<Integer, Chips> availableChips = new HashMap<>();

    public DeliStore() {
        availableChips.put(1, new Chips("Lay's"));
        availableChips.put(2, new Chips("Doritos"));
        availableChips.put(3, new Chips("Pringles"));
    }
    public void displayChips(){
        for (int i = 1; i <= availableChips.size(); i++) {
            Chips chip = availableChips.get(i);
            System.out.println(i + ") " + chip.name);
        }
    }
}
