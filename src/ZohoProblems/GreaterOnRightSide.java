package ZohoProblems;

import java.util.Scanner;

public class GreaterOnRightSide {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.println("Enter array elements : ");
		for(int i=0; i<m; i++) {
			arr[i] = sc.nextInt();
		}
		int gtr = -1;
		/*
		 * for(int i=0; i<m; i++) { arr[i] = largest(i+1, m, arr ); }
		 */
		
		// O(n)
		for(int i= m-1; i>=0; i--) {
			int temp = arr[i];
			arr[i] = gtr;
			gtr = Math.max(temp, gtr);
		}
		System.out.println("Final Array : ");
		for(int a=0; a<m; a++) {
			System.out.print(arr[a] + " ");
		}
		
	}
	// Brute force approach with O(n^2)
	public static int largest( int st, int end, int arr[]) {
		int max = -1;
		for(int i=st; i<end; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
