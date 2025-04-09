/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes.and.objects;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Student {
    Scanner input = new Scanner(System.in);
    String name;
    String fathername;
    String grade;
    int roll_no;
    
    public void input()
    {
        System.out.print("enter name: ");
        name = input.next();
        System.out.print("enter father name: ");
        fathername = input.next();
        System.out.print("enter grade: ");
        grade = input.next();
        System.out.print("enter roll no: ");
        roll_no = input.nextInt();
    }
    public void displaystdinfo()
    {
        System.out.println("student name: "+name);
        System.out.println("student father name: "+fathername);
        System.out.println("student grade: "+grade);
        System.out.println("student roll no: "+roll_no);
    }
    void updatestdinfo()
    {
        System.out.println("What do you want to update? \n1) Your Name \n2) Your father name \n3) Your grade \n4) Your roll no ");
        int choice = input.nextInt();
        
        switch(choice)
        {
            case 1:
            System.out.println("Enter your name updated: ");
            name = input.next();
            break;
            
            case 2:
                System.out.println("Enter your father name updated: ");
                fathername = input.next();
                break;
            
            case 3:
                System.out.println("Enter your grade updated: ");
                grade = input.next();
                break;

            case 4:
                System.out.println("Enter your roll no updated: ");
                roll_no = input.nextInt();
                break;
                
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    
}
