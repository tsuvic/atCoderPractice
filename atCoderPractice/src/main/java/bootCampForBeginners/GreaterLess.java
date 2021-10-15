package bootCampForBeginners;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class GreaterLess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] s = sc.next().toCharArray();
		long [] list = new long[s.length + 1];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '<') {
				list[i+1] = list[i] + 1;
			}
		}
		
		for (int i = s.length -1; i >= 0; i--) {
			if(s[i] == '>') {
				list[i] = Math.max(list[i], list[i+1] + 1);
			}
		}
		System.out.println(LongStream.of(list).sum());
		
		
		
		
//		for (int i = 0; i < s.length-1; i++) {
//			if (s[i] == s[i+1]) {
//				count++;
//				ans = Math.max(ans, count);
//			} else {
//				ans = Math.max(ans, count);
//				count = 0;
//			}
//		}
//		
//		int finalans = 0;
//		for (int i=0; i <ans + 3; i++) {
//			finalans += i;
//		}
//		System.out.println(finalans);
	}
}
