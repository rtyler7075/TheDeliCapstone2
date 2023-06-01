package com.deli;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    }

    private static void sandwichSize() {

        System.out.println("Please select a sandwich size:");
        System.out.println("\t1: 4");
        System.out.println("\t2: 8");
        System.out.println("\t3: 12");

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

        System.out.println("Would you like your bread toasted? (Y/N)");
        System.out.println("\t1: Yes ");
        System.out.println("\t2: No ");

        String choice = scanner.nextLine();
        // Toasting the bread
        if (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("Y")) {
            System.out.println("You chose to have your bread toasted.");

            // not toasting the bread
        } else if (choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("N")) {
            System.out.println("You chose not to have your bread toasted.");

            // Invalid option
        } else {
            System.out.println("Invalid choice. Please select either 'Y' or 'N'.");

        }
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
        String input;
        do {
            System.out.println("\t1: Mayo");
            System.out.println("\t2: Mustard");
            System.out.println("\t3: Ketchup");
            System.out.println("\t4: Ranch");
            System.out.println("\t5: Thousand island");
            System.out.println("\t6: Vinaigrette");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    System.out.println("You have selected Mayo");
                    break;
                case "2":
                    System.out.println("You have selected Mustard");
                    break;
                case "3":
                    System.out.println("You have selected  Ketchup");
                    break;
                case "4":
                    System.out.println("You have selected  Ranch");
                    break;
                case "5":
                    System.out.println("You have selected Thousand Island");
                    break;
                case "6":
                    System.out.println("You have selected Vinaigrette ");
                    break;
            }

        } while (!input.equalsIgnoreCase("0"));
    }

    private static void addDrinks() {
        String input;
        do {
            System.out.println("---Drinks---");
            System.out.println("\t1: Drink Size");
            System.out.println("\t2: Drink Flavor");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    drinkSize();
                    break;
                case "2":
                    drinkFlavor();
                    break;
                case "0":
                    System.out.println("Canceling Order...");
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        } while (!input.equalsIgnoreCase("0"));
    }

    private static void addChips() {

        Scanner scanner = new Scanner(System.in);

        String subInput;
        do {
            System.out.println("---Chips---");
            System.out.println("\t1: Lays Original");
            System.out.println("\t2: Lays BBQ");
            System.out.println("\t3: Jalapeno Kettle");
            System.out.println("\t4: Doritos");
            System.out.println("\t0: Back");

            subInput = scanner.nextLine();

            switch (subInput.toUpperCase()) {
                case "1":
                    System.out.println("You have selected Lays Original Chips");
                    break;
                case "2":
                    System.out.println("You have selected Lays BBQ Chips");
                    break;
                case "3":
                    System.out.println("You have selected Jalapeno Kettle Chips");
                    break;
                case "4":
                    System.out.println("You have selected Doritos Chips");
                    break;
                case "0":
                    System.out.println("Cancelling Order...");
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        } while (!subInput.equalsIgnoreCase("0"));
    }

    private static void checkout() {
        // Calculate total price
        double sandwichPrice = 5.00;
        double chipsPrice = 2.00;
        double drinkPrice = 1.00;
        double totalPrice = sandwichPrice + chipsPrice + drinkPrice;

        // Order Details
        System.out.println("Order Details:");
        System.out.println("Bread: ");
        String bread = scanner.nextLine();
        System.out.println("Size: ");
        String size = scanner.nextLine();
        System.out.println("Chips: ");
        String chips = scanner.nextLine();
        System.out.println("Drink: ");
        String drink = scanner.nextLine();

        // Confirm or Cancel order
        System.out.println("Select an option:");
        System.out.println("1. Confirm order and create receipt");
        System.out.println("2. Cancel order and go back to the home screen");
        int optionChoice = scanner.nextInt();

        if (optionChoice == 1) {

            // Create a new object of the Checkout class.
            Checkout checkout = new Checkout();

            // Call the setBread(), setSize(), setChips(), and setDrink() methods of the Checkout object, passing in the appropriate values.
            checkout.setBread(bread);
            checkout.setSize(size);
            checkout.setChips(chips);
            checkout.setDrink(drink);

            // Call the getTotalPrice() method of the Checkout object, and store the return value in a variable.
            double totalPriceFromCheckout = checkout.getTotalPrice();

            // Print the order details to the terminal.
            System.out.println("Order Details:");
            System.out.println("Bread: " + checkout.bread);
            System.out.println("Size: " + checkout.size);
            System.out.println("Chips: " + checkout.chips);
            System.out.println("Drink: " + checkout.drink);
            System.out.println("Total Price: $" + totalPriceFromCheckout);

            // Save the receipt to a file
            try {
                File receipt = new File("20230530-121523.txt");
                FileWriter writer = new FileWriter(receipt);
                writer.write("Order Details:\n");
                writer.write("Bread: " + checkout.bread + "\n");
                writer.write("Size: " + checkout.size + "\n");
                writer.write("Chips: " + checkout.chips + "\n");
                writer.write("Drink: " + checkout.drink + "\n");
                writer.write("Total Price: $" + totalPriceFromCheckout + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred while creating the receipt.");
                e.printStackTrace();
            }

        } else if (optionChoice == 2) {
            System.out.println("Order canceled. Going back to the home screen...");

        } else {
            System.out.println("Invalid option selected. Going back to the home screen...");

        }

        // Close the scanner
        scanner.close();
    }

    private static void drinkSize() {
        String subInput;

        do {
            System.out.println("---Drink Sizes---");
            System.out.println("\t1: Small");
            System.out.println("\t2: Medium");
            System.out.println("\t3: Large");
            System.out.println("\t0: Back");

            subInput = scanner.nextLine();

            switch (subInput.toUpperCase()) {
                case "1":
                    System.out.println("You have selected Small");
                    break;
                case "2":
                    System.out.println("You have selected Medium");
                    break;
                case "3":
                    System.out.println("You have selected Large");
                case "0":
                    System.out.println("Canceling Order...");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (!subInput.equalsIgnoreCase("0"));
    }

    private static void drinkFlavor() {
        String subInput;

        do {
            System.out.println("---Drink Flavors---");
            System.out.println("\t1: Coke");
            System.out.println("\t2: Sprite");
            System.out.println("\t3: Dr.Pepper");
            System.out.println("\t4: Lemonade");
            System.out.println("\t5: Sweet Tea");
            System.out.println("\t0: Back");

            subInput = scanner.nextLine();

            switch (subInput.toUpperCase()) {
                case "1":
                    System.out.println("You have selected Coke");
                    break;
                case "2":
                    System.out.println("You have selected Sprite");
                    break;
                case "3":
                    System.out.println("You have selected Dr.Pepper");
                    break;
                case "4":
                    System.out.println("You have selected Lemonade");
                    break;
                case "5":
                    System.out.println("You have selected Sweet Tea");
                    break;
                case "0":
                    System.out.println("Canceling Order...");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (!subInput.equalsIgnoreCase("0"));
    }
}


