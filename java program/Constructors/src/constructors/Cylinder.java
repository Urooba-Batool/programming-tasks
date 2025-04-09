/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author admin
 */
public class Cylinder {
    private double height;
    private double radius;
    Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double surfaceArea()
    {
        return 2*3.142*radius*height + 2*3.142*radius*radius;
    }
    public double volume()
    {
        return 3.142*radius*radius*height;
    }
}
