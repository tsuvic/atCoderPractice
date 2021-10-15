package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;

public class TollGates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer X = sc.nextInt();
		Integer Y = X;
		Integer [] A = new Integer [M];
		int costToN = 0;
		int costTo0 = 0;
		
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		
		while(X < N) { //Nを目指す
			X++;
			if (Arrays.asList(A).contains(X)) {
				costToN++;
			}
		}
		
		while(0 < Y) {
			Y--;
			if (Arrays.asList(A).contains(Y)) {
				costTo0++;
			}
		}
		
		System.out.println(Math.min(costToN, costTo0));
		
	}
}
