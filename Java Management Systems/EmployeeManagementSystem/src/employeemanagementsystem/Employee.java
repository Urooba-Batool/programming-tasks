package employeemanagementsystem;
public class Employee {
    protected String name;
    protected String department;
    protected double baseSalary;
    protected double salary;
    Employee(String name, String department, double baseSalary)
    {
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary()
    {
        return baseSalary;
    }
    @Override
    public String toString()
    {
        return "Name: "+name+"\n Dapartment: "+department+"\n Salary: "+baseSalary;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }
    public String getName()
    {
        return name;
    }
    public String getDepartment()
    {
        return department;
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }
}
