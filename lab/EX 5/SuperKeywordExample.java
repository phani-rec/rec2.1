import java.util.Scanner;

// Parent class
class Person {
    String name;

    // Constructor to initialize name
    Person(String n) {
        this.name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

// Child class that uses super to call parent constructor and method
class Student extends Person {
    int age;

    // Constructor to initialize name and age using super keyword
    Student(String n, int a) {
        super(n);  // Call parent class constructor
        this.age = a;
    }

    void display() {
        super.display();  // Call parent class method
        System.out.println("Age: " + age);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for name and age
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Create a Student object using user input
        Student student = new Student(name, age);
        student.display();  // Display student information

        scanner.close();
    }
}
