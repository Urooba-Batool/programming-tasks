/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Constructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the flight number of flight 1: ");
        int flightnumber1 = input.nextInt();
        System.out.print("ENter the source of flight 1: ");
        String source1 = input.next();
        System.out.print("Enter the destination of flight 1: ");
        String destination1 = input.next();
        System.out.print("Enter the available seats of flight 1: ");
        int seats1 = input.nextInt();
        
        Flight f1 = new Flight(flightnumber1, source1, destination1, seats1);
        
        System.out.print("\nEnter the flight number of flight 2: ");
        int flightnumber2 = input.nextInt();
        System.out.print("ENter the source of flight 2: ");
        String source2 = input.next();
        System.out.print("Enter the destination of flight 2: ");
        String destination2 = input.next();
        System.out.print("Enter the available seats of flight 2: ");
        int seats2 = input.nextInt();
        
        Flight f2 = new Flight(flightnumber2, source2, destination2, seats2);
        
        System.out.println("\n\nThe flight details of flight 1:");
        f1.display();
        System.out.println("\n\nThe flight details of flight 2:");
        f2.display();
        System.out.println("\n\nWhat do you want to find?: \n1. Reserve seats \n2. Cancel reservation \n3. Compare flights");
        int choice = input.nextInt();
        
        switch(choice)
        {
            case 1: 
                System.out.println("In which flight you want to make seat reservations? \n1. flight 1 \n2. flight 2");
                int sr = input.nextInt();
                if(sr == 1)
                {
                    System.out.println("Enter the number of seats you want yo reserve in flight 1: ");
                    int numberOfSeats = input.nextInt();
                    f1.reserve(numberOfSeats);
                }
                else if(sr == 2)
                {
                    System.out.println("Enter the number of seats you want yo reserve in flight 2: ");
                    int numberOfSeats = input.nextInt();
                    f2.reserve(numberOfSeats);
                }
                else
                {
                    System.out.println("Invalid flight");
                }
                break;
            case 2:
                System.out.println("In which flight you want to cancel the seat reservation? \n1. flight 1 \n2. flight 2");
                int sc = input.nextInt();
                if(sc == 1)
                {
                    System.out.println("Enter the number of seats you want to cancel in flight 1: ");
                    int numberOfSeats = input.nextInt();
                    f1.cancel(numberOfSeats);
                }
                else if(sc == 2)
                {
                    System.out.println("Enter the number of seats you want yo cancel in flight 2: ");
                    int numberOfSeats = input.nextInt();
                    f2.cancel(numberOfSeats);
                }
                else
                {
                    System.out.println("Invalid flight");
                }
                break;
            case 3: 
                System.out.println("Comparision between flight 1 and flight 2");
                System.out.println(f1.equals(f2));
        }
        
        
        
        
        
        
        
        
        
        
        
//        Cylinder cy = new Cylinder(5,7);
//        System.out.println("The surface area of cylinder is: "+cy.surfaceArea());
//        System.out.println("The volume of cylinder is: "+cy.volume());
//        
        
//        Cars c = new Cars();
//        c.display();
//        System.out.println("How do you want to create your account?: \n1. Without providing any details \n2. By only providing a name \n3. By providing both name and an initial deposit.");
//        int choice = input.nextInt();
//        switch(choice)
//        {
//            case 1: 
//                BankAccount ba = new BankAccount();
//                break;
//            case 2:
//                BankAccount ba1 = new BankAccount("urooba");
//                break;
//            case 3:
//                BankAccount ba2 = new BankAccount("urooba", 90000);
//                break;
//        }
    }
    
}
