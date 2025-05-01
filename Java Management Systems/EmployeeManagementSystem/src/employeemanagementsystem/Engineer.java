package employeemanagementsystem;
public class Engineer extends Employee{
    private int experienceYears;
    
    Engineer(String name, String department, double baseSalary, int experienceYears)
    {
        super(name,department,baseSalary);
        this.experienceYears = experienceYears;
    }
    
    public void setExperienceYears(int experienceYears)
    {
        this.experienceYears = experienceYears;
    }
    
    public int getExperienceYears()
    {
        return experienceYears;
    }    
    @Override
    public double calculateSalary()
    {   
        salary = baseSalary+(experienceYears*1000);
        return salary;
    }
    @Override
    public String toString()
    {
        return " Name: "+name+"\n Dapartment: "+department+"\n Salary: "+calculateSalary()+"\n Experience: "+experienceYears;
    }
}
