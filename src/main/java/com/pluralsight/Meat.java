package com.pluralsight;

public class Meat extends StoreItem {
    protected String name;
    protected Size size;

    public Meat(String name) {
        this.name = name;
    }

    public double getPrice() {
        double price = 0;
        switch (this.size) {

            case SMALL:
                price += 1;
                return price;
            case MEDIUM:
                price += 2;
                return price;
            case LARGE:
                price = +3;
                return price;
            default:
                System.out.println("Error");
        }
        return 0;
    }

    public void setMeatSize(Size size) {
        this.size = size;
    }

    public String toString() {
        return String.format("%s +$%.2f", name, getPrice());
    }
}
