
package polymorphism;
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    
    CommissionEmployee() 
    {
        super();
        grossSales = 0;
        commissionRate = 0;
    }
    CommissionEmployee(String fName, String lName, String CNIC, double grossSales, double commissionRate) 
    {
        super(fName, lName, CNIC);
        this.grossSales = grossSales;        
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales) {
        if (grossSales >= 0)
        {
            this.grossSales = grossSales;
        }
    }   
    public void setCommissionRate(double commissionRate) 
    {
        if (commissionRate >= 0)
        {
            this.commissionRate = commissionRate;
        }
    }
    public double getGrossSales() 
    {
        return grossSales;
    }
    public double getCommissionRate() 
    {
        return commissionRate;
    }
    @Override
    public String toString()
    {
        return "\nCommission employee: "+super.toString();
    }
    public double earnings() 
    {
        return grossSales*commissionRate;
    }
    
}
