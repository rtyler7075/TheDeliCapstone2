package com.deli;

import java.util.Scanner;

public class HomeScreen {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String input;
        do {
            System.out.println("--Home Screen--");
            System.out.println("\t1: New Order");
            System.out.println("\t0: Exit");
            System.out.println("Please enter a command: ");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    newOrder();
                    break;
                case "0":
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } while (!input.equalsIgnoreCase("0"));
    }
    private static void newOrder() {

        String input;
        do {
            System.out.println("--Order Screen--");
            System.out.println("\t1: Add Sandwich");
            System.out.println("\t2: Add Drinks");
            System.out.println("\t3: Add Chips");
            System.out.println("\t4: Checkout");
            System.out.println("\t0: Back");
            System.out.println("Please enter a command: ");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    addSandwich();
                    break;
                case "2":
                    addDrinks();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    checkout();
                    break;
                case "0":
                    System.out.println("Going back");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } while (!input.equalsIgnoreCase("0"));
    }
    private static void addSandwich() {

        String input;
        do {
            System.out.println("--Adding Sandwich--");
            System.out.println("\t1: Select your bread: ");
            System.out.println("\t2: Sandwich Size: ");
            System.out.println("\t3: Would you like your bread to be toasted?");
            System.out.println("\t4: Toppings");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    selectBread();
                    break;
                case "2":
                    sandwichSize();
                    break;
                case "3":
                    toastingBread();
                    break;
                case "4":
                    toppings();
                    break;
                case "0":
                    System.out.println("Going Back");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    private static void selectBread() {

        String input;
        do {
            System.out.println("--Select Bread--");
            System.out.println("\t1: White Bread");
            System.out.println("\t2: Wheat Bread");
            System.out.println("\t3: Sourdough Bread");
            System.out.println("\t0: Go Back");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    System.out.println("You have selected white bread.");
                    break;
                case "2":
                    System.out.println("You have selected wheat bread.");
                    break;
                case "3":
                    System.out.println("You have selected sourdough bread.");
                    break;
                case "0":
                    System.out.println("Going back");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } while (!input.equalsIgnoreCase("0"));
    }
    private static void sandwichSize() {
    }
    private static void toastingBread() {
    }
    private static void toppings() {

        String input;
        do {
            System.out.println("--Toppings--");
            System.out.println("\t1: Meat: ");
            System.out.println("\t2: Cheese: ");
            System.out.println("\t3: Other toppings");
            System.out.println("\t4: Select sauces: ");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    meat();
                    break;
                case "2":
                    cheese();
                    break;
                case "3":
                    otherToppings();
                    break;
                case "4":
                    selectSauces();
                    break;
                case "0":
                    System.out.println("Canceling Order");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    private static void meat() {
    }
    private static void cheese() {
    }
    private static void otherToppings() {

        String input;
        do {
            System.out.println("--Other Toppings--");
            System.out.println("\t1: Lettuce");
            System.out.println("\t2: Peppers");
            System.out.println("\t3: Onions");
            System.out.println("\t4: Tomatoes ");
            System.out.println("\t5: Jalapenos");
            System.out.println("\t6: Pickles");
            System.out.println("\t7: Guacamole");
            System.out.println("\t8: Mushrooms");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    System.out.println("You have selected Lettuce.");
                    break;
                case "2":
                    System.out.println("You have selected Peppers.");
                    break;
                case "3":
                    System.out.println("You have selected Onions.");
                    break;
                case "4":
                    System.out.println("You have selected Tomatoes.");
                    break;
                case "5":
                    System.out.println("You have selected Jalapenos.");
                    break;
                case "6":
                    System.out.println("You have selected Pickles.");
                    break;
                case "7":
                    System.out.println("You have selected Guacamole.");
                    break;
                case "8":
                    System.out.println("You have selected Mushrooms.");
                    break;
                case "0":
                    System.out.println("Back");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } while (!input.equalsIgnoreCase("0"));
    }
    private static void selectSauces() {
    }

    private static void addDrinks() {
    }
    private static void addChips() {
    }
    private static void checkout() {
    }

}
