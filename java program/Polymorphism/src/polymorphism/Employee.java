
package polymorphism;
public class Employee {
    private String fName;
    private String lName;
    private String CNIC;
    
    Employee()
    {
        fName = "";
        lName = "";
        CNIC = "";
    }
    Employee(String fName, String lName, String CNIC)
    {
        this.fName = fName;
        this.lName = lName;
        this.CNIC = CNIC;
    }
    public void setFName(String fName)
    {
        this.fName = fName;
    }
    public void setLName(String lName)
    {
        this.lName = lName;
    }
    public void setCNIC(String CNIC)
    {
        this.CNIC = CNIC;
    }
    public String getFName()
    {
        return fName;
    }
    public String getLName()
    {
        return lName;
    }
    public String getCNIC()
    {
        return CNIC;
    }
    @Override
    public String toString()
    {
        return fName+" "+lName+" CNIC#"+CNIC;
    }
    public double earnings( ) 
    { 
	return 0; 
    }
}
