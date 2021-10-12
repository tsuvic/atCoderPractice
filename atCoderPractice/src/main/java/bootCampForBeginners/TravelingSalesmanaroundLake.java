package bootCampForBeginners;

import java.util.Scanner;

public class TravelingSalesmanaroundLake {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int [] houseNum = new int [N];
		
		for (int i =0; i < N; i++) {
			houseNum[i] = sc.nextInt();
		}
		
		int maxDistanceBetweenHouse = K - houseNum[N-1] + houseNum[0];
		
		for (int i = 0; i < N-1; i++) {
			maxDistanceBetweenHouse = Math.max((houseNum[i+1]) - houseNum[i], maxDistanceBetweenHouse);
		}
		
		System.out.println(K - maxDistanceBetweenHouse);
	}
}
