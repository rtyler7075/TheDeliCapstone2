package com.deli;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeScreen {
    static Scanner scanner = new Scanner(System.in);
    private static Sandwich sandwich = new Sandwich();
    private static Drink drink = new Drink();
    private static Chips chips = new Chips();



    private static final Order order = new Order();

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
        Sandwich sandwich = new Sandwich(); // Declare and initialize the sandwich object

        do {
            System.out.println("--Adding Sandwich--");
            System.out.println("\t1: Select your bread");
            System.out.println("\t2: Sandwich Size");
            System.out.println("\t3: Would you like your bread to be toasted?");
            System.out.println("\t4: Toppings");
            System.out.println("\t0: Back");
            System.out.print("Select an option: ");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    selectBread(sandwich); // Pass the sandwich object to selectBread()
                    break;
                case "2":
                    sandwichSize(sandwich); // Pass the sandwich object to sandwichSize()
                    break;
                case "3":
                    toastingBread(sandwich); // Pass the sandwich object to toastingBread()
                    break;
                case "4":
                    toppings(sandwich); // Pass the sandwich object to toppings()
                    break;
                case "0":
                    order.addProduct(sandwich); // Pass the sandwich object to addProduct()
                    sandwich = new Sandwich(); // Reset the sandwich object
                    System.out.println("Going Back");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } while (!input.equals("0"));
    }

    private static void selectBread(Sandwich sandwich) {

        String input;

        System.out.println("--Select Bread--");
        System.out.println("\t1: White Bread");
        System.out.println("\t2: Wheat Bread");
        System.out.println("\t3: Sourdough Bread");
        System.out.println("\t0: Go Back");

        input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "1":
                HomeScreen.sandwich.setBreadType("White bread");
                System.out.println("You have selected white bread.");
                break;
            case "2":
                HomeScreen.sandwich.setBreadType("Wheat bread");
                System.out.println("You have selected wheat bread.");
                break;
            case "3":
                HomeScreen.sandwich.setBreadType("Sourdough bread");
                System.out.println("You have selected Sourdough bread.");
                break;
            case "0":
                System.out.println("Going Back");
                break;
            default:
                System.out.println("Invalid input, please try again.");
                break;
        }

    }

    private static void sandwichSize(Sandwich sandwich) {
        System.out.println("Please select a sandwich size:");
        System.out.println("\t1: 4");
        System.out.println("\t2: 8");
        System.out.println("\t3: 12");

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                sandwich.setSize(4);
                System.out.println("You have selected a small sandwich.");
                break;
            case "2":
                sandwich.setSize(8);
                System.out.println("You have selected a medium sandwich.");
                break;
            case "3":
                sandwich.setSize(12);
                System.out.println("You have selected a large sandwich.");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                sandwichSize(sandwich);
                break;
        }
    }


    private static void toastingBread(Sandwich sandwich) {

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

    private static void toppings(Sandwich sandwich) {

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
                    System.out.println("Going Back");
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
        System.out.println("\t0: Back");

        String input = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
            switch (input.toUpperCase()) {
                case "1":
                    String meatOption = "Turkey";
                    System.out.println("You have selected turkey.");
                    writer.println("Meat: " + meatOption);
                    break;
                case "2":
                    meatOption = "Ham";
                    System.out.println("You have selected ham.");
                    writer.println("Meat: " + meatOption);
                    break;
                case "3":
                    meatOption = "Bacon";
                    System.out.println("You have selected bacon.");
                    writer.println("Meat: " + meatOption);
                    break;
                case "4":
                    meatOption = "Chicken";
                    System.out.println("You have selected chicken.");
                    writer.println("Meat: " + meatOption);
                    break;
                case "5":
                    meatOption = "Roast Beef";
                    System.out.println("You have selected roast beef.");
                    writer.println("Meat: " + meatOption);
                    break;
                case "0":
                    System.out.println("Going Back");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } catch (IOException e) {
            System.out.println("Failed to write to receipt file: " + e.getMessage());
        }
    }

    private static void cheese() {
        System.out.println("--Cheese--");
        System.out.println("\t1: American");
        System.out.println("\t2: Cheddar");
        System.out.println("\t3: Swiss");
        System.out.println("\t4: Mozzarella");
        System.out.println("\t5: Pepper Jack");
        System.out.println("\t0: Back");

        String input = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
            String cheeseOption = "";

            switch (input.toUpperCase()) {
                case "1":
                    cheeseOption = "American";
                    System.out.println("You have selected American cheese.");
                    writer.println("Cheese: " + cheeseOption);
                    break;
                case "2":
                    cheeseOption = "Cheddar";
                    System.out.println("You have selected Cheddar cheese.");
                    writer.println("Cheese: " + cheeseOption);
                    break;
                case "3":
                    cheeseOption = "Swiss";
                    System.out.println("You have selected Swiss cheese.");
                    writer.println("Cheese: " + cheeseOption);
                    break;
                case "4":
                    cheeseOption = "Mozzarella";
                    System.out.println("You have selected Mozzarella cheese.");
                    writer.println("Cheese: " + cheeseOption);
                    break;
                case "5":
                    cheeseOption = "Pepper Jack";
                    System.out.println("You have selected Pepper Jack cheese.");
                    writer.println("Cheese: " + cheeseOption);
                    break;
                case "0":
                    System.out.println("Going Back");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        } catch (IOException e) {
            System.out.println("Failed to write to receipt file: " + e.getMessage());
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

            try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
                String toppingOption = "";

                switch (input.toUpperCase()) {
                    case "1":
                        toppingOption = "Lettuce";
                        System.out.println("You have selected Lettuce.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "2":
                        toppingOption = "Peppers";
                        System.out.println("You have selected Peppers.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "3":
                        toppingOption = "Onions";
                        System.out.println("You have selected Onions.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "4":
                        toppingOption = "Tomatoes";
                        System.out.println("You have selected Tomatoes.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "5":
                        toppingOption = "Jalapenos";
                        System.out.println("You have selected Jalapenos.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "6":
                        toppingOption = "Pickles";
                        System.out.println("You have selected Pickles.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "7":
                        toppingOption = "Guacamole";
                        System.out.println("You have selected Guacamole.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "8":
                        toppingOption = "Mushrooms";
                        System.out.println("You have selected Mushrooms.");
                        writer.println("Other Topping: " + toppingOption);
                        break;
                    case "0":
                        System.out.println("Going Back");
                        break;
                    default:
                        System.out.println("Invalid input, please try again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Failed to write to receipt file: " + e.getMessage());
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    private static void selectSauces() {
        String input;
        do {
            System.out.println("--Sauces--");
            System.out.println("\t1: Mayo");
            System.out.println("\t2: Mustard");
            System.out.println("\t3: Ketchup");
            System.out.println("\t4: Ranch");
            System.out.println("\t5: Thousand Island");
            System.out.println("\t6: Vinaigrette");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
                String sauceOption = "";

                switch (input.toUpperCase()) {
                    case "1":
                        sauceOption = "Mayo";
                        System.out.println("You have selected Mayo.");
                        writer.println("Sauce: " + sauceOption);
                        break;
                    case "2":
                        sauceOption = "Mustard";
                        System.out.println("You have selected Mustard.");
                        writer.println("Sauce: " + sauceOption);
                        break;
                    case "3":
                        sauceOption = "Ketchup";
                        System.out.println("You have selected Ketchup.");
                        writer.println("Sauce: " + sauceOption);
                        break;
                    case "4":
                        sauceOption = "Ranch";
                        System.out.println("You have selected Ranch.");
                        writer.println("Sauce: " + sauceOption);
                        break;
                    case "5":
                        sauceOption = "Thousand Island";
                        System.out.println("You have selected Thousand Island.");
                        writer.println("Sauce: " + sauceOption);
                        break;
                    case "6":
                        sauceOption = "Vinaigrette";
                        System.out.println("You have selected Vinaigrette.");
                        writer.println("Sauce: " + sauceOption);
                        break;
                    case "0":
                        System.out.println("Going Back");
                        break;
                    default:
                        System.out.println("Invalid input, please try again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Failed to write to receipt file: " + e.getMessage());
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    private static void addDrinks() {
        String input;
        Drink drink = null; // Declare the drink object outside the loop
        do {
            System.out.println("---Drinks---");
            System.out.println("\t1: Drink Size");
            System.out.println("\t2: Drink Flavor");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "1":
                    System.out.println("Select Drink Size:");
                    drink = new Drink(); // Create a new instance of Drink
                    drink.orderDrink(); // Call orderDrink() to initialize the drink object
                    try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
                        writer.println("Drink Size: " + drink.getSize());
                    } catch (IOException e) {
                        System.out.println("Failed to write to receipt file: " + e.getMessage());
                    }
                    break;
                case "2":
                    if (drink != null) {
                        System.out.println("Select Drink Flavor:");
                        drink.displayAvailableDrinkFlavors();
                        String customerFlavorChoice = drink.getCustomerDrinkFlavor();
                        System.out.println("You selected flavor: " + customerFlavorChoice);
                        try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
                            writer.println("Drink Flavor: " + customerFlavorChoice);
                        } catch (IOException e) {
                            System.out.println("Failed to write to receipt file: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Please select the drink size first.");
                    }
                    break;
                case "0":
                    if (drink != null) {
                        order.addProduct(drink); // Pass the drink object to addProduct()
                        drink = null; // Reset the drink object
                    }
                    System.out.println("Going Back");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (!input.equalsIgnoreCase("0"));
    }

    private static void addChips() {
        String input;
        do {
            System.out.println("---Chips---");
            System.out.println("\t1: Lays Original");
            System.out.println("\t2: Lays BBQ");
            System.out.println("\t3: Jalapeno Kettle");
            System.out.println("\t4: Doritos");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
                switch (input) {
                    case "1":
                        String chipsOption = "Lays Original";
                        System.out.println("You have selected Lays Original Chips.");
                        writer.println("Chips: " + chipsOption);
                        break;
                    case "2":
                        chipsOption = "Lays BBQ";
                        System.out.println("You have selected Lays BBQ Chips.");
                        writer.println("Chips: " + chipsOption);
                        break;
                    case "3":
                        chipsOption = "Jalapeno Kettle";
                        System.out.println("You have selected Jalapeno Kettle Chips.");
                        writer.println("Chips: " + chipsOption);
                        break;
                    case "4":
                        chipsOption = "Doritos";
                        System.out.println("You have selected Doritos Chips.");
                        writer.println("Chips: " + chipsOption);
                        break;
                    case "0":
                        System.out.println("Going Back");
                        break;
                    default:
                        System.out.println("Invalid input, please try again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Failed to write to receipt file: " + e.getMessage());
            }
        } while (!input.equals("0"));
    }



    private static void checkout() {
        order.checkout();

        System.out.println("Select an option:");
        System.out.println("1. Confirm order and create receipt");
        System.out.println("2. Cancel order and go back to the home screen");

        int optionChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        if (optionChoice == 1) {
            // Process order confirmation and create receipt
            System.out.println("Order confirmed! Receipt created.");
        } else if (optionChoice == 2) {
            // Cancel order and go back to the home screen
            order.clearOrder();
            System.out.println("Order canceled. Going back to the home screen.");
        } else {
            System.out.println("Invalid option selected. Going back to the home screen.");
        }
    }


    private static void drinkSize() {
        String input;
        do {
            System.out.println("---Drink Sizes---");
            System.out.println("\t1: Small");
            System.out.println("\t2: Medium");
            System.out.println("\t3: Large");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
                switch (input.toUpperCase()) {
                    case "1":
                        String sizeOption = "Small";
                        System.out.println("You have selected Small.");
                        writer.println("Size: " + sizeOption);
                        break;
                    case "2":
                        sizeOption = "Medium";
                        System.out.println("You have selected Medium.");
                        writer.println("Size: " + sizeOption);
                        break;
                    case "3":
                        sizeOption = "Large";
                        System.out.println("You have selected Large.");
                        writer.println("Size: " + sizeOption);
                        break;
                    case "0":
                        System.out.println("Going Back");
                        break;
                    default:
                        System.out.println("Invalid input, please try again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Failed to write to receipt file: " + e.getMessage());
            }
        } while (!input.equalsIgnoreCase("0"));
    }


    private static void drinkFlavor() {
        String input;
        do {
            System.out.println("---Drink Flavors---");
            System.out.println("\t1: Coke");
            System.out.println("\t2: Sprite");
            System.out.println("\t3: Dr.Pepper");
            System.out.println("\t4: Lemonade");
            System.out.println("\t5: Sweet Tea");
            System.out.println("\t0: Back");

            input = scanner.nextLine();

            try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
                switch (input.toUpperCase()) {
                    case "1":
                        String flavorOption = "Coke";
                        System.out.println("You have selected Coke.");
                        writer.println("Flavor: " + flavorOption);
                        break;
                    case "2":
                        flavorOption = "Sprite";
                        System.out.println("You have selected Sprite.");
                        writer.println("Flavor: " + flavorOption);
                        break;
                    case "3":
                        flavorOption = "Dr.Pepper";
                        System.out.println("You have selected Dr.Pepper.");
                        writer.println("Flavor: " + flavorOption);
                        break;
                    case "4":
                        flavorOption = "Lemonade";
                        System.out.println("You have selected Lemonade.");
                        writer.println("Flavor: " + flavorOption);
                        break;
                    case "5":
                        flavorOption = "Sweet Tea";
                        System.out.println("You have selected Sweet Tea.");
                        writer.println("Flavor: " + flavorOption);
                        break;
                    case "0":
                        System.out.println("Going Back");
                        break;
                    default:
                        System.out.println("Invalid input, please try again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Failed to write to receipt file: " + e.getMessage());
            }
        } while (!input.equalsIgnoreCase("0"));
    }

}


