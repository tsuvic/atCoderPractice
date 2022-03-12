package bootCampForBeginners;

import java.util.Scanner;
import java.util.regex.Pattern;


public class GoodDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [] [] num = new int [n] [d];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < d; j++){
                num [i] [j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++){//比較対象1
            for (int j = i + 1; j < n; j++){//比較対象2
                int check = 0;
                for (int k = 0; k < d; k++){//横軸 次元数
                    check += Math.pow(Math.abs(num[j][k] - num[i][k]),2);
                }

//                Math.pow(check,0.5) * Math.pow(check,0.5) == checkでは誤差が出る
//                if ((int)Math.pow(check,0.5) * (int)Math.pow(check,0.5) == check) {
                if (Math.sqrt(Double.valueOf(check)) == Math.floor(Math.sqrt(Double.valueOf(check)))){
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
