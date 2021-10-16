package bootCampForBeginners;

import java.util.Scanner;

public class B_754 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String s = sc.next();
			int tmp = 753;
			int ans = Integer.MAX_VALUE;
			
			for (int i = 0; i < s.length() - 2; i++) {
				ans = Math.min(ans, Math.abs(tmp - Integer.parseInt(s.substring(i, i+3))));
			}
			System.out.println(ans);
	}
}
