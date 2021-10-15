package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;

//FAIL SMALL
public class NiceShopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int M = sc.nextInt();
			int [] priceA = new int [A];
			int [] priceB = new int [B];
			
			for (int i = 0; i < A; i++) {
				priceA [i] = sc.nextInt();
			}
			
			for (int i = 0; i < B; i++) {
				priceB [i] = sc.nextInt();
			}
			
//			TLE時間を要する		
//			for (int i = 0; i < A; i++) {
//				for (int j = 0; j < B; j++) {
//					tmp = priceA[i] + priceB[j];
//					ans = Math.min(ans, tmp);
//				}
//			}
			
			int tmpA = Integer.MAX_VALUE;
			int tmpB = Integer.MAX_VALUE;

			for (int i = 0; i < A; i++) {
				tmpA = Math.min(tmpA, priceA[i]);
			}
			for (int i = 0; i < B; i++) {
				tmpB = Math.min(tmpB, priceB[i]);
			}
			
			int tmpC = Integer.MAX_VALUE;
			int ans = Integer.MAX_VALUE;
			for (int i =0; i < M; i++) {
				tmpC = priceA[sc.nextInt()-1] + priceB[sc.nextInt()-1] - sc.nextInt();
				ans = Math.min(ans, tmpC);
			}
			
			System.out.println(Math.min(ans, tmpA + tmpB));
	}
}
