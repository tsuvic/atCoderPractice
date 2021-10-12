package bootCampForBeginners;
import java.util.Scanner;

public class QualificationSimulator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		String[] SS = S.split("");
		int num = 0;
		int foreign_num = 0;
		
		for (int i =0; i < N; i++) {
			switch (SS[i]) {
				case "a":
					if (num < A + B) {
						System.out.println("Yes");
						num++;
					}  else {
						System.out.println("No");
					}
					break;
				case "b":
					if	(num < A + B && foreign_num < B) {
						System.out.println("Yes");
						num++;
						foreign_num++;
					} else {
						System.out.println("No");
					}
					break;
				case "c":
					System.out.println("No");
					break;
			}
		}
	}
}