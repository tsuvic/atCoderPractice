package bootCampForBeginners;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Varied {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Set<String> cha = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			cha.add(s.substring(i, i+1));
		}
		
		if (cha.size() == s.length()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}
}
