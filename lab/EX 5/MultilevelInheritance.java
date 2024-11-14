import java.util.Scanner;

// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle has started.");
    }
}

// Intermediate class that inherits from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Derived class that inherits from Car
class SportsCar extends Car {
    void display() {
        System.out.println("Sports Car is fast.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();  // Create a SportsCar object
        sc.start();  // Call method from Vehicle
        sc.drive();  // Call method from Car
        sc.display();  // Call method from SportsCar
    }
}
