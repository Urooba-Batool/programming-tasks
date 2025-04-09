/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Flight {
    Scanner input = new Scanner(System.in);
    private int flightnumber;
    private String source;
    private String destination;
    private int seats;
    
    private String shortAndCapital (String name) 
    {
        if (name.length() <= 3) 
        {
            return name.toUpperCase();
        }
        else 
        {
            return name.substring(0,3).toUpperCase();
        }
    }
    Flight(int flightnumber, String destination, String source, int seats)
    {
        this.flightnumber = flightnumber;
        this.seats = seats;
        this.destination = shortAndCapital(destination);
        this.source = shortAndCapital(source);
        
    }
    Flight(int flightnumber, int seats)
    {
        this.flightnumber = flightnumber;
        this.seats = seats;
        this.source = "";
        this.destination = "";
    }
    Flight(int flightnumber)
    {
        this.flightnumber = flightnumber;
        this.destination = "";
        this.source = "";
        this.seats = 0;
    }
    public void reserve(int numberOfSeats)
    {
        if(numberOfSeats <= seats)
        {
            seats -= numberOfSeats;
            System.out.println(numberOfSeats+" seats reserved for you \n"+seats+" seats available now");
        }
        else
        {
            System.out.println("Not enough seats available for reservation");
        }
    }
    public void cancel(int numberOfSeats) 
    {
        System.out.print("Are you sure you want to cancel your seat reservation? (y/n): ");
        String sure = input.next();
        if(sure == "y")
        {
            if(numberOfSeats > 0)
            {
                seats += numberOfSeats;
                System.out.println(numberOfSeats+" reservation cancelled \n"+seats+" seats available now");
            }
            else
            {
                System.out.println("Invalid number of seats entered for cancellation");
            }
        }
        else
        {
            System.out.println("Your resevation cancellation request was successfully ignored");
        }
    }
    public String toString()
    {
        return "Flight no: "+flightnumber+"\nSource: "+source+"\nDestination: "+destination+"\nNo. of seats available: "+seats;
    }
    public void display()
    {
        System.out.println("-------Flight Details-------");
        System.out.println(toString());
    }
    public boolean equal(Flight alternative)
    {
        return this.flightnumber == alternative.flightnumber;
    }
}
