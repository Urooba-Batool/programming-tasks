
package polymorphism;
public class SalaryEmployee extends Employee {
    private double weeklySalary;
    
    SalaryEmployee()
    {
        super();
        weeklySalary = 0;
    }
    SalaryEmployee(String fName, String lName, String CNIC, double weeklySalary)
    {
        super(fName, lName, CNIC);
        this.weeklySalary = weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary >= 0)
        {
            this.weeklySalary = weeklySalary;
        }
    }
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    @Override
    public String toString() 
    {
        return "\nSalaried employee: "+super.toString();
    }
    @Override
    public double earnings() 
    {
        return weeklySalary;
    }
}
