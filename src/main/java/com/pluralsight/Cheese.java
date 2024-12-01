package com.pluralsight;

public class Cheese extends StoreItem {
    protected String name;
    protected Size size;

    Cheese(String name) {
        this.name = name;
    }

    public double getPrice() {
        double price = 0;
        switch (this.size) {
            case SMALL:
                price += .75;
                return price;
            case MEDIUM:
                price += 1.5;
                return price;
            case LARGE:
                price = +2.25;
                return price;
            default:
                System.out.println("Error");
        }
        return 0;

    }

    public void setCheeseSize(Size size) {
        this.size = size;
    }

    public String toString() {
        return String.format("%s +$%.2f", name, getPrice());
    }
}
