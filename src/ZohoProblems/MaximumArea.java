package ZohoProblems;
import java.util.Scanner;

public class MaximumArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input
        System.out.println("Enter array size: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Two-pointer approach
        int low = 0;
        int high = N - 1;
        int maxArea = 0;  // Start with 0 since area can't be negative

        while (low < high) {
            int height = Math.min(arr[low], arr[high]); // Min height of two bars
            int width = high - low; // Distance between bars
            int area = height * width; // Calculate area
            
            maxArea = Math.max(maxArea, area); // Update maxArea if new area is greater
            
            // ✅ Correct pointer movement to get maximum possible width
            if (arr[low] < arr[high]) {
                low++; // Move right
            } else {
                high--; // Move left
            }
        }

        // Output the result
        System.out.println("Maximum area: " + maxArea);
        
        sc.close();
    }
}
