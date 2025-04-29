package polymorphism;
public class Shape {
    protected double a;
    
    Shape() 
    {
        System.out.println("Area = 0");
    }
    Shape(double a) 
    {
        this.a = a;
    }
    public double getArea() 
    {
        return a;
    }
    public void display() 
    {
        System.out.println("Area of the shape is: "+a);
    }
}
