package bootCampForBeginners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FiveDishes {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> dishes = new ArrayList<>();
		IntStream.range(0, 5).forEach(i -> dishes.add(sc.nextInt()));
		dishes.stream().map(i -> i % 100).map(i -> i % 10).forEach(
								
	}
	
}
