import java.util.Scanner;

public class Swap_Pairs {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();  // Read the user input

        // Convert the string to a character array
        char[] arr = str.toCharArray();

        // Swap adjacent characters in pairs
        for (int i = 0; i < arr.length - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Display the result
        System.out.println("Swapped string: " + new String(arr));

        // Close the scanner
        scanner.close();
    }
}
