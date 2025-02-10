package ZohoProblems;

import java.util.Scanner;

public class RemoveDuplicatesInString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		String result = "";
		for(int i=0; i<str.length(); i++) {
			String ch = ""+str.charAt(i);
			if(result.contains(ch)) {
				continue;
			}
			result+=ch;
		}
		System.out.println("String without duplicates : " + result);
	}
}
