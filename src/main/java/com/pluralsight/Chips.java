package com.pluralsight;

public class Chips extends StoreItem {
    protected String name;
    public Chips(String name){
        this.name = name;
        }
    @Override
    public double getPrice(){
        return 1.5;
    }
    @Override
    public String toString(){
        return String.format("%s $%.2f", name, getPrice());
    }
}
