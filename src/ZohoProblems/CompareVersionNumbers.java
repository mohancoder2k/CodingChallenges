package ZohoProblems;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		
		/*
		 * Print whether the version is upgraded, downgraded or not changed according to
		 * the input given. example: Input : Version1 4.8.2 Version2 4.8.4 Output:
		 * upgraded, Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded
		 */
		
		// TODO Auto-generated method stub
		String v1 = "1.2.8.2";
		String[] s1 = v1.split("\\.");
		String v2 = "1.2.7.9";
		String[] s2 = v2.split("\\.");
		int n = Math.max(s1.length, s2.length);
		
		String msg = "";
	for(int i=0; i<n; i++) {
		int num1 = i<s1.length ? Integer.parseInt(s1[i]) : 0;
		int num2 = i<s2.length ? Integer.parseInt(s2[i]) : 0;
		if (num1 > num2) {
            System.out.println("Upgraded");
            return; 
        } else if (num1 < num2) {
            System.out.println("Downgraded");
            return; 
        }
    }
    System.out.println("Same"); 
	}
		
	}


