package ABC243;

import java.util.Scanner;

public class A1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int [] list = new int []{b,c,d};

		while(true){
			for (int i = 0; i < 3; i++) {
				a -= list[i];
				if (a < 0) {
					switch (i) {
						case 0:
							System.out.println("F");
							return;
						case 1:
							System.out.println("M");
							return;
						case 2:
							System.out.println("T");
							return;

					}

				}
			}
		}
		
	}
}
