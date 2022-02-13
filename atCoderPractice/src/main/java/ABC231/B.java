package ABC231;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		var list = new ArrayList<String>();
		for (int a = 0; a < i; a++) {
			list.add(sc.next());
		}
		
		Map<String, Long> map = list.stream().collect(groupingBy(identity(), counting()));
		  String maxKey = null;
		  Long maxValue = (long) 0;
		for (Map.Entry<String, Long> mp : map.entrySet()) {
			if (mp.getValue() > maxValue) {
				maxValue = mp.getValue();
				maxKey = mp.getKey();
			}
		}
		System.out.println(maxKey);
	}
}