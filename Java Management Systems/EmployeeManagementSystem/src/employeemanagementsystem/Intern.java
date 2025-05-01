package employeemanagementsystem;
public class Intern extends Employee{
    private int monthsDuration;
    
    Intern(String name, String department, double baseSalary, int monthsDuration)
    {
        super(name,department,baseSalary);
        this.monthsDuration = monthsDuration;
    }
    
    public void setMonthsDuration(int monthsDuration)
    {
        this.monthsDuration = monthsDuration;
    }    
    
    public int monthsDuration()
    {
        return monthsDuration;
    }    
    @Override
    public double calculateSalary()
    {   
        salary = baseSalary/2;
        return salary;
    }
    @Override
    public String toString()
    {
        return " Name: "+name+"\n Dapartment: "+department+"\n Salary: "+calculateSalary()+"\n Duration: "+monthsDuration;
    }
}
