package com.deli;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import static com.deli.HomeScreen.scanner;


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

        this.products = new ArrayList<>();
        this.totalPrice = 0;
        orderNumber = orderNumber++;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.totalPrice += product.getPrice();
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
        this.totalPrice -= product.getPrice();

    }
    public void checkout(){
        System.out.println(this.products);
        //  this.products

        // Print the order details
        System.out.println("Order Number: " + this.orderNumber);
        System.out.println("Products:");
        for (Product product : this.products) {
            System.out.println("  " + product.getClass() + " - $" + product.getPrice());
        }
        System.out.println("Total Price: $" + this.totalPrice);


//        // Calculate total price
//        double sandwichPrice = 5.00;
//        double chipsPrice = 2.00;
//        double drinkPrice = 1.00;
//        double totalPrice = sandwichPrice + chipsPrice + drinkPrice;
//
//        // Order Details
//        System.out.println("Order Details:");
//        System.out.println("Bread: ");
//        String bread = scanner.nextLine();
//        System.out.println("Size: ");
//        String size = scanner.nextLine();
//        System.out.println("Chips: ");
//        String chips = scanner.nextLine();
//        System.out.println("Drink: ");
//        String drink = scanner.nextLine();
//
//        // Confirm or Cancel order
//        System.out.println("Select an option:");
//        System.out.println("1. Confirm order and create receipt");
//        System.out.println("2. Cancel order and go back to the home screen");
//        int optionChoice = scanner.nextInt();
//
//        if (optionChoice == 1) {
//
//            // Create a new object of the Checkout class.
//            Checkout checkout = new Checkout();
//
//            // Call the setBread(), setSize(), setChips(), and setDrink() methods of the Checkout object, passing in the appropriate values.
//            checkout.setBread(bread);
//            checkout.setSize(size);
//            checkout.setChips(chips);
//            checkout.setDrink(drink);
//
//            // Call the getTotalPrice() method of the Checkout object, and store the return value in a variable.
//            double totalPriceFromCheckout = checkout.getTotalPrice();
//
//            // Print the order details to the terminal.
//            System.out.println("Order Details:");
//            System.out.println("Bread: " + checkout.bread);
//            System.out.println("Size: " + checkout.size);
//            System.out.println("Chips: " + checkout.chips);
//            System.out.println("Drink: " + checkout.drink);
//            System.out.println("Total Price: $" + totalPriceFromCheckout);
//
//            // Save the receipt to a file
//            try {
//                File receipt = new File("20230530-121523.txt");
//                FileWriter writer = new FileWriter(receipt);
//                writer.write("Order Details:\n");
//                writer.write("Bread: " + checkout.bread + "\n");
//                writer.write("Size: " + checkout.size + "\n");
//                writer.write("Chips: " + checkout.chips + "\n");
//                writer.write("Drink: " + checkout.drink + "\n");
//                writer.write("Total Price: $" + totalPriceFromCheckout + "\n");
//                writer.close();
//            } catch (IOException e) {
//                System.out.println("An error occurred while creating the receipt.");
//                e.printStackTrace();
//            }
//
//        } else if (optionChoice == 2) {
//            System.out.println("Order canceled. Going back to the home screen...");
//
//        } else {
//            System.out.println("Invalid option selected. Going back to the home screen...");
//
//        }
//
//        // Close the scanner
//        scanner.close();
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


