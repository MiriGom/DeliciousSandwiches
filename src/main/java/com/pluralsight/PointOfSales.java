package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PointOfSales {
    double totalCost = 0;
    static ArrayList <StoreItem> orderList = new ArrayList<>();
    public void displayOrder(){
        for (StoreItem storeItem: orderList){
            totalCost += storeItem.getPrice();
            System.out.println(storeItem);
        }
        System.out.printf("Total Cost: $%.2f%n", totalCost);
    }
    public void addItemToOrder(StoreItem item){
        orderList.add(item);
        System.out.println(item.toString() + " added to your order");
    }
    public void printReceipt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd--HH-mm-ss");
        LocalDateTime dateTime = LocalDateTime.now();
        double totalCost = 0;

        try {
            FileWriter fR = new FileWriter("Receipts\\" + dateTime.format(formatter) + ".csv");
            BufferedWriter bF = new BufferedWriter(fR);

            String line;
            for (StoreItem item: orderList){
                totalCost += item.getPrice();
                line = String.format("%s\n", item);
                bF.write(line);
            }
            bF.write(String.format("\nTotal Cost: $%.2f", totalCost));
            bF.flush();
        }catch (IOException e){
            System.out.println("error in printing receipt");
        }

        orderList.clear();
    }
}
