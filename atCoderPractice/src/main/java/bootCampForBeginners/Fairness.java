package bootCampForBeginners;

import java.util.Scanner;

public class Fairness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        if(k % 2 == 0){
            System.out.println(a-b);
        } else {
            System.out.println(b-a);
        }

//        for (int i =0; i < k; i++){
//            long A = b + c;
//            long B = a + c;
//            long C = a + b;
//            a = A;
//            b = B;
//            c = C;
//        }
//        System.out.println(a-b);

    }
}
