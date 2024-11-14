import java.util.Scanner;

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        Calculator calc = new Calculator(); // Create a Calculator object

        // Take input for integer addition
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        System.out.println("Int addition: " + calc.add(int1, int2));

        // Take input for double addition
        System.out.print("Enter first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = scanner.nextDouble();
        System.out.println("Double addition: " + calc.add(double1, double2));

        scanner.close(); // Close the scanner
    }
}
