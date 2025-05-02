package vehicalrentalsystem;
public class Bike extends Vehical{
    private double helmetFee;
    
    Bike(String model, String brand, double basePrice, double helmetFee)
    {
        super(model, brand, basePrice);
        this.helmetFee = helmetFee;
    }
    public void setHelmetFee(double helmetFee)
    {
        this.helmetFee = helmetFee;
    }
    public double getHelmetFee()
    {
        return helmetFee;
    }
    public double calculateRent()
    {
        return basePrice+helmetFee;
    }
    public String toString()
    {
        return "model: "+model+"\nbrand: "+brand+"\nRent: "+calculateRent()+"\n helmetFee: "+helmetFee;
    }

}
