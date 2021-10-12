package bootCampForBeginners;

import java.util.Scanner;

public class BreakNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmpCount = 0;
		int tmpBig = 0;
		int ans = 0;
		boolean flg =false;
		
		for (int i = 1; i < N; i++) {
			int j = i;

			while (true) {
				if (j % 2 == 0) {
					j = j / 2;
					tmpCount++;
					flg = true;
				} else {
					flg =false;
					break;
				}
			}
			if (tmpBig < tmpCount && flg == true) {
				tmpBig = tmpCount;
				ans = i;
			}
		}
		System.out.println(ans);
	}
}