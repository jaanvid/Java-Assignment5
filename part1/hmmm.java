import java.util.Scanner;

public class hmmm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.printf("Circle Perimeter: %.2f\n", circle.perimeter());
                System.out.printf("Circle Area: %.2f\n", circle.area());
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.print("Enter the length of side 1: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter the length of side 2: ");
                double side2 = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height, side1, side2);
                System.out.printf("Triangle Perimeter: %.2f\n", triangle.perimeter());
                System.out.printf("Triangle Area: %.2f\n", triangle.area());
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.printf("Rectangle Perimeter: %.2f\n", rectangle.perimeter());
                System.out.printf("Rectangle Area: %.2f\n", rectangle.area());
                break;
            default:
                System.out.println("Invalid Choice");
        }
        scanner.close();
    }
}