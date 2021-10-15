package bootCampForBeginners;

import java.util.Scanner;

//FAIL
public class NextPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while (true) {
			if (isPrime(N)) {
				System.out.println(N);
				return;
			}
			N++;
		}
	}

	public static boolean isPrime(int N) {
		if (N == 1)
			return false;
		
		//入力値に対して、2~入力値で割っていく。割り切れてる場合、素数となる。
		//割り切れない場合、falseを返し、次の入力値を受け取る。
		//※実際は入力値までの数を繰返す必要はない。√Nで良い。
		//  Nは√N以上の整数が乗算されて算出されるため。
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) return false;
			
		}
		return true;
	}
}
