package ABC223;

import java.util.Scanner;

public class A_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N == 0) {
		System.out.println("No");
		return;
		}
		if(N % 100 != 0) {
			System.out.println("No");
			return;
		}
		if (N % 100 == 0) {
			System.out.println("Yes");
		}
		
	}
}
