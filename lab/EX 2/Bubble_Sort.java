import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of elements
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements : ");
        int[] arr = new int[n];

        // Input: elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output: sorted array
        System.out.println("Sorted array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
