package bootCampForBeginners;

import java.util.Scanner;

public class BeautifulString {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.length() % 2 == 1) {
			System.out.println("No");
			return;
		}
		
		for(int i=0; i<s.length();i++) {
			String check = s.substring(i, i+1);
			int checknum = 0;
			
			for(int j=0; j<s.length();j++) {
				if(check.equals(s.substring(j, j+1))) {
					checknum++;
				}
			}
		
			if (checknum % 2 == 1) {
				System.out.println("No");
				return;
			}
			
		}
		
		System.out.println("Yes");
	}
}
