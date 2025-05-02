package vehicalrentalsystem;
public class Car extends Vehical{
    private double luxuryTax;
    
    Car(String model, String brand, double basePrice, double luxuryTax)
    {
        super(model, brand, basePrice);
        this.luxuryTax = luxuryTax;
    }
    public void setLuxuryTax(double luxuryTax)
    {
        this.luxuryTax = luxuryTax;
    }
    public double getLuxuryTax()
    {
        return luxuryTax;
    }
    public double calculateRent()
    {
        return basePrice+luxuryTax;
    }
    public String toString()
    {
        return "model: "+model+"\nbrand: "+brand+"\nRent: "+calculateRent()+"\n Tax: "+luxuryTax;
    }

}
