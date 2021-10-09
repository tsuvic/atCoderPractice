package com.example.demo;

import java.util.*;

//ループ回す際に、使い回すフィールドの値の遷移を意識する
//Math.minでもっと簡易に記載が可能
//入力値が1から始まる。0では無い。

public class Rally {
	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] X = new int[N];
//
//		for (int j = 0; j < N; j++) {
//			X[j] = sc.nextInt();
//		}
//
//		long min = 1000000000L;
//		System.out.println(min);
//
//		for (int i = 1; i <= 100; i++) {
//			long ans = 0;
//			for (int j = 0; j < N; j++) {
//				ans += (int) Math.pow((double) (X[j] - i), 2.0);
//			}
//			min = Math.min(ans, min);
//		}
//		System.out.println(min);
//	}

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
//		int ans = 0;
//
//		for (int j = 0; j < N; j++) {
//			X[j] = sc.nextInt();
//		}
//
//		for (int i = 1; i <= 100; i++) {
//			int preans = 0;
//			for (int j = 0; j < N; j++) {
//				preans += (int) Math.pow((double) (X[j] - i), 2.0);
//			}
//			if ((ans == 0) || (ans > preans)) {
//				ans = preans;
//			}
		
		int ans = Integer.MAX_VALUE;

		for (int j = 0; j < N; j++) {
			X[j] = sc.nextInt();
		}

		for (int i = 1; i <= 100; i++) {
			int preans = 0;
			for (int j = 0; j < N; j++) {
				preans += (int) Math.pow((double) (X[j] - i), 2.0);
			}
			if ((ans == Integer.MAX_VALUE) || (ans > preans)) {
				ans = preans;
			}
		
		}
		System.out.println(ans);
		
	}
}
