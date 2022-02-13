package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;

public class CountingRoads {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int city = sc.nextInt();
		int road = sc.nextInt();
		int [] ans = new int [city]; 
				
		for (int i= 0; i < road; i++) {
			ans[sc.nextInt()-1]++;
			ans[sc.nextInt()-1]++;
		}
		
		Arrays.stream(ans).forEach(a -> System.out.println(a));

	}
}
