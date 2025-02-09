package ZohoProblems;

import java.util.Scanner;

public class PushZeroesToRight {
	public static void main(String args[]) {
		// This program is to find 2nd largest element in an array without using sorting 
		int N;
		System.out.println("Enter the Number of Array elements : \n");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter array elements : \n");
		for(int b=0;b<N;b++) {
			arr[b] = sc.nextInt();
		}
		int i=0, j=N-1;
		while(i<j) {
			if(arr[i]==0 && arr[j]!=0) {
				int temp = arr[i];
				 arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
			if(arr[i]!=0) {
				i++;
			}
			if(arr[j]==0) {
				j--;
			}
		}
		System.out.println("Resultant Array : \n ");
		for(int a=0; a<N; a++) {
			System.out.print(arr[a] + " ");
		}
	}
}
