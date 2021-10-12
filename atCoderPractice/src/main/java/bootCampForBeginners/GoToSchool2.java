package bootCampForBeginners;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GoToSchool2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Map<Integer, Integer> map = new TreeMap<>();
		
		for(int i=0; i < N; i++) {
			map.put(sc.nextInt(), i);
		}
		
		for(int i=0; i < N; i++) {
			System.out.println(map.get(i) + " ");
		}
						
	}
}
