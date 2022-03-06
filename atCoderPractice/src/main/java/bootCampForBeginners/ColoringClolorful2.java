package bootCampForBeginners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColoringClolorful2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char [] list = s.toCharArray();
        List<Integer> list2 = new ArrayList<>();
        for(char c : list){
            list2.add(Integer.parseInt(String.valueOf(c)));
        }

        int cnt = 0;
        for (int i = 0; i < list2.size(); i++){
            if(list2.get(i) == i % 2){
                cnt++;
            }
        }

        int cnt2 = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) != i % 2){
                cnt2++;
            }
        }

        int ans = Integer.min(cnt, cnt2);
        System.out.println(ans);

    }

}

