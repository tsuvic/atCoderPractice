package bootCampForBeginners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaracalVsMonster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			long N = sc.nextLong();

			//モンスターをリストに詰めていき、体力が最小のものから攻撃するように繰り返す
			//4   2,2   1,1,2    0,1,2     0,0,2      0,0,1,1    2は3 4は7 6は
			long ans = 0;
			long count = 1;
			
			while(N > 0) {
				ans += count;
				N = N / 2;
				count = count * 2;
			}
			
			System.out.println(ans);
	}
}
