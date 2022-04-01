package theOther;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class challengeForB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();

        int path[][] = new int [n][n];

        for (int i =0; i < n; i++){
            for (int j =0; j < n; j++){
                path[j][i] = sc.nextInt();
            }
        }

        boolean waitFlg = true;
        for (int i =0; i < n; i++){
            boolean flg = true;
            for (int j =0; j < n; j++){
                if (path[i][j] >= num) {
                    flg = false;
                    break;
                }
            }
            if (flg){
                System.out.print(i+1 );
                waitFlg = false;
            }
        }
    if (waitFlg){
        System.out.println("wait");
    }
    }
}
