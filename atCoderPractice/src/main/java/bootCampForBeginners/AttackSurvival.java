package bootCampForBeginners;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AttackSurvival {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int defaultPoint = sc.nextInt();
		int num = sc.nextInt();
		int holdingPoint [] = new int [people];
		
		IntStream.range(0, num).forEach(i -> holdingPoint[sc.nextInt() - 1]++);
		int sum = IntStream.of(holdingPoint).sum();
		
		for(int point : holdingPoint) {
			if (defaultPoint + point - sum > 0) {
				System.out.println("Yes");
			}
			if (defaultPoint + point - sum <= 0) {
				System.out.println("No");
			}
		}
	}
}
