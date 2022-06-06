package bootCampForBeginners;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SmallAndLargeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int k = sc.nextInt();

//        if (b - a < k * 2 ) {
//            LongStream.range(a, b + 1).forEach(i -> System.out.println(i));
//        } else {
//            LongStream.range(0, k).forEach(i -> System.out.println(a + i));
//            LongStream.range(0, k).forEach(i -> System.out.println(b - k + 1 + i));
//        }

        for (long i = a; i <= Math.min(a + k - 1, b); i++){
            System.out.println(i);
        }
        for (long i = Math.max(a + k, b - k + 1); i <= b; i++){
            System.out.println(i);
        }


    }
}
