package com.pluralsight;

import java.util.List;

public class Sandwich extends StoreItem{
    private String bread;
    private Size size;
    private List<String> toppings;
    private List<String> sauces;
    private List<Meat> meats;
    private List<Cheese> cheeseList;
    private String side;
    boolean isToasted;
    boolean extraMeat;
    boolean extraCheese;

    Sandwich(){
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public void setMeats(List<Meat> meats) {
        this.meats = meats;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setCheeseList(List<Cheese> cheeseList) {
        this.cheeseList = cheeseList;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void isExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
