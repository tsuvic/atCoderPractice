package ABC242;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append(1);
		for (int i =0; i < a-1; i++) {
			sb.append(1);
		}
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(9);
		for (int i =0; i < a-1; i++) {
			sb1.append(9);
		}
		
		long bottom = Integer.parseInt(sb.toString());
		long upper = Integer.parseInt(sb1.toString());
		int ans = 0;
		
		
		for(long i = bottom; i < upper; i++) {//整数
			List<Integer> list = new ArrayList<>();
			boolean flg = true;
			
			for (char c : String.valueOf(i).toCharArray()) {//リスト準備
				list.add(Integer.parseInt(String.valueOf(c)));
			}
						
			for (int j = 0; j < list.size()-1; j++) {//桁数同士チェック
				if(Math.abs(list.get(j+1) - list.get(j)) > 1) {
					flg = false;
				}
			}
			
			if(flg == true) {
				ans++;
			}
		}

		System.out.println(ans%998244353);
		
	}
}
