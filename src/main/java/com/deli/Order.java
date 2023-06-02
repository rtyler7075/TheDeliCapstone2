package com.deli;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;
    private static int orderNumber = 1;

    public Order() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
        orderNumber++;
    }

    public void addItem(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    public void addDrink(Drink drink) {
        this.products.add(drink);
        this.totalPrice += drink.getPrice();
    }

    public void removeItem(Product product) {
        this.products.remove(product);
        this.totalPrice -= product.getPrice();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        this.totalPrice -= product.getPrice();
    }

    public void createReceipt() {
        System.out.println("Receipt:");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("  " + product.getClass().getSimpleName() + " - $" + product.getPrice());
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public void checkout() {
        createReceipt();
    }

    public void clearOrder() {
        products.clear();
        orderNumber = 0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", totalPrice=" + totalPrice +
                ", orderNumber=" + orderNumber +
                '}';
    }
}


