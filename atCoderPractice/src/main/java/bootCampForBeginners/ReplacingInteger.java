package bootCampForBeginners;

import java.util.Scanner;

public class ReplacingInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long K = sc.nextLong();

		System.out.println(Math.min(N%K, Math.abs(N%K-K)));
		
//		while(true) {
//			if (N < N - Math.abs(N - K)) {
//				System.out.println(N);
//				return;
//			}
//			N = N - Math.abs(N - K);
//		}
	}
}
