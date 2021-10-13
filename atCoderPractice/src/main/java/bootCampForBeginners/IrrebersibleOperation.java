package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;

public class IrrebersibleOperation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		char[] array = S.toCharArray();
		int blacknum = 0;
		long ans = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]=='B') {
				blacknum++;
			} else {
				ans += blacknum;
			}
		}
		System.out.println(ans);
		
//		int man = 0;
//		int afterman = 0;
//		int countBlack = 0;
//
//		// 黒の要素数、黒の要素を右端に寄せる操作前：黒の位置
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] == 'B') {
//				man += i;
//				countBlack++;
//			}
//		}
//
//		// 黒の要素を右端に寄せる操作後：黒の位置
//		for (int i = 0; i < countBlack; i++) {
//			afterman += array.length - 1 - i;
//		}
//
//		System.out.println(afterman - man);

	}
}
