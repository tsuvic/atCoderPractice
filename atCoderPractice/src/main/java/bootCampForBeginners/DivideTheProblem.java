package bootCampForBeginners;

import java.util.Scanner;

public class DivideTheProblem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] button = new int [N];
		
		for (int i=0; i<N;i++) {
			button[i] = sc.nextInt();
		}
		
		int lighten = 0;
		
		for (int i=0; i<N;i++) {
			if (button[lighten] == 2) {
				System.out.println(i+1);
				return;
			}
			lighten = button[lighten] - 1;
		}
		
		System.out.println(-1);
	}
}
