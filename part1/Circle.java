public class Circle implements Shape
{
    double radius;
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    @Override
    public double area() {
// TODO Auto-generated method stub
        return (Math.PI * radius * radius);
    }
    @Override
    public double perimeter() {
// TODO Auto-generated method stub
        return (2 * Math.PI * radius);
    }
}