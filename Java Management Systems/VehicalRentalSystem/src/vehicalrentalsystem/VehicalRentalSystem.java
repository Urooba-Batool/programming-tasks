package vehicalrentalsystem;
import java.util.Scanner;
public class VehicalRentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehical c = new Car("113","bmw", 2000, 500);
        Vehical b= new Bike("Yamaha","112", 3500, 400);
        Vehical t = new Truck("suzuki", "114", 5000, 1000);
        
        System.out.println(c.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());
        
        System.out.println("DO you want to update anythin?: ");
        String ans = input.next();
        
        String again;
        if(ans.equalsIgnoreCase("yes"))
        {
            do
            {
                System.out.println("What do you want to update: \n1.Car \n2.Bike \n3.Truck");
                int choice = input.nextInt();
                
                switch(choice)
                {
                    case 1: 
                        System.out.println("Select: \n1.Model \n2.brand \n3.base price \n4.luxary tax");
                        int select = input.nextInt();
                        switch(select)
                        {
                            case 1: 
                                System.out.println("Enter model: ");
                                String model = input.next();
                                c.setModel(model);
                                break;
                            case 2: 
                                System.out.println("Enter brand: ");
                                String brand = input.next();                                
                                c.setBrand(brand);
                                break;
                            case 3: 
                                System.out.println("Enter base price: ");
                                double basePrice = input.nextDouble();
                                c.setBasePrice(basePrice);
                                break;  
                            case 4: 
                                System.out.println("Enter luxary tax: ");
                                double luxaryTax = input.nextDouble();
                                ((Car)c).setLuxuryTax(luxaryTax);
                                break;
                        }
                        System.out.println(c.toString());
                        break;
                    case 2: 
                        System.out.println("Select: \n1.Model \n2.brand \n3.base price \n4.helmet fee");
                        select = input.nextInt();
                        switch(select)
                        {
                            case 1: 
                                System.out.println("Enter model: ");
                                String model = input.next();
                                c.setModel(model);
                                break;
                            case 2: 
                                System.out.println("Enter brand: ");
                                String brand = input.next();                                
                                c.setBrand(brand);
                                break;
                            case 3: 
                                System.out.println("Enter base price: ");
                                double basePrice = input.nextDouble();
                                c.setBasePrice(basePrice);
                                break;
                            case 4: 
                                System.out.println("Enter helmet fee: ");
                                double helmetFee = input.nextDouble();
                               ((Bike)b).setHelmetFee(helmetFee);
                                break;
                        }
                        System.out.println(b.toString());
                        break;
                    case 3: 
                        System.out.println("Select: \n1.Model \n2.brand \n3.base price \n4.load capacity fee");
                        select = input.nextInt();
                        switch(select)
                        {
                            case 1: 
                                System.out.println("Enter model: ");
                                String model = input.next();
                                c.setModel(model);
                                break;
                            case 2: 
                                System.out.println("Enter brand: ");
                                String brand = input.next();                                
                                c.setBrand(brand);
                                break;
                            case 3: 
                                System.out.println("Enter base price: ");
                                double basePrice = input.nextDouble();
                                c.setBasePrice(basePrice);
                                break;
                            case 4: 
                                System.out.println("Enter load capacity fee: ");
                                double loadCapacityFee = input.nextDouble();
                               ((Truck)t).setLoadCapacityFee(loadCapacityFee);
                                break;
                        }
                        System.out.println(t.toString());
                        break;
                }
                System.out.println("Do you want to update anything else? ");
                again = input.next();
            }
            while(again.equalsIgnoreCase("yes"));
        }
    }
    
}
