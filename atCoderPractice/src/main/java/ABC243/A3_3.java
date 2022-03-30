package ABC243;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] x = new int[a];
        int [] y = new int[a];

        for (int i = 0; i < a; i++){
            x [i] = sc.nextInt();
            y [i] = sc.nextInt();
        }

        String s = sc.next();
        Map<Integer, Integer> right_min = new HashMap<>(); //右向きで最も小さい
        Map<Integer, Integer> left_max = new HashMap<>(); //左向きで最も大きい

        //R+option+↑で置換

        for (int i = 0; i < a; i++){
            if (s.charAt(i) == 'L'){
                if (right_min.containsKey(y[i]) && right_min.get(y[i]) < x[i]){
                    System.out.println("Yes");
                    return;
                }
            }

            if (s.charAt(i) == 'R'){
                if (left_max.containsKey(y[i]) && left_max.get(y[i]) > x[i]){
                    System.out.println("Yes");
                    return;
                }
            }

            if (s.substring(i, i+1).equals("R")){
                if(right_min.containsKey(y[i])){
                    right_min.put(y[i], Math.min(right_min.get(y[i]), x[i]));
                } else {
                    right_min.put(y[i], x[i]);
                }
            }

            if (s.substring(i, i+1).equals("L")){
                if(left_max.containsKey(y[i])){
                    left_max.put(y[i], Math.max(left_max.get(y[i]), x[i]));
                } else {
                    left_max.put(y[i], x[i]);
                }
            }
        }
        System.out.println("No");
    }
}
