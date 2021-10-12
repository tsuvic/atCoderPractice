package bootCampForBeginners;

import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [ ] [] card = new int [3] [3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				card [i] [j] = sc.nextInt();
			}
		}
		
		int N = sc.nextInt();
		int num [] = new int [N];
		for (int k = 0; k < N; k++) {
			num[k] = sc.nextInt();
		}

		
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (card [i] [j] == num[k]) {
						card [i] [j] = 0;
					}
				}
			}
		}

		//縦一列ビンゴ
		for (int i = 0; i < 3; i++) {
				if (card [i] [0] == 0 && card [i] [1] == 0 && card [i][2] == 0) {
				System.out.println("Yes");
				return;
				}
		}
		
		//横一列ビンゴ
		for (int i = 0; i < 3; i++) {
			if (card [0] [i] == 0 && card [1] [i] == 0 && card [2][i] == 0) {
			System.out.println("Yes");
			return;
			}
		}
		
		//斜め一列ビンゴ
		if (card [0] [0] == 0 && card [1] [1] == 0 && card [2][2] == 0) {
				System.out.println("Yes");
				return;
			} else if (card [2] [0] == 0 && card [1] [1] == 0 && card [0][2] == 0) {
				System.out.println("Yes");
				return;
			}
		
		System.out.println("No");
	}
}
