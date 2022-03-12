package ABC243;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//衝突の有無
		// 0番目の0x,1y,2s 1番目の0,1,2  yが被ってなければ算出不要
		// S LRLRLRLR　が逆の方向を探す

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

//		List list2 = list.stream()

	}
}
