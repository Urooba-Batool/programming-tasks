
package polymorphism;

public class Polymorphism {

    public static void main(String[] args) 
    {
        Shape c = new Circle(24);     
        Shape s = new Square(41);     
        Shape r = new Rectangle(18, 12);

        c.getArea();
        c.display();

        s.getArea();
        s.display();

        r.getArea();
        r.display();
        
        
        
        
        
        
        
//        
//        Employee firstEmployee = new SalaryEmployee("Usman", "Ali", "111-11-1111", 800.00);
//        Employee secondEmployee = new CommissionEmployee("Atif", "Aslam", "222-22-2222", 10000, 0.06);
//        Employee thirdEmployee = new BasePlusCommissionEmployee("Rana", "Naseeb", "333-33-3333", 5000, 0.04, 300);
//        Employee fourthEmployee = new HourlyEmployee("Renson", "Isaac", "444-44-4444", 16.75, 40);
//
//        System.out.println(firstEmployee); 
//        System.out.println(firstEmployee.earnings()); 
//        System.out.println(secondEmployee); 
//        System.out.println(secondEmployee.earnings()); 
//        System.out.println(thirdEmployee); 
//        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee; 
//        double oldBaseSalary = currentEmployee.getBaseSalary(); 
//        System.out.println( "old base salary: " + oldBaseSalary) ;
//        currentEmployee.setBaseSalary(1.10 * oldBaseSalary); 
//        System.out.println("new base salary with 10% increase is:"+ currentEmployee.getBaseSalary()); 
//        System.out.println(thirdEmployee.earnings() ); 
//        System.out.println(fourthEmployee); 
//        System.out.println(fourthEmployee.earnings() );
        
        
        
    }    
}
