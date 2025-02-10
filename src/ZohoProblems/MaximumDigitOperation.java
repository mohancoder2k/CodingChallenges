package ZohoProblems;

import java.util.Scanner;

public class MaximumDigitOperation {
	public static void main(String args[]) {
		/*
		 * Given an array of integers, compute the maximum value for each integer in the
		 * index, by either summing all the digits or multiplying all the digits.
		 * (Choose which operation gives the maximum value) • Input: • 5 • 120 24 71 10
		 * 59 • Output: • 3 8 8 1 45 Explanation: For index 0, the integer is 120.
		 * Summing the digits will give 3, and whereas Multiplying the digits gives 0.
		 * Thus, maximum of this two is 3.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of elements : \n");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.println("Enter array elements : ");
		for(int i=0; i<m; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			arr[i] = maximum(arr[i]);
		}
		System.out.println("Resultant Array : \n ");
		for(int a=0; a<m; a++) {
			System.out.print(arr[a] + " ");
		}
	}
	 public static int maximum(int a) {
	        int sum = 0;
	        int product = 1;
	       int temp = a;
	       while(temp>0) {
	    	   sum+= temp%10;
	    	   if(temp%10 == 0) {
	    		   product = 0;
	    	   }else {
	    		   product *= (temp%10);
	    	   }
	    	   temp/=10;
	       }
	       return Math.max(sum, product);
	    }
}
