package com.pluralsight;

import java.util.List;

public class Sandwich extends StoreItem {
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

    Sandwich() {
    }

    public Size getSize() {
        return size;
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

    public double getExtraMeatPrice() {
        double extraMeatPrice = 0;
        switch (this.size) {
            case SMALL:
                if (extraMeat) {
                    extraMeatPrice += .50;
                }

                return extraMeatPrice;

            case MEDIUM:
                if (extraMeat) {
                    extraMeatPrice += 1;
                }

                return extraMeatPrice;


            case LARGE:
                if (extraMeat) {
                    extraMeatPrice += 1.50;
                }

                return extraMeatPrice;
            default:
                System.out.println("Error");
        }
        return 0;
    }

    public double getExtraCheesePrice() {
        double extraCheesePrice = 0;
        switch (this.size) {
            case SMALL:
                if (extraCheese) {
                    extraCheesePrice += .30;
                }
                return extraCheesePrice;

            case MEDIUM:

                if (extraCheese) {
                    extraCheesePrice += .60;
                }
                return extraCheesePrice;


            case LARGE:

                if (extraCheese) {
                    extraCheesePrice += .90;
                }
                return extraCheesePrice;
            default:
                System.out.println("Error");
        }
        return 0;
    }


    @Override
    public double getPrice() {
        double price = 0;
        switch (this.size) {
            case SMALL:
                price += 5.50;
                if (meats != null) {
                    for (Meat m : meats) {
                        price += 1;
                    }
                    if (extraMeat) {
                        price += .50;
                    }
                }
                //add cheese
                if (cheeseList != null) {
                    for (Cheese c : cheeseList) {
                        price += .75;
                    }
                    if (extraCheese) {
                        price += .30;
                    }
                }

                return price;

            case MEDIUM:
                price += 7;
                if (meats != null) {
                    for (Meat m : meats) {
                        price += 2;
                    }
                    if (extraMeat) {
                        price += 1;
                    }
                }

                //add cheese
                if (cheeseList != null) {
                    for (Cheese c : cheeseList) {
                        price += 1.50;
                    }
                    if (extraCheese) {
                        price += .60;
                    }
                }
                return price;


            case LARGE:
                price = +8.50;
                if (meats != null) {
                    for (Meat m : meats) {
                        price += 3;
                    }
                    if (extraMeat) {
                        price += 1.50;
                    }
                }

                //add cheese
                if (cheeseList != null) {
                    for (Cheese c : cheeseList) {
                        price += 2.25;
                    }
                    if (extraCheese) {
                        price += .90;
                    }
                }
                return price;
            default:
                System.out.println("Error");
        }
        return 0;
    }

    public String toString() {
        return String.format("%s SANDWICH:\n  -%s BREAD\n  -%s\n  -%s\n  -%s\n  -%s\n  -%s\n  -%s\n  -%s \ntotal $%.2f",
                size, bread, meats, extraMeat ? "Extra meats +$" + getExtraMeatPrice() : "", cheeseList, extraCheese ? "Extra Cheeses +$" + getExtraCheesePrice() : "", sauces, toppings, isToasted ? "Toasted" : "", getPrice());
    }
}
