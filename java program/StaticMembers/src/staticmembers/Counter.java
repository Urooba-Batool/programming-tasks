/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticmembers;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Counter {
    Scanner input = new Scanner(System.in);
    
    private static int count = 0;
    private String name;
    
    Counter(String name)
    {
        count++;
        this.name = name;
    }
    
    public void display()
    {
        System.out.println("Name = "+name);
    }
    public static void staticdisplay()
    {
        System.out.println("no of object: "+count);
    }
}
