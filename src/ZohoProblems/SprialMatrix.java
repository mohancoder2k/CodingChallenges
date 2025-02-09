package ZohoProblems;

import java.util.Scanner;

public class SprialMatrix {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Rows : ");
		int m = sc.nextInt();
		System.out.println("Enter the No. of Columns : ");
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter the array values : ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entered array : ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int k=0, l=0;
		System.out.println("Our Required Spiral order of matrix : ");
		while(k<m && l<n) {
			for(int i=l; i<n; i++) {
				System.out.print(arr[k][i] + " ");
			}
			k++;
			for(int i=k; i<m; i++) {
				System.out.print(arr[i][n-1] + " ");
			}
			n--;
			if(k<m) {
				for(int i= n-1; i>=l; i--) {
					System.out.print(arr[m-1][i] + " ");
				}
				m--;
			}
			if(l<n) {
				for(int i= m-1; i>=k; i--) {
					System.out.print(arr[i][l] + " ");
				}
				l++;
			}
		}
	}
}
