package bootCampForBeginners;

import java.util.Scanner;

public class PowerSocket {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int require = sc.nextInt();
		int plag = 1;
		int tap = 0;
						
		while(true) {
			if (plag >= require) {
			System.out.println(tap);
			return;
			}
			plag = plag + a - 1;
			tap++;
		}
	}
}
