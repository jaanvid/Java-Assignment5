public class Triangle implements Shape
{
    double base, side1, side2, height;
    public Triangle(double base, double side1, double side2,
                    double height) {
        super();
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public double area() {
// TODO Auto-generated method stub
        return (0.5 * base * height);
    }
    @Override
    public double perimeter() {
// TODO Auto-generated method stub
    return (base + side1 + side2);
}
}