/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticmembers;

/**
 *
 * @author admin
 */
public class Rectangle {
    private double width;
    private double height;
    
    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public void display()
    {
        System.out.println("The width of rectangle: "+width);
        System.out.println("The height of rectangle: "+height);
    }
    public static double calArea(double width, double height)
    {
        return height*width;
    }
    public static void area(double width, double height)
    {
        System.out.println("The area of rectangle: "+calArea(width, height));
    }
    
}
