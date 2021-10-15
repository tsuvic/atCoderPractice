package bootCampForBeginners;

import java.util.Scanner;


//FAIL
public class Chocolate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int people = sc.nextInt();
			int day = sc.nextInt();
			int remainder = sc.nextInt();
			int [] choco = new int [people];
			
			for (int i = 0; i < people; i++) {
				choco[i] = sc.nextInt();
			}
			
			int ans = 0;
			for (int i = 0; i < people; i++) {
				remainder += ((day - 1) / choco[i]) + 1; //必ず初日に１個。　
			}
			System.out.println(remainder);
			
//			for (int i = 1; i <= day; i++) {
//				for (int j = 0; j < people; j++) {
//					remainder += eat(choco[j], i);
//				}
//			}
//			System.out.println(remainder);
//			
//			
//	}
//	public static int eat(int choco, int i) {
//		if (i == 1 || choco == i + 1 || (i >= choco + 1 && i % choco == 1)) {
//			return 1;
//		} else {
//			return 0;
//		}
		
	}
	
	
}
