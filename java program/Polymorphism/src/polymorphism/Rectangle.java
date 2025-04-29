package polymorphism;
public class Rectangle extends Shape
{
    protected double length; 
    protected double width;
    
    Rectangle(double length, double width) 
    {
        super(length * width);
        this.length = length;
        this.width = width;
    }
    public double getArea() 
    {
        a = length * width;
        return a;
    }
    public void display() 
    {
        System.out.println("Area of rectangle is: " + getArea());
    }
    
}
