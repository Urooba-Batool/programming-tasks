    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accessmodifiers;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class AccessModifiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        Cylinder cy = new Cylinder();
        
        System.out.print("Enter radius: ");
        double r = inpt.nextDouble();
        cy.setradius(r);
        System.out.print("Enter height: ");
        double h = inpt.nextDouble();
        cy.setheight(h);
        System.out.println("Radius = "+cy.getradius());
        System.out.println("height = "+cy.getheight());
        System.out.println("the surface area is: "+cy.surfacearea());
        System.out.println("the volume is: "+cy.volume());
    }
    
}
