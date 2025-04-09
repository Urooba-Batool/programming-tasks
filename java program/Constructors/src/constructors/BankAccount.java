/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author admin
 */
public class BankAccount {
    private String accountholder;
    private double balance;
    
    BankAccount()
    {
        this.accountholder = "Unknown";
        this.balance = 0.0;
        System.out.println("New account created with default values");
    }
    BankAccount(String name)
    {
        this.accountholder = name;
        this.balance = 0.0;
        System.out.println("New Account created with the name "+name+" and zero balance");
    }
    BankAccount(String name, double initialdeposit)
    {
        this.accountholder = name;
        this.balance = initialdeposit;
        System.out.println("New Account created with the name "+name+" and initial deposit "+initialdeposit);
    }
}
