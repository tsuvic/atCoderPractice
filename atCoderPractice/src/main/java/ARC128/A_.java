package ARC128;

import java.util.Arrays;
import java.util.Scanner;

public class A_ {
	public static Long[] array;
	public static Long[] arrayans;
	public static Long[] array1;
	public static Long[] array2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		array = new Long[N];
		arrayans = new Long[N];
		array1 = new Long[N];
		array2 = new Long[N];

		for (int i = 0; i < N; i++) {
			array[i] = sc.nextLong();
			array1[i] = (long) 0;
			array2[i] = (long) 1;
		}

		while (nextPermutation(array1)) {
			if (Arrays.mismatch(array1, array2) == -1) {
				System.out.println("a");
				break;
			}
			
			long ans = 1;
			boolean gold = true;
			for(int i = 0; i <N; i++) {
				if (array[i] == 1 && gold == true) {
					ans *= array[i]; 
					gold = false;
				} else if (array[i] == 1 && gold ==false) {
					ans /= array[i];
					gold = true;
				}
			}

			long ans1 = Long.MAX_VALUE;
			if (ans1 > ans) {
				ans1 = ans;
				for (int i = 0; i < arrayans.length; i++) {
					arrayans[i] = array1[i];
				}
			}
		}
		System.out.println(array1[2]);
		
	}

	public static boolean nextPermutation(Long[] array) {
		int si = -1;

		// 入れ替え要素（si）を特定することを目的に、配列の後方から要素の比較を行う。
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i - 1] < array[i]) {
				si = i;
				break;
			}
		}

		if (si == -1) {
			return false;
		}

		// 入れ替え要素（si）を用いて、次順を作る ADCBの時、siは1
		// 指定範囲を昇順にソート。array.lengthの要素は含まない
		// A DCB⇨ABCD(si 1
		// AC DB⇨ACBD(si 2
		// ADB C⇨ADBC(si 3

		Arrays.sort(array, si, array.length);
		for (int i = si; i < array.length; i++) {
			if (array[si - 1] < array[i]) { // 入れ替え要素（si）の一つ前の要素 と i番目の要素
				long tmp = array[si - 1];
				array[si - 1] = array[i];
				array[i] = tmp;
				break;
			}
		}
		
//		Arrays.sort(array, si, array.length);
		return true;
	}

//		for (int i = 0; i < N - 1; i++) {
////			if (array[i] > array[i + 1]) {
////				System.out.print(1 + " " + 1 + " ");
////				i++;
////			} else {
////				System.out.print(0 + " ");
////				if (i == N - 2) {
////					System.out.print(0);
////				}
////			}
//		}
//		// 1 2    3 4     5 
}
