package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PointOfSales {
    static ArrayList <StoreItem> orderList = new ArrayList<>();
    public void displayOrder(){
        for (StoreItem storeItem: orderList){
            System.out.println(storeItem);
        }
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
                line = String.format(item.toString());
                bF.write(line);
            }
            bF.close();
        }catch (IOException e){
            System.out.println("error in printing receipt");
        }

        orderList.clear();
    }
}
