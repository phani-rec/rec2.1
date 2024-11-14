package calculator;


public class Calci {
    public void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Sub = " + (a - b));
    }

    public void mult(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    public void div(int a, int b) {
        if (b == 0) {
            System.out.println("Division not possible");
        } else {
            System.out.println("Division = " + (a / b));
        }
    }
}