package com.deli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Chips extends Product {

    private List<String> availableChips;

    public Chips() {
        availableChips = new ArrayList<>();
        availableChips.add("Lays Original");
        availableChips.add("Lays BBQ");
        availableChips.add("Jalapeno Kettle");
        availableChips.add("Doritos");
    }

    public void availableChips() {
        System.out.println("Available Chips:");
        for (int i = 0; i < availableChips.size(); i++) {
            System.out.println((i + 1) + ". " + availableChips.get(i));
        }
    }

    public String getCustomerChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your chosen chip: ");
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // Consume the invalid input
            return getCustomerChips();
        }

        if (choice >= 1 && choice <= availableChips.size()) {
            return availableChips.get(choice - 1);
        } else {
            System.out.println("Invalid choice. Please try again.");
            return getCustomerChips();
        }
    }

    public static void displayAvailableChips() {
        Chips chips = new Chips();
        chips.availableChips();
        String customerChoice = chips.getCustomerChips();
        System.out.println("You selected: " + customerChoice + " chip.");
    }

    @Override
    public double getPrice() {
        return 1.50; // Set the price for chips
    }

    public void addChipsToReceipt(String customerChips) {
        double chipPrice = getPrice(); // Get the price of the chips

        try {
            FileWriter writer = new FileWriter("20230530-121523.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(customerChips + " - $" + chipPrice);
            bufferedWriter.newLine();

            bufferedWriter.close();
            writer.close();

            System.out.println("Chips added to receipt");
        } catch (IOException e) {
            System.out.println("Error writing to the receipt file: " + e.getMessage());
        }
    }

}

