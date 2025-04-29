package polymorphism;
public class Circle extends Shape{
    protected double radius;
    protected double pi = 3.14;
    
    Circle(double radius) 
    {
        super(3.14 * radius * radius);
        this.radius = radius;
    }
    public double getArea() 
    {
        a = pi * radius * radius;
        return a;
    }
    public void display() 
    {
        System.out.println("Area of circle is: "+getArea());
    }
}
