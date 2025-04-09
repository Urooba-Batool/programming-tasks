/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classes.and.objects;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Automobile {
    Scanner input = new Scanner(System.in);
    boolean state = false;
    String color = "Black";   
    String company = "bmw";
    String engine = "v5";
    int horse_power = 600;
    

    

    // Method to start the car
    public void state_of_car() {
        if (!state) {
            System.out.println("Car is off");
            System.out.println("Do you want to start the car? \n 1. yes \n 2. no");
            int choice=input.nextInt();
            if (choice==1)
            {
            carstarted=true;
            System.out.println("----CAR STARTED----");
            }
            else
            {
            System.out.println("---CAR IS OFF------");
            }
            }
            }
        } else {
            System.out.println("The car is already in the ON/start state.");
            displayStatus();
        }
    }

    // Method to display the current status of the car
    public void displayStatus() {
        System.out.println("Current Status of the Car:");
        System.out.println("Color: " + color);
        System.out.println("Make: " + make);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horse Power: " + horsePower);
    }

    // Method to update car specifications
    public void updateSpecifications() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to update any specifications? (YES/NO)");
        String response = scanner.nextLine().trim().toUpperCase();

        if (response.equals("YES")) {
            System.out.println("Which specification do you want to update?");
            System.out.println("1. Color");
            System.out.println("2. Make");
            System.out.println("3. Engine Type");
            System.out.println("4. Horse Power");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter new color: ");
                    color = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new make: ");
                    make = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new engine type: ");
                    engineType = scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Enter new horse power: ");
                    horsePower = scanner.nextInt();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Specifications updated successfully.");
            displayStatus();
        } else {
            System.out.println("Exiting the program.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobile car = new Automobile("Red", "Toyota", "V6", 300);

        System.out.println("Welcome to the Automobile program!");
        System.out.print("Do you want to start the car? (YES/NO): ");
        String startResponse = scanner.nextLine().trim().toUpperCase();

        if (startResponse.equals("YES")) {
            car.startCar();
        } else {
            System.out.println("The car is not started.");
            System.out.print("Do you want to start the car? (YES/NO): ");
            String startAgainResponse = scanner.nextLine().trim().toUpperCase();
            if (startAgainResponse.equals("YES")) {
                car.startCar();
            } else {
                System.out.println("Exiting the program.");
                return;
            }
        }

        car.updateSpecifications();
    }
}
