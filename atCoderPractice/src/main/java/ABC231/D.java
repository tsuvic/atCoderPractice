package ABC231;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		var studentList = new ArrayList<Long>();
		var standardList = new ArrayList<Long>();
		
		for (int i = 0; i < n; i++) {
			studentList.add(sc.nextLong());
		}
		for (int i = 0; i < q; i++) {
			standardList.add(sc.nextLong());
		}
		
		for(int i = 0; i < standardList.size(); i++) {
			int ans = 0;
			for (int j = 0; j < studentList.size(); j++) {
				Optional<Long> b = standardList.stream().max(Comparator.naturalOrder());
				if(b.get() < standardList.get(i)) {
					break;
				}
				if(standardList.get(i) <= studentList.get(j)) {
					ans++;
				}
			}
			System.out.println(ans);
		}
		
	}
}