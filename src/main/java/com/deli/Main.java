package com.deli;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addChips();

    }
        private static void addDrinks () {
            String input;
            do {
                System.out.println("---Drinks---");
                System.out.println("\t1: Drink Size");
                System.out.println("\t2: Drink Flavor");
                System.out.println("\t0: Back");

                input = scanner.nextLine();

                switch (input.toUpperCase()){
                    case "1":
                       drinkSize();
                       break;;
                    case "2":
                        drinkFlavor();
                        break;
                    case "0":
                        System.out.println("Canceling Order...");
                        break;
                    default:
                        System.out.println("Invalid Input");

                }

            }
        }


        private static void drinkSize(){
        String subInput;

        do{
            System.out.println("---Drink Sizes---");
            System.out.println("\t1: Small");
            System.out.println("\t2: Medium");
            System.out.println("\t3: Large");
            System.out.println("\t0: Back");

            subInput = scanner.nextLine();

            switch (subInput.toUpperCase()){
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
        }

        }

        private static void drinkFlavor(){
            String subInput;

            do{
                System.out.println("---Drink Flavors---");
                System.out.println("\t1: Coke");
                System.out.println("\t2: Sprite");
                System.out.println("\t3: Dr.Pepper");
                System.out.println("\t4: Lemonade");
                System.out.println("\t5: Sweet Tea");
                System.out.println("\t0: Back");

                subInput = scanner.nextLine();

                switch (subInput.toUpperCase()){
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
            }
        }


        private static void addChips () {

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
                    ;
                    case "0":
                        System.out.println("Cancelling Order...");
                        break;
                    default:
                        System.out.println("Invalid Input");

                }
            }while (!subInput.equalsIgnoreCase("0"));
        }

    }

