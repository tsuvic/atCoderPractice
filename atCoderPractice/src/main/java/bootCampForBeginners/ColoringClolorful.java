package bootCampForBeginners;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColoringClolorful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char [] list = s.toCharArray();
        List<Integer> list2 = new ArrayList<>();
        for(char c : list){
            list2.add(Integer.parseInt(String.valueOf(c)));
        }

        int ans = 0;
        for (int i =0; i < list2.size()-1; i++){
            if(list2.get(i).equals(list2.get(i+1))){
                switch (list2.get(i+1)){
                    case 0:
                        list2.set(i+1, 1);
                        ans++;
                        break;
                    case 1:
                        list2.set(i+1, 0);
                        ans++;
                        break;
                }
            }
        }

        System.out.println(ans);
    }

}

