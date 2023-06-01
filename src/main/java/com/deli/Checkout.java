package com.deli;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.deli.HomeScreen.scanner;

public class Checkout {
    String bread;
    String size;
    String chips;
    String drink;
    private double totalPrice;

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
//    private static String bread;
//    private static String size;
//    private static String chips;
//    private static String drink;
//
//
//
//    public static String getBread() {
//        return bread;
//    }
//
//    public static void setBread(String bread) {
//        Checkout.bread = bread;
//    }
//
//    public static String getSize() {
//        return size;
//    }
//
//    public static void setSize(String size) {
//        Checkout.size = size;
//    }
//
//    public static String getChips() {
//        return chips;
//    }
//
//    public static void setChips(String chips) {
//        Checkout.chips = chips;
//    }
//
//    public static String getDrink() {
//        return drink;
//    }
//
//    public static void setDrink(String drink) {
//        Checkout.drink = drink;
//    }
//
//    public static void main(String[] args) {
//
//        // Calculate total price
//        double sandwichPrice;
//        double chipsPrice;
//        double drinkPrice;
////        double totalPrice = sandwichPrice + chipsPrice + drinkPrice;
//
//        // Order Details
//        System.out.println("Order Details:");
//        System.out.println("Bread: " + bread);
////        System.out.println("Size: " + breadSize);
////        System.out.println("Chips: " + chipsType);
////        System.out.println("Drink: " + drinkType);
////        System.out.println("Total Price: $" + totalPrice);
//
//        // Confirm or Cancel order
//        System.out.println("Select an option:");
//        System.out.println("1. Confirm order and create receipt");
//        System.out.println("2. Cancel order and go back to the home screen");
//        int optionChoice = scanner.nextInt();
//
//        if (optionChoice == 1) {
////            createReceipt(breadType, breadSize, chipsType, drinkType, totalPrice);
//            System.out.println("Order confirmed receipt created!");
//
//
//        } else if (optionChoice == 2) {
//            System.out.println("Order canceled. Going back to the home screen...");
//
//
//        } else {
//            System.out.println("Invalid option selected. Going back to the home screen...");
//
//        }
//
//        // Close the scanner
//        scanner.close();
//
//        // Creating a receipt file
////        private static void createReceipt (String bread, String size, String chips, String drink,double price){
////            try {
////                File receipt = new File("20230530-121523.txt");
////                FileWriter writer = new FileWriter(receipt);
////                writer.write("Order Details:\n");
////                writer.write("Bread: " + bread + "\n");
////                writer.write("Size: " + size + "\n");
////                writer.write("Chips: " + chips + "\n");
////                writer.write("Drink: " + drink + "\n");
////                writer.write("Total Price: $" + price + "\n");
////                writer.close();
////            } catch (IOException e) {
////                System.out.println("An error occurred while creating the receipt.");
////                e.printStackTrace();
////            }
////        }
//    }
}


