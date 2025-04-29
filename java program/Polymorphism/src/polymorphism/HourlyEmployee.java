
package polymorphism;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    HourlyEmployee()
    {
        super();
        wage = 0;
        hours = 0;
    }
    HourlyEmployee(String fName, String lName, String CNIC, double wage, double hours) 
    {
        super(fName, lName, CNIC);
        this.wage = wage;
        this.hours = hours;
    }
    public void setWage(double wage) 
    {
        if (wage >= 0)
        {
            this.wage = wage;
        }
    }
    public void setHours(double hours) 
    {
        if (hours >= 0)
        {
            this.hours = hours;
        }
    }
    public double getWage() 
    {
        return wage;
    }
    public double getHours() 
    {
        return hours;
    }
    @Override
    public String toString() 
    {
        return "\nHourly employee: "+super.toString();
    }
    @Override
    public double earnings() 
    {
        if (hours <= 40)
        {
            return wage*hours;
        }
        else
        {
            return (40*wage)+(hours-40)*wage*1.5;
        }
    }
}
