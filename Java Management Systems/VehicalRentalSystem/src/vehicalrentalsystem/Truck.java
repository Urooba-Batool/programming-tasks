package vehicalrentalsystem;
public class Truck extends Vehical{
    private double loadCapacityFee;
    Truck(String model, String brand, double basePrice, double loadCapacityFee)
    {
        super(model, brand, basePrice);
        this.loadCapacityFee = loadCapacityFee;
    }
    public void setLoadCapacityFee(double loadCapacityFee)
    {
        this.loadCapacityFee = loadCapacityFee;
    }
    public double getLoadCapacityFee()
    {
        return loadCapacityFee;
    }
    public double calculateRent()
    {
        return basePrice+loadCapacityFee;
    }
    public String toString()
    {
        return "model: "+model+"\nbrand: "+brand+"\nRent: "+calculateRent()+"\nloadCapacityFee: "+loadCapacityFee;
    }

}
