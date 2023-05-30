package com.deli;

import java.util.Scanner;

public class selectToppings{
    private Scanner scanner;
    public  selectToppings(){
        scanner = new Scanner(System.in);

    }

    public  void selectToppings(String itemName) {
        switch (itemName){
            case "Sandwich":
                System.out.println("Choose a Topping");
                System.out.println("1. Lettuce");
                System.out.println("2. Tomato");
                System.out.println("3. Onions");
                System.out.println("4. Peppers");
                System.out.println("5. Jalepenos");
                System.out.println("6. Cucumbers");
                System.out.println("7. Mushrooms");
                System.out.println("8. Guacamole");

                int toppingChoice;
                do{
                    toppingChoice = scanner.nextInt();
                    switch (toppingChoice){
                        case 1:
                            System.out.println("Added Lettuce");
                            break;
                        case 2:
                            System.out.println("Added Tomato");
                        case 3:
                            System.out.println(" Added Onions");
                        case 4:
                            System.out.println("Added Peppers ");
                        case 5:
                            System.out.println("Added ");
                    }
                }


        }
    }






}

