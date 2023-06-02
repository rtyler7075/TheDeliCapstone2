package com.deli;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {
    private String meatType;
    private String cheeseType;
    private String breadType;
    private int size;
    private final List<String> toppings = new ArrayList<>();

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void addToppings(String topping) {
        toppings.add(topping);
    }

    @Override
    public double getPrice() {
        double sandwichPrice = sandwichPrice();

        // Add the price for each topping
        double toppingsPrice = toppings.size() * 0.50;

        // Calculate the total price
        double totalPrice = sandwichPrice + toppingsPrice;

        return totalPrice;
    }

    private double sandwichPrice() {
        double sandwichPrice = 0;
        if (size == 4) {
            sandwichPrice = 5.50;
        } else if (size == 8) {
            sandwichPrice = 7.00;
        } else if (size == 12) {
            sandwichPrice = 8.50;
        }
        return sandwichPrice;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
