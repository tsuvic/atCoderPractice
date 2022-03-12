package ABC243;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List b = new ArrayList<Integer>();
		List c = new ArrayList<Integer>();

		for (int i = 0; i < a; i++){
			b.add(sc.nextInt());
		}

		for (int i = 0; i < a; i++){
			c.add(sc.nextInt());
		}

		int ans = 0;
		int ans2 = 0;

		for (int i = 0; i < a; i++){
			if(b.contains(c.get(i))){
				ans2++;
				if(i == b.indexOf(c.get(i))){
					ans++;
				}
			}
		}


		System.out.println(ans);
		System.out.println(ans2 - ans);


	}
}
