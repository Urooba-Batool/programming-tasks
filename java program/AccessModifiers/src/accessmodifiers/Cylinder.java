/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessmodifiers;

/**
 *
 * @author admin
 */
public class Cylinder {
    private double radius;
    private double height;  
    private double pie = 3.142;
    public double getradius()
    {
        return radius;
    }
    
    public void setradius(double radius)
    {
        this.radius = radius;
    }
    public double getheight()
    {
        return height;
    }
    public void setheight(double height)
    {
        this.height = height;
    }
    public double surfacearea()
    {
        return 2*pie*radius*radius + 2*pie*radius*height;
    }
    public double volume()
    {
        return pie*radius*radius*height;
    }
}
