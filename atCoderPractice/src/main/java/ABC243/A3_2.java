		package ABC243;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A3_2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//衝突の有無
		// 0番目の0x,1y,2s 1番目の0,1,2  yが被ってなければ算出不要
		// S LRLRLRLR　が逆の方向を探す

		//mapにy軸の重複がないようにputしていく（左向きの最大値と右向きの最小値が求まれば良い）
		//mapはright, leftで分けて、どちらかを軸に

		List<List<Integer>> list = new ArrayList<>();


		for (int i = 0; i < n; i++){
			List<Integer> tmp = new ArrayList<>();
			tmp.add(Integer.valueOf(sc.nextInt()));
			tmp.add(Integer.valueOf(sc.nextInt()));
			list.add(tmp);
		}

		String s = sc.next();
		char[] c = s.toCharArray();

		for (int i = 0; i < n; i++){
			if(Character.toString(c[i]).equals("R")){
				list.get(i).add(0);
			} else {
				list.get(i).add(1);
			}
		}

//		list.stream().forEach(System.out::println);
//		list.stream().sorted(Comparator.comparing(a -> a.get(1))).forEach(System.out::println);

		List<List<Integer>> list2 = list.stream().sorted(Comparator.comparing(a -> a.get(1))).collect(Collectors.toList());


	for (int i = 0; i < n-1; i++){
		list2.sort((a,b) -> Integer.compare(a.get(0), b.get(0)));
		if(list2.get(i).get(1).equals(list2.get(i+1).get(1)) && list2.get(i).get(2) == 0 && list2.get(i+1).get(2) == 1) {
			System.out.println("Yes");
			return;
		}
	}
	System.out.println("No");
	}
}
