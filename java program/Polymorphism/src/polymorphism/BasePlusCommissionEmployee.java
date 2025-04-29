
package polymorphism;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee() 
    {
        super();
        baseSalary = 0;
    }
    public BasePlusCommissionEmployee(String fName, String lName, String CNIC, double grossSales, double commissionRate, double baseSalary) 
    {
        super(fName, lName, CNIC, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(double baseSalary) 
    {
        if (baseSalary >= 0)
        {
            this.baseSalary = baseSalary;
        }
    }
    public double getBaseSalary() 
    {
        return baseSalary;
    }
    @Override
    public String toString() 
    {
        return "\nBase plus Commission employee: "+super.toString();
    }
    @Override
    public double earnings() 
    {
        return baseSalary+super.earnings();
    }
}
