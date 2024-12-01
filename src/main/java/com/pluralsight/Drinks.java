package com.pluralsight;

public class Drinks extends StoreItem {
    protected String name;
    protected Size size;

    public Drinks(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        double price = 0;
        switch (this.size) {
            case SMALL:
                price += 2;
                return price;

            case MEDIUM:
                price += 2.5;
                return price;

            case LARGE:
                price += 3;
                return price;

            default:
                System.out.println("Error in returning price");
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s $%.2f", size, name, getPrice());
    }

}
