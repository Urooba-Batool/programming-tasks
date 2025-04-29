package polymorphism;
public class Square extends Shape{
    private double length;
    
    Square(double length) 
    {
        super(length * length);
        this.length = length;
    }
    public double getArea() 
    {
        a = length * length;
        return a;
    }
    public void display() 
    {
        System.out.println("Area of square is: "+getArea());
    }

}
