class Quadratic_Equation {
    public static void main(String[] args) {
        // Initialize the coefficients a and b
        double a = 1; // Example value for 'a'
        double b = -3; // Example value for 'b'

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * 1; // 'c' is taken as 0

        // Calculate the roots based on the discriminant
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("The roots are real and different: root1 = %.2f, root2 = %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.format("The roots are real and equal: root = %.2f%n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("The roots are complex and different: root1 = %.2f+%.2fi, root2 = %.2f-%.2fi%n",
                    realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
