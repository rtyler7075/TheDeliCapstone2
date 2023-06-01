package com.deli;

import java.util.ArrayList;

public class Drink extends Product{
    private ArrayList<String> availableDrinkSize;
    private ArrayList<String> availableDrinkFlavor;

    private ArrayList<String> drinkSize = new ArrayList<>();
    private ArrayList<String> drinkFlavor = new ArrayList<>();

//    public Drink(String drinkSize, String drinkFlavor) {
//        this.drinkSize = drinkSize;
//        this.drinkFlavor = drinkFlavor;
//    }
//
//    public String getDrinkSize() {
//        return drinkSize;
//    }
//
//    public void setDrinkSize(String drinkSize) {
//        this.drinkSize = drinkSize;
//    }
//
//    public String getDrinkFlavor() {
//        return drinkFlavor;
//    }
//
//    public void setDrinkFlavor(String drinkFlavor) {
//        this.drinkFlavor = drinkFlavor;
//    }

    public Drink() {
    }

    public void initializeDrinkSizes() {
        drinkSize.add("Small");
        drinkSize.add("Medium");
        drinkSize.add("Large");
    }

    public void initializeDrinkFlavors() {
        drinkFlavor.add("Coke");
        drinkFlavor.add("Sprite");
        drinkFlavor.add("Dr.Pepper");
        drinkFlavor.add("Lemonade");
        drinkFlavor.add("Sweet Tea");
    }

    public double getPrice() {
        if (drinkSize.equals("Small")) {
            return 2.00;
        } else if (drinkSize.equals("Medium")) {
            return 2.50;
        } else if (drinkSize.equals("Large")) {
            return 3.00;
        } else {
            return 0.00;
        }
    }


    public void displayAvailableDrinkSize() {
        System.out.println("Available Sizes: ");
        for (int i = 0; i < drinkSize.size(); i++);
    }

}