package ABC222;

import java.util.*;

public class A_FourDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		//sb.append(000)は、03のように出力される
		if (N < 10) {
			sb.append(0);
			sb.append(0);
			sb.append(0);
			sb.append(N);
			System.out.println(sb);
			return;
		}
		
		if (N < 100) {
			sb.append(0);
			sb.append(0);
			sb.append(N);
			System.out.println(sb);
			return;
		}
		
		if (N < 1000) {
			sb.append(0);
			sb.append(N);
			System.out.println(sb);
			return;
		}
		
		if (N < 10000) {
			sb.append(N);
			System.out.println(sb);
			return;
		}
	}
}
