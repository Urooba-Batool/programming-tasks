package employeemanagementsystem;
public class Manager extends Employee{
    private double bonus;
    
    Manager(String name, String department, double baseSalary, double bonus)
    {
        super(name,department,baseSalary);
        this.bonus = bonus;
    }
    
    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
    
    public double bonus()
    {
        return bonus;
    }
    @Override
    public double calculateSalary()
    {   
        salary = baseSalary+bonus;
        return salary;
    }
    @Override
    public String toString()
    {
        return " Name: "+name+"\n Dapartment: "+department+"\n Salary: "+calculateSalary()+"\n Bonus: "+bonus;
    }
}
