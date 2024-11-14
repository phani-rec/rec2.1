import java.util.Scanner;

class Student {
    String name;
    int age;

    // Constructor with name only (default age is 18)
    Student(String n) {
        name = n;
        age = 19; // Default age
    }

    // Constructor with both name and age
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display student information
    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Take input for the first student (name only, age defaults to 18)
        System.out.print("Enter the name of the first student: ");
        String name1 = scanner.nextLine();
        Student s1 = new Student(name1);  // Using first constructor

        // Take input for the second student (both name and age)
        System.out.print("Enter the name of the second student: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the age of the second student: ");
        int age2 = scanner.nextInt();
        Student s2 = new Student(name2, age2);  // Using second constructor

        // Display student information
        s1.display();
        s2.display();

        scanner.close();  // Close the scanner
    }
}
