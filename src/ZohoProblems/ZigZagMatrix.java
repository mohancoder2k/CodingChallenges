package ZohoProblems;

import java.util.Scanner;

public class ZigZagMatrix {
	public static void main(String args[]) {
		
		
		/*
		 * Given a matrix of 2D array of n rows and m coloumns. Print this matrix in
		 * ZIG-ZAG fashion as shown in figure. Example: Input: 1 2 3 4 5 6 7 8 9 Output:
		 * 1 2 4 7 5 3 6 8 9
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Rows : ");
		int m = sc.nextInt();
		System.out.println("Enter No. of Columns : ");
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter Array elements : ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int row = 0;
		int col = 0;
		int[] result = new int[m*n];
		for(int i=0; i<m*n; i++) {
			result[i] = arr[row][col];
			if((row+col) % 2 ==0) {
				 if(col == n-1) {
					row++;
				}
				 else if(row==0) {
					col++;
				}else {
					row--;
					col++;
				}
			}else {
				if(col==0) {
					row++;
				}else if (row==m-1) {
					col++;
				}else {
					row++;
					col--;
				}
			}
		}
		System.out.println("Resultant Array : ");
		for(int i=0; i< m*n; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
