package bootCampForBeginners;

import java.util.Scanner;

public class Fairness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        for (int i =0; i < k; i++){
            int A = b + c;
            int B = a + c;
            int C = a + b;
            a = A;
            b = B;
            c = C;
        }

        System.out.println(a-b);

    }
}
