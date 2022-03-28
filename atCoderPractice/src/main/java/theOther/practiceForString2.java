package theOther;

import java.util.Arrays;
import java.util.Scanner;

public class practiceForString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("-","");
        int ans =0;
        for (char ch : s.toCharArray()){
            int i = ch - '0';
            switch (i){
                case 0:
                    ans += 12 * 2;
                    break;
                default:
                    ans += (i+2) * 2;
                    break;
            }

        }
        System.out.println(ans);
    }
}
