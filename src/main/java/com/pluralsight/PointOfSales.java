package com.pluralsight;

import java.util.ArrayList;

public class PointOfSales {
    static ArrayList <StoreItem> receipt = new ArrayList<>();
    public void displayReciept(){
        for (StoreItem storeItem: receipt){
            System.out.println(storeItem);
        }
    }
    public void addItemToOrder(StoreItem item){
        receipt.add(item);
        System.out.println(item.toString() + " added to your order");
    }
}
