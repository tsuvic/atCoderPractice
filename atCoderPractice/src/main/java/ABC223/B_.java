package ABC223;

import java.util.Scanner;

public class B_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder ();
		sb.append(s);
		String max ="";
		String min ="";
		for (int i = 0; i < s.length()+1; i++) {
			String tmp =  sb.substring(0, 1);
			sb.append(sb.substring(1, s.length()));
			sb.append(tmp);
			sb.delete(0, s.length());
			
			if (i == 0) {
				max = sb.toString();
				min = sb.toString();
			}
			
			if(sb.toString().compareTo(max) > 0 ) {
				max = sb.toString();
				
			}
			
			if(sb.toString().compareTo(min) < 0) {
				min = sb.toString();
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
		
	}
}
