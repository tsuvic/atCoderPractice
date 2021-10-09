package com.example.demo;

import java.util.Scanner;

public class Bishop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		if ( N == 1 || M == 1) {
			System.out.println(1);
			return;
		}
		
		if	((N * M %2 ) == 1) {
			System.out.println((N * M / 2) + 1);
		} else {
			System.out.println(N * M / 2);
		}
		
	}
}
