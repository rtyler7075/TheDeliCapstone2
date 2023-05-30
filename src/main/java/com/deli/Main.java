package com.deli;

public class Main {
    public static void main(String[] args) {


        private static void addDrinks() {
            String input;
            do{
                System.out.println("---Drinks---");
                System.out.println("\t1: Drink Size");
                System.out.println("\t2: Drink Flavor");

            }
        }
        private static void addChips() {

            String input;
            do{
                System.out.println("---Chips---");
                System.out.println("\t1: Lays Original");
                System.out.println("\t2: Lays BBQ");
                System.out.println("\t3: Jalapeno Kettle");
                System.out.println("\t4: Doritos");
                System.out.println("\t0: Cancel Order");

                String input = scanner.nextLine();

                switch (input.toUpperCase()){
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
                        break;;
                    case "0":
                        System.out.println("Cancelling Order...");
                        break;
                    default:
                        System.out.println("Invalid Input");

                }
            }
        }


    }
}

