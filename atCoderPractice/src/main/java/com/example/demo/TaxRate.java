package com.example.demo;

import java.util.Scanner;

// 全探索案件
//入力例2 999*1.08=1078.92... 1079円となるような税抜き価格はない
// 一方向での計算ができない場合は、逆の計算を行う。
//public class TaxRate {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double N = sc.nextDouble();
//		System.out.println(N/1.08); 
//	}
//}

public class TaxRate {
	public static void main(String[] args) {
		System.out.println(Math.ceil(1080 / 1.08));
		System.out.println(Math.ceil(1000 * 1.08));
		System.out.println(Math.floor(1080 / 1.08));
		System.out.println(Math.floor(999 * 1.08));
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int floorTeika = (int) Math.floor(num / 1.08);
		int ceilTeika = (int) Math.ceil(num / 1.08);
		if ((int) Math.floor(floorTeika * 1.08) == num) {
			System.out.println(floorTeika);
		}
	}
}
