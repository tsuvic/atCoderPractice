package bootCampForBeginners;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LowElements {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] m = new int [n];
		
		IntStream.range(0, n).forEach(s -> m[s] = sc.nextInt());
		List<Integer> list = Arrays.stream(m).boxed().collect(Collectors.toList());

//		int ans = 0;
//		for (int a : m) {
//			if (a <= Arrays.stream(m).boxed().limit(Arrays.stream(m).boxed().collect(Collectors.toList()).indexOf(a)+1).min(Comparator.naturalOrder()).get()) {
//				ans++;
//			}
//		}
//		System.out.println(ans);
		int min = list.get(0);
		int ans = 0;
		for(int a : m) {
			if(a <= min) {
				ans++;
				min = a;
			}
		}
		System.out.println(ans);
		
	}
}
