package employeemanagementsystem;
import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Employee m = new Manager("urooba", "Software", 25000, 5000);
        Employee e = new Engineer("wajiha", "IT", 15000, 2);
        Employee i = new Intern("Muzzamil", "HR", 20000, 5);
        
        System.out.println(m.toString());
        System.out.println(e.toString());
        System.out.println(i.toString());
        
        String again;
        do{
            System.out.println("Do you want to update anything? ");
            String ans = input.next();
            
            if(ans.equalsIgnoreCase("yes"))
            {
                System.out.println("Select what you want to update: \n1.Manager \n2.Engineer \n3.Intern");
                int select = input.nextInt();
                
                switch (select)
                {
                    case 1: 
                        System.out.println("What record do you want to update? \n1.Name \n2.Department \n3.Basic Salary 4.Bonus");
                        int choice = input.nextInt();
                        switch(choice)
                        {
                            case 1: 
                                System.out.println("enter name: ");
                                String name = input.next();
                                m.setName(name); 
                                break;
                            case 2: 
                                System.out.println("enter department: ");
                                String department = input.next();
                                m.setDepartment(department); 
                                break;
                            case 3: 
                                System.out.println("enter Basic Salary: ");
                                double baseSalary = input.nextDouble();
                                m.setBaseSalary(baseSalary); 
                                break;
                            case 4: 
                                System.out.println("enter Bonus: ");
                                double bonus = input.nextDouble();
                                ((Manager)m).setBonus(bonus); 
                                break;                            
                        }
                        System.out.println(m.toString());
                        break;
                    case 2: 
                        System.out.println("What record do you want to update? \n1.Name \n2.Department \n3.Basic Salary 4.Experience");
                        choice = input.nextInt();
                        switch(choice)
                        {
                            case 1: 
                                System.out.println("enter name: ");
                                String name = input.next();
                                e.setName(name); 
                                break;
                            case 2: 
                                System.out.println("enter department: ");
                                String department = input.next();
                                e.setDepartment(department); 
                                break;
                            case 3: 
                                System.out.println("enter Basic Salary: ");
                                double baseSalary = input.nextDouble();
                                e.setBaseSalary(baseSalary); 
                                break;
                            case 4: 
                                System.out.println("enter Experience: ");
                                int experienceYears = input.nextInt();
                                ((Engineer)e).setExperienceYears(experienceYears); 
                                break;                            
                        }
                        System.out.println(e.toString());
                        break;
                    case 3: 
                        System.out.println("What record do you want to update? \n1.Name \n2.Department \n3.Basic Salary 4.Duration");
                        choice = input.nextInt();
                        switch(choice)
                        {
                            case 1: 
                                System.out.println("enter name: ");
                                String name = input.next();
                                i.setName(name); 
                                break;
                            case 2: 
                                System.out.println("enter department: ");
                                String department = input.next();
                                i.setDepartment(department); 
                                break;
                            case 3: 
                                System.out.println("enter Basic Salary: ");
                                double baseSalary = input.nextDouble();
                                i.setBaseSalary(baseSalary); 
                                break;
                            case 4: 
                                System.out.println("enter Duration: ");
                                int monthsDuration = input.nextInt();
                                ((Intern)i).setMonthsDuration(monthsDuration);
                                break;                            
                        }
                        System.out.println(i.toString());
                        break;
                }
            }
            System.out.println("Do you want to update anything again? ");
            again = input.next();
        }
        while(again.equalsIgnoreCase("yes"));

    }
    
}
