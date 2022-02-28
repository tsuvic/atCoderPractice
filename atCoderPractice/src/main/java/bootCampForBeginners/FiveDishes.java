package bootCampForBeginners;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FiveDishes {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> dishes = new ArrayList<>();
		IntStream.range(0, 5).forEach(i -> dishes.add(sc.nextInt()));

		//skip, limit
		//最も時間を要する注文の時間とインデックス番号の算出
		List<Integer> dishes2 = dishes.stream().map(i -> i % 100).map(i -> i % 10).toList();
		Optional<Integer>  min = dishes2.stream().filter(i -> !i.equals(0)).min(Comparator.naturalOrder());
		int index = dishes2.indexOf(min.get());
		
		//最も時間を要する注文の削除
		List<Integer> dishes3 = dishes.stream().map(i -> (Math.ceil(i  /10.0) *10)).map(i -> i.intValue()).skip(index+1).toList();
		List<Integer> dishes4 = dishes.stream().map(i -> (Math.ceil(i  /10.0) *10)).map(i -> i.intValue()).limit(index).toList();
		
		int sum = dishes3.stream().parallel().reduce(0, (a, b) -> a + b);
		int sum2 = dishes4.stream().parallel().reduce(0, (a, b) -> a + b);
		System.out.println(sum + sum2 + dishes.get(index));
		
		
		
	}
	
}
