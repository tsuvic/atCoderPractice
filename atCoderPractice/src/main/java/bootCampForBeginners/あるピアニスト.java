package bootCampForBeginners;

import java.util.Scanner;

public class あるピアニスト {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(Math.max(N, M));
	}
}
