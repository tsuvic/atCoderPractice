package bootCampForBeginners;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] m = new int [n];
		IntStream.range(0, n).forEach(i -> m[i] = sc.nextInt());
		
		for (int i : m) {
			//Arrays.asList(m).stream.filter ..
			Optional<Integer> ans = Arrays.stream(m).boxed().filter(s -> !s.equals(i)).max(Comparator.naturalOrder());
			if(ans.isEmpty()) {
				System.out.println(i);
			} else {
			System.out.println(ans.get());
			}
		}

	}
}
