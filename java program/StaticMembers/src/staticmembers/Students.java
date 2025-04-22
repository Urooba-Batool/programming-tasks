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
public class Students {
    Scanner input = new Scanner(System.in);
    
    private String name;
    private int enrollment;
    private static int counter = 0;
    private static String university = "bahria";
    private static int semester = 2;
    
    Students(String name, int enrollment)
    {
        this.name = name;
        this.enrollment = enrollment;
    }
    
    public static int setRollNo()
    {
        counter++;
        return counter;
    }
    public void display()
    {
        System.out.println(setRollNo()+".  Name: "+name);
        System.out.println("Enrollment: "+enrollment);
    }
    public static void displaystatic()
    {
        System.out.println("Semester: "+semester);
        System.out.println("University: "+university);
    }
    
}
