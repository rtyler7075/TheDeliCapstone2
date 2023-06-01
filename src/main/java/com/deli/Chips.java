package com.deli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Chips extends Product{


    private List<String> availableChips;

    public Chips() {
        availableChips = new ArrayList<>();
        availableChips.add("Lays Original");
        availableChips.add("Lays BBQ");
        availableChips.add("Jalapeno Kettle");
        availableChips.add("Doritos");
    }

    public void AvailableChips() {
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

    public static void displayAvailableChips(){
        Chips chips = new Chips();
        chips.displayAvailableChips();
        String customerChoice = chips.getCustomerChips();
        System.out.println("You selected: " + customerChoice + " chip.");
    }

    public void addChipsToReceipt(String customerChips){
        try{
            FileWriter writer = new FileWriter("20230530-121523.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(customerChips);
            bufferedWriter.newLine();

            bufferedWriter.close();
            writer.close();

            System.out.println("Chips added to receipt");
        } catch (IOException e) {
            System.out.println("Error writing to the receipt file: " + e.getMessage());
        }
    }
}
