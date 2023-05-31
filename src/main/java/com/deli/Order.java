package com.deli;

import java.util.ArrayList;
import java.util.*;

class Order {

    private String customerName;
    private List<Product> products;
    private double totalPrice;
    private static int orderNumber = 1;

    public Order(String customerName) {
        this.customerName = customerName;
        this.products = new ArrayList<>();
        this.totalPrice = 0;
        this.orderNumber = orderNumber++;
    }

    public void addItem(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    public void addDrink (Drink drink) {
//        this.products.add(drink);
            this.totalPrice+= drink.getPrice();
    }

    public void removeItem(Product product) {
        this.products.remove(product);
        this.totalPrice -= product.getPrice();
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", items=" + products +
                ", totalPrice=" + totalPrice +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
