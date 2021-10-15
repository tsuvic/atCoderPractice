package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;

public class Alchemist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float [] v = new float [N];
		
		for(int i = 0; i < N; i++) {
			v[i] = sc.nextInt();
		}
		
		Arrays.sort(v);
		
		for(int i = 0; i < N-1; i++) {
			v[i + 1] = (v[i] + v[i+1]) / 2;
		}
		
		System.out.println(v[N-1]);
		
	}
}
