/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticmembers;

/**
 *
 * @author admin
 */
public class Account {
    private String accHolder;
    private double balance; 
    private static int totalAcc = 0;
    
    Account(String accountHolder, double balance)
    {
        this.accHolder = accountHolder;
        this.balance = balance;
        totalAcc++;
    }
    public void display()
    {
        System.out.println("Account Holder Name: "+accHolder);
        System.out.println("Account Balance: "+balance);
    }
    public static void displayStatic()
    {
        System.out.println("Total Accounts: "+totalAcc);
    }
}
