package bootCampForBeginners;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CardGameForTwo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Alice = 0;
		int Bob = 0;
		Integer [] num = new Integer [N];
		
		for(int i =0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		
		for(int i =0; i < N; i++) {
			if (i % 2 == 0) {
				Alice += num[i];
			} else if (i % 2 ==1) {
				Bob += num[i];
			}
		}
		System.out.println(Alice - Bob);
	}
}
