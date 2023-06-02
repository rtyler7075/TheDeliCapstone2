package com.deli;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.deli.HomeScreen.scanner;

//public class Checkout {
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

//    public static void setDrink(String drink) {
//        Checkout.drink = drink;
//    }

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
//}
//

///////
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
