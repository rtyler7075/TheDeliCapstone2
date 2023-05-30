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
            System.out.println("\t0: Cancel Order");
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
                    System.out.println("Canceling Order");
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
            System.out.println("\t0: Cancel Order");

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
                    System.out.println("Canceling Order");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    private static void selectBread() {
    }
    private static void sandwichSize() {

        System.out.println("Please select a sandwich size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        int sandwichSize = scanner.nextInt();

        switch (sandwichSize) {
            case 1:
                System.out.println("You have selected a small sandwich.");
                break;
            case 2:
                System.out.println("You have selected a medium sandwich.");
                break;
            case 3:
                System.out.println("You have selected a large sandwich.");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
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
            System.out.println("\t0: Cancel Order");

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

        System.out.println("--Meat--");
        System.out.println("\t1: Turkey");
        System.out.println("\t2: Ham");
        System.out.println("\t3: Bacon");
        System.out.println("\t4: Chicken");
        System.out.println("\t5: Roast Beef");
        System.out.println("\t0: Cancel Order");

        String input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "1":
                System.out.println("You have selected turkey.");
                break;
            case "2":
                System.out.println("You have selected ham.");
                break;
            case "3":
                System.out.println("You have selected bacon.");
                break;
            case "4":
                System.out.println("You have selected chicken.");
                break;
            case "5":
                System.out.println("You have selected roast beef.");
                break;
            case "0":
                System.out.println("Canceling Order");
                break;
            default:
                System.out.println("Invalid input, please try again.");
                break;
        }
    }
    private static void cheese() {

        System.out.println("--Cheese--");
        System.out.println("\t1: American");
        System.out.println("\t2: Cheddar");
        System.out.println("\t3: Swiss");
        System.out.println("\t4: Mozzarella");
        System.out.println("\t5: Pepper Jack");
        System.out.println("\t0: Cancel Order");

        String input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "1":
                System.out.println("You have selected American cheese.");
                break;
            case "2":
                System.out.println("You have selected Cheddar cheese.");
                break;
            case "3":
                System.out.println("You have selected Swiss cheese.");
                break;
            case "4":
                System.out.println("You have selected Mozzarella cheese.");
                break;
            case "5":
                System.out.println("You have selected Pepper Jack cheese.");
                break;
            case "0":
                System.out.println("Canceling Order");
                break;
            default:
                System.out.println("Invalid input, please try again.");
                break;
        }
    }

    private static void otherToppings() {
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
