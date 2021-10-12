package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;

public class GoToSchool {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer [] array = new Integer [N];
		Integer [] ans = new Integer [N];
		
		for(int i=0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i < N; i++) {
			ans[array[array[i]-1]-1] = array[i];
		}
		
		for(int i=0; i < N; i++) {
			System.out.print(ans[i] + " ");
		}
		
//		System.out.println(Arrays.toString(ans));
				
	}
}
