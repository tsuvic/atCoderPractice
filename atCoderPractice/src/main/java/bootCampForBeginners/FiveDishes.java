package bootCampForBeginners;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FiveDishes {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> dishes = new ArrayList<>();
		IntStream.range(0, 5).forEach(i -> dishes.add(sc.nextInt()));

		//skip, limit
		//最も時間を無駄にする料理の時間とインデックス番号の算出
		List<Integer> dishes2 = dishes.stream().map(i -> i % 100).map(i -> i % 10).collect(Collectors.toList());
		Optional<Integer>  min = dishes2.stream().filter(i -> !i.equals(0)).min(Comparator.naturalOrder());
		if (!min.isEmpty()) {
			int index = dishes2.indexOf(min.get());
		
		//最も時間を無駄にする料理を除いたリスト作成
		List<Integer> dishes3 = dishes.stream().map(i -> (Math.ceil(i  /10.0) *10)).map(i -> i.intValue()).skip(index+1).collect(Collectors.toList());
		List<Integer> dishes4 = dishes.stream().map(i -> (Math.ceil(i  /10.0) *10)).map(i -> i.intValue()).limit(index).collect(Collectors.toList());
		
		int sum = dishes3.stream().parallel().reduce(0, (a, b) -> a + b);
		int sum2 = dishes4.stream().parallel().reduce(0, (a, b) -> a + b);
		System.out.println(sum + sum2 + dishes.get(index));
		} else {
			System.out.println(dishes.stream().parallel().reduce(0, (a, b) -> a + b));
		}
		
		
	}
	
}
