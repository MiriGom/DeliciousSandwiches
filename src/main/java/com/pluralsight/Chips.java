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
}
