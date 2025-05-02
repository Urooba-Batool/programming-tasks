package vehicalrentalsystem;
public class Vehical {
    protected String model;
    protected String brand;
    protected double basePrice;
    
    Vehical(String model, String brand, double basePrice)
    {
        this.model = model;
        this.brand = brand;
        this.basePrice = basePrice;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setBasePrice(double basePrice)
    {
        this.basePrice = basePrice;
    }
    public String getModel()
    {
        return model;
    }
    public String getBrand()
    {
        return brand;
    }
    public double getBasePrice()
    {
        return basePrice;
    }
    public double calculateRent()
    {
        return basePrice;
    }
    public String toString()
    {
        return "model: "+model+"\nbrand: "+brand+"\nRent: "+calculateRent();
    }
    
}
