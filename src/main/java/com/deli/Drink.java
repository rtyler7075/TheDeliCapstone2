package com.deli;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink extends Product {
    private List<String> availableDrinkSize;
    private List<String> availableDrinkFlavor;
    private String selectedDrinkSize;
    private String selectedDrinkFlavor;
    private String customerSizeChoice;
    private String customerFlavorChoice;

    public Drink() {
        availableDrinkSize = new ArrayList<>();
        availableDrinkSize.add("Small");
        availableDrinkSize.add("Medium");
        availableDrinkSize.add("Large");

        availableDrinkFlavor = new ArrayList<>();
        availableDrinkFlavor.add("Coke");
        availableDrinkFlavor.add("Sprite");
        availableDrinkFlavor.add("Dr. Pepper");
        availableDrinkFlavor.add("Lemonade");
        availableDrinkFlavor.add("Sweet Tea");
    }

    public void displayAvailableDrinkSize() {
        System.out.println("Available Drink Sizes:");
        for (int i = 0; i < availableDrinkSize.size(); i++) {
            System.out.println((i + 1) + ". " + availableDrinkSize.get(i));
        }
    }

    public String getCustomerDrinkSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your chosen drink size: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (choice >= 1 && choice <= availableDrinkSize.size()) {
            customerSizeChoice = availableDrinkSize.get(choice - 1); // Assign the chosen size to customerSizeChoice
            return customerSizeChoice;
        } else {
            System.out.println("Invalid choice. Please try again.");
            return getCustomerDrinkSize();
        }
    }


    public void displayAvailableDrinkFlavors() {
        System.out.println("Available Drink Flavors:");
        for (int i = 0; i < availableDrinkFlavor.size(); i++) {
            System.out.println((i + 1) + ". " + availableDrinkFlavor.get(i));
        }
    }

    public String getCustomerDrinkFlavor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your chosen drink flavor: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= availableDrinkFlavor.size()) {
            return availableDrinkFlavor.get(choice - 1);
        } else {
            System.out.println("Invalid choice. Please try again.");
            return getCustomerDrinkFlavor();
        }
    }

    public void orderDrink() {
        displayAvailableDrinkSize();
        String customerSizeChoice = getCustomerDrinkSize();
        System.out.println("You selected size: " + customerSizeChoice);

        displayAvailableDrinkFlavors();
        String customerFlavorChoice = getCustomerDrinkFlavor();
        System.out.println("You selected flavor: " + customerFlavorChoice);

        addDrinkToReceipt(customerSizeChoice, customerFlavorChoice);
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        if (customerSizeChoice != null) {
            if (customerSizeChoice.equals("Small")) {
                price = 2.00;
            } else if (customerSizeChoice.equals("Medium")) {
                price = 2.50;
            } else if (customerSizeChoice.equals("Large")) {
                price = 3.00;
            }
        }
        return price;
    }

    public void addDrinkToReceipt(String customerSizeChoice, String customerFlavorChoice) {
        this.customerSizeChoice = customerSizeChoice; // Assign the value to the instance variable
        this.customerFlavorChoice = customerFlavorChoice; // Assign the value to the instance variable

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/main/java/com/deli/20230530-121523.txt", true))) {
            bufferedWriter.write("Size: " + customerSizeChoice);
            bufferedWriter.newLine();
            bufferedWriter.write("Flavor: " + customerFlavorChoice);
            bufferedWriter.newLine();
            System.out.println("Drink added to receipt");
        } catch (IOException e) {
            System.out.println("Error writing to the receipt file: " + e.getMessage());
        }
    }

    public String getSize() {
        return customerSizeChoice;
    }

    public String getFlavor() {
        return customerFlavorChoice;
    }
}
