package ABC222;

import java.util.Scanner;

public class B_FallingGrade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Point = sc.nextInt();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			if (Point > sc.nextInt()) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
