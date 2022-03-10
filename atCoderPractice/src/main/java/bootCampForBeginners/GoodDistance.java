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
                    check += Math.pow(Math.abs(num[i][k] - num[j][k]),2);
                    System.out.println(check);
                }
                double checked = Math.sqrt(check);
                System.out.println(checked);
                System.out.println(String.valueOf(checked));
                Pattern pattern = Pattern.compile("^[0-9]+$|-[0-9]+$");
                boolean result = pattern.matcher(String.valueOf(checked)).matches();

                if (result) {
                    ans++;
                }

            }
        }
        System.out.println(ans);

    }
}
