/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodoverloading;

/**
 *
 * @author admin
 */
public class Calculator {
    public int sum(int a, int b)
    {
        return a+b;
    }
    public int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public int sum(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }
    public double sum(double a, double b)
    {
        return a+b;
    }
    public double sum(int a, double b)
    {
        return a+b;
    }
    public double sum(double a, int b)
    {
        return a+b;
    }
    
}
