package bootCampForBeginners;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Shiritori {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isDuplicated = false;
		String [] tango = new String [n];
		Set set = new HashSet();
		
		for(int i=0; i<n; i++) {
			tango[i] = sc.next();
			if(!set.add(tango[i])) {
				System.out.println("No");
				return;
			}
		}
		
		for(int i=1; i<n; i++) {
			if(!tango[i-1].substring(tango[i-1].length() - 1).equals(tango[i].substring(0,1))) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}
	
}
