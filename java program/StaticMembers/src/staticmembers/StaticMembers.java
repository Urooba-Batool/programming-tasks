/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticmembers;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class StaticMembers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        System.out.print("Enter the width of rectangle: ");
//        double w = input.nextDouble();
//        System.out.print("Enter the height of rectangle: ");
//        double h = input.nextDouble();
//        Rectangle r1 = new Rectangle(w, h);
//        r1.display();
//        Rectangle.area(w, h);
        
        
//        System.out.print("Enter the name of account holder: ");
//        String holderName = input.next();
//        System.out.print("Enter the amount in the account: ");
//        double amount = input.nextDouble();
//        Account a1 = new Account(holderName,amount);
//        a1.display();
//        Account.displayStatic();
//        System.out.print("Enter the name of account holder: ");
//        holderName = input.next();
//        System.out.print("Enter the amount in the account: ");
//        amount = input.nextDouble();
//        Account a2 = new Account(holderName,amount);
//        a2.display();
//        Account.displayStatic();
//        System.out.print("Enter the name of account holder: ");
//        holderName = input.next();
//        System.out.print("Enter the amount in the account: ");
//        amount = input.nextDouble();
//        Account a3 = new Account(holderName,amount);
//        a3.display();
//        Account.displayStatic();
//        System.out.print("Enter the name of account holder: ");
//        holderName = input.next();
//        System.out.print("Enter the amount in the account: ");
//        amount = input.nextDouble();
//        Account a4 = new Account(holderName,amount);
//        a4.display();
//        Account.displayStatic();


        
//        System.out.print("Enter name: ");
//        String n = input.next();
//        Counter c1 = new Counter(n);
//        c1.display();
//        Counter.staticdisplay();
//        System.out.print("Enter name: ");
//        n = input.next();
//        Counter c2 = new Counter(n);
//        c2.display();
//        Counter.staticdisplay();
//        System.out.print("Enter name: ");
//        n = input.next();
//        Counter c3 = new Counter(n);
//        c3.display();
//        Counter.staticdisplay();
          

        
        
        System.out.print("Enter students name: ");
        String name = input.next();
        System.out.print("Enter students enrollment number: ");
        int enroll = input.nextInt();
        Students st1 = new Students(name,enroll); 
        st1.display();
        Students.displaystatic();
        System.out.print("Enter students name: ");
        name = input.next();
        System.out.print("Enter students enrollment number: ");
        enroll = input.nextInt();
        Students st2 = new Students(name,enroll); 
        st2.display();
        Students.displaystatic();
        System.out.print("Enter students name: ");
        name = input.next();
        System.out.print("Enter students enrollment number: ");
        enroll = input.nextInt();
        Students st3 = new Students(name,enroll); 
        st3.display();
        Students.displaystatic();
          
    }
    
}
