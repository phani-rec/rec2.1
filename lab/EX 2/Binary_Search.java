import java.util.Scanner;

class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: number of elements
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements : ");
        int[] arr = new int[n]; // corrected syntax error
        
        // Input: elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input: target element to search for
        System.out.println("Enter Target Element : ");
        int target = sc.nextInt();
        
        // Binary search
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Element not found");
    }
}
 