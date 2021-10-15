package bootCampForBeginners;

import java.util.Scanner;

public class ATCoder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		int ans = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i+1).equals("A") || s.substring(i, i+1).equals("C") || s.substring(i, i+1).equals("G") || s.substring(i, i+1).equals("T")) {
//			if (s.charAt(i) == 'A' )
				count++;
			} else {
				count = 0;
			}
			ans = Math.max(ans, count);
			}
		System.out.println(ans);
	}
}
