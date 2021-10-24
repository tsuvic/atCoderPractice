package ABC224;

import java.util.Scanner;

public class b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int [] [] data = new int [h] [w];
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				data [i] [j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < h - 1; i++) {
			for (int j = 0; j < w - 1; j++) {
				if ((data [i] [j] + data [i+1][j+1]) > (data[i+1] [j] + data[i][j+1])) {
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
		
	}
}
