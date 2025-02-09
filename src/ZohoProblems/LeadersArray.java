package ZohoProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersArray {
	public static void main(String args[]) {
		int N, max=-1 ;
		System.out.println("Enter the Number of Array elements : \n");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] arr1 = new int[N];
		System.out.println("Enter array elements : \n");
		for(int i=0;i<N;i++) {
			arr1[i] = sc.nextInt();
		}
	ArrayList leader = new ArrayList<>();
		int count = 0;
		for(int i= (N-1); i>=0; i-- ) {
			if(arr1[i]>max) {
				max= arr1[i];
				leader.add(max);
			}
		}
		Collections.reverse(leader);
		System.out.println("Resultant Leaders : \n");
		for(int i =0; i < leader.size(); i++) {
			System.out.print(leader.get(i) + " ");
		}
	}
}
