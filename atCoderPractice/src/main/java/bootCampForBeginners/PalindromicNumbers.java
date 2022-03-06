package bootCampForBeginners;

import java.util.Locale;
import java.util.Scanner;

public class PalindromicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            boolean flg = true;
            for (int j = 0; j < s.length() / 2; j++) {
                if (!(s.substring(j, j + 1).equals(s.substring(s.length() - 1 -j, s.length() -j )))) {
                    flg = false;
                    break;
                }
            }

            if (flg == true) {
                ans++;
            }
        }
        System.out.println(ans);

    }
}





