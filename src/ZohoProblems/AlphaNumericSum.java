package ZohoProblems;

import java.util.Scanner;

public class AlphaNumericSum {
	public static void main(String args[]) {
		String s;
		int sum=0, num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphanumeric : ");
		s = sc.next();
		for(char ch : s.toCharArray()) {
			if(Character.isDigit(ch)) {
				num = num * 10 + (ch - '0');
			}else {
				sum+=num;
				num=0;
			}
		}
		sum+=num;
		System.out.println("Sum of AlphaNumeric is : " + sum);
		
	}
}
