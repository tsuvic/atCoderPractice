package bootCampForBeginners;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		int[] m2 =  new int[n];
		IntStream.range(0, n).forEach(i -> m[i] = sc.nextInt());
		IntStream.range(0, n).forEach(i -> m2[i] = m[i]);
		 
		 List<Integer> list =  Arrays.stream(m).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 List<Integer> list2 = Arrays.stream(m2).boxed().collect(Collectors.toList());

		 for (Integer a : list2) {
			 if(a < list.get(0)) {
				 System.out.println(list.get(0));
			 } else {
				 System.out.println(list.get(1));
			 }
		 }
		
		
//		for (int i : m) {
//			// Arrays.asList(m).stream.filter ..
////			Optional<Integer> ans = Arrays.stream(m).boxed().filter(s -> !s.equals(i)).max(Comparator.naturalOrder());
//			Stream<Integer> ans = Arrays.stream(m).boxed().filter(s -> !s.equals(i)).sorted(Comparator.reverseOrder());
//			if (ans.count() == 0) {
//				System.out.println(i);
//			} else {
//				ans.limit(1).forEach(System.out::println);
//			}
//		}
	}
}
