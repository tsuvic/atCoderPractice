package bootCampForBeginners;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollatzProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			Set<Integer> a = new HashSet<>();
			int ans = 0;
			
			while(true) {
				if(a.contains(N)) {
					System.out.println(ans+1);
					return;
				}
				a.add(N);
				ans++;
				
				if (N % 2 == 0) {
					N = N / 2;
				} else {
					N = 3*N + 1;
				}
				
			}
			
	}
}
