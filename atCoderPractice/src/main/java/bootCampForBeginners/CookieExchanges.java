package bootCampForBeginners;

import java.util.Scanner;

public class CookieExchanges {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int A = 0;
		int B = 0;
		int C = 0;
		int count = 0;
		
		while(a % 2==0 && b%2==0 && c%2==0) {
			if(a==b && b ==c) {
				System.out.println(-1);
				return;
			}
			
			A = (b/2)+(c/2);
			B = (a/2)+(c/2);
			C = (a/2)+(b/2);
			a = A;
			b = B;
			c = C;
			count++;
				
		}
		System.out.println(count);
	}
}
