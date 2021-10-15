package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;

//FAIL
public class CandyDitributionAgain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] required = new int[N];
		
		for (int i =0; i < N; i++) {
			required[i] = sc.nextInt();
		}

		Arrays.sort(required);
		int ans = 0;
		boolean flg = true;
		
		for (int i = 0; i < required.length; i++) {
			if (x >= required[i]) {
				x -= required[i];
				ans++;
			} else {
				//全員にクッキーを配布したかどうかチェック
				flg = false;
				break;
			}
		}
		
		// 全員にクッキーを配布できない　もしくは　クッキーが余っていない
		if (flg == false || x == 0 ) {
			System.out.println(ans);
		} else {
			// flg == true && x != 0 全員にクッキー配布できたけど、余ってる
			System.out.println(ans - 1);
		}
	}
}
