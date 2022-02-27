package bootCampForBeginners;

import java.util.Scanner;

public class Notfound {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "abcdefghijklmnopqrstuvwxyz";
		String alphabet = sc.next();
		
		for(int i =0; i < alphabet.length(); i++) {
			if(s.contains(alphabet.substring(i, i+1))){
				s = s.replace(alphabet.substring(i, i+1), "");
			}
		}
		
		
		if(s.length() == 0) {
			System.out.println("None");
		}
		
		if(s.length() != 0) {
			System.out.println(s.substring(0, 1));
		}
		
//		public class Main {
//			public static void main(String[] args) {
//				var sc = new Scanner(System.in);
//				var s = sc.next();
//				sc.close();
//		 
//				var set = new HashSet<String>();
//				for (var i = 0; i < s.length(); i++) {
//					set.add(s.substring(i, i + 1));
//				}
//				var result = "None";
//				for (var i = 0; i < 26; i++) {
//					var c = String.valueOf((char)('a' + i));
//					if (!set.contains(c)) {
//						result = c;
//						break;
//					}
//				}
//				System.out.println(result);
//			}
//		}
		
	}
}
