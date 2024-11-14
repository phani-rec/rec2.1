import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate and display area
    abstract void area();
}

// Circle class extending Shape
class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    Circle(double r) {
        radius = r;
    }

    // Override area method to calculate and display the area of Circle
    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor to initialize length and width
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Override area method to calculate and display the area of Rectangle
    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Square class extending Shape
class Square extends Shape {
    double side;

    // Constructor to initialize side of the square
    Square(double s) {
        side = s;
    }

    // Override area method to calculate and display the area of Square
    @Override
    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    double base, height;

    // Constructor to initialize base and height of triangle
    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    // Override area method to calculate and display the area of Triangle
    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

// Main class to execute the program
public class AbstractClassShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to take input

        // Take input for Square
        System.out.print("Enter side of the Square: ");
        double side = scanner.nextDouble();
        Shape square = new Square(side);  // Create Square object
        square.area();  // Display area of Square

        // Take input for Rectangle
        System.out.print("Enter length of the Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the Rectangle: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);  // Create Rectangle object
        rectangle.area();  // Display area of Rectangle

        // Take input for Circle
        System.out.print("Enter radius of the Circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);  // Create Circle object
        circle.area();  // Display area of Circle

        // Take input for Triangle
        System.out.print("Enter base of the Triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the Triangle: ");
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);  // Create Triangle object
        triangle.area();  // Display area of Triangle

        scanner.close();  // Close the scanner
    }
}
