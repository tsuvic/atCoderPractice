package com.example.demo;

import java.util.Scanner;

public class CanYouSolveThis {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		int [] B = new int [M];
		int [] A = new int [M];
		int ans = 0;
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();			
		}
		
		for(int i = 0; i < N; i++) {
			
			for (int j = 0; j < M; j++) {
				A[j] = sc.nextInt();			
			}
						
			for (int k = 0; k < M; k++) {
				ans += A[k] * B[k];
			}
			
			ans += C;
			if (ans > 0) {
				count++;
			}
			
			ans = 0;
		}
		
		System.out.println(count);
	}
}
