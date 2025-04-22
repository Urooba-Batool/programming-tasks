
package methodoverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        System.out.println(c.sum(7.5, 3));
        System.out.println(c.sum(3.5, 7.5));
        System.out.println(c.sum(2, 6.1));
        System.out.println(c.sum(5, 5));
        System.out.println(c.sum(7, 2, 1));
        System.out.println(c.sum(2, 3, 7, 8));
    }
    
}
