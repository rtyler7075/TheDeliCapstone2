package com.deli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chips {
    private List<String> availableChips;

    public Chips() {
        availableChips = new ArrayList<>();
        availableChips.add("Regular");
        availableChips.add("Barbecue");
        availableChips.add("Sour Cream and Onion");
        availableChips.add("Salt and Vinegar");
    }

    public void displayAvailableChips() {
        System.out.println("Available Chips:");
        for (int i = 0; i < availableChips.size(); i++) {
            System.out.println((i + 1) + ". " + availableChips.get(i));
        }
    }

    public String getCustomerChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your chosen chip: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= availableChips.size()) {
            return availableChips.get(choice - 1);
        } else {
            System.out.println("Invalid choice. Please try again.");
            return getCustomerChips();
        }
    }

    public static void main(String[] args) {
        Chips chips = new Chips();
        chips.displayAvailableChips();
        String customerChoice = chips.getCustomerChips();
        System.out.println("You selected: " + customerChoice + " chip.");
    }
}
