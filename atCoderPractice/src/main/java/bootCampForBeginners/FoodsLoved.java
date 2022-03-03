package bootCampForBeginners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FoodsLoved {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		List<List<Integer>> list = new ArrayList<>();
		
		IntStream.range(0, n).forEach(s -> list.add(new ArrayList<>()));
		
		for (int a = 0; a< list.size(); a++) {
			int b = sc.nextInt();
			for (int c = 0; c < b; c++) {
				list.get(a).add(sc.nextInt());
			}
		}
		
		int ans = 0;
		for (int i = 1; i < m+1; i++) {
			int subans = 0;
			for (int j = 0; j < n; j++) {
				if(list.get(j).contains(i)) subans++;
			}
			if(subans == n) {
				ans++;
			}
		}
		System.out.println(ans);
		
	}
}
