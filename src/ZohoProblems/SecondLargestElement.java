package ZohoProblems;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String args[]) {
		// This program is to find 2nd largest element in an array without using sorting 
		int N, max1=-1, max2=-1 ;
		System.out.println("Enter the Number of Array elements : \n");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter array elements : \n");
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(arr[i]>max1) {
				max2= max1;
				max1= arr[i];
			}else if(arr[i]!=max1 && arr[i]>max2) {
				max2=arr[i];
			}
		}
		System.out.println("Second Largest element in the entered array : " + max2);
	}
}
