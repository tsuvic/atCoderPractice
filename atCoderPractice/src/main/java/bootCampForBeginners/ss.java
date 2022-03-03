package bootCampForBeginners;

import java.util.Scanner;

public class ss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		
		s = s.substring(0, s.length()-1);
		if (s.length() % 2 == 1) {
			s = s.substring(0, s.length() - 1);
		}
		
		
		while(true) {
			boolean flg = true;
			for (int j = 0; j < s.length()/2 ; j++) {
				if(!s.substring(j, j+1).equals(s.substring(s.length()/2 +j, s.length()/2 +1 +j ))) {
					flg = false;
					break;
				}
			}
			
			if (flg == true) {
				System.out.println(s.length());
				break;
			}
			
			s = s.substring(0, s.length()- 2);
		}
	}

}
