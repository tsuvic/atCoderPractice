package ABC225;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] array = new long[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		long[][] array2 = new long[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array2[i][j] = ((i - 1) * 7 + j);
			}
		}
		
		if (n < 2 && m < 2) {
			System.out.println("Yes");
			return;
		}
		
		if (n < 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m - 1; j++) {
					if ((array2[i][j + 1] - array2[i][j]) != (array[i][j + 1] - array[i][j])) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		
		if (m < 2) {
			for (int i = 0; i < n -1 ; i++) {
				for (int j = 0; j < m; j++) {
					if ((array2[i + 1][j] - array2[i][j]) != (array[i + 1][j] - array[i][j])) {
						System.out.println("No");
						return;
					}
				}
			}
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m - 1; j++) {
				if ((array2[i + 1][j] - array2[i][j]) != (array[i + 1][j] - array[i][j])
						|| (array2[i][j + 1] - array2[i][j]) != (array[i][j + 1] - array[i][j])) {
					System.out.println("No");
					return;
				}
			}
		}

		System.out.println("Yes");

	}
}
