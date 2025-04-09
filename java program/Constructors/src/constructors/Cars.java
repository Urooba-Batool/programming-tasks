/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author admin
 */
public class Cars {
    private String model;
    private int milage;
    
    Cars()
    {
        this.model = "Unknown model";
        this.milage = 0;
        System.out.println("A new car is created with default values");
    }
    void display()
    {
        System.out.println("Model: "+model);
        System.out.println("Milage: "+milage);
    }
}
