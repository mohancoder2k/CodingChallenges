package ZohoProblems;
import java.util.*;
public class Pangram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean[] present = new boolean[26];
		String small = str.toLowerCase();
		for(int i=0; i<small.length(); i++) {
			char ch = small.charAt(i);
			if(ch>='a' && ch<='z') {
				int index = ch - 'a';
				present[index] = true;
			}
		}
		boolean isPangram = true;
		
		
		for(int i=0; i<26; i++) {
			if(!present[i]) {
				isPangram = true;
				break;
		}
			if(isPangram) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		
		}
	}}
