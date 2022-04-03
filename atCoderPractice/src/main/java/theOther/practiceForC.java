package theOther;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practiceForC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //桁数ごとに分ける
        String a = sc.next();
        String b = sc.next();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        switch (a.length() - b.length()) {
            case 1:
                listB.add(0);
                break;
            case 2:
                listB.add(0);
                listB.add(0);
                break;
        }

        switch (b.length() - a.length()) {
            case 1:
                listA.add(0);
                break;
            case 2:
                listA.add(0);
                listA.add(0);
                break;
        }

        for (int i = 0; i < a.length(); i++){
            listA.add(Integer.valueOf(a.substring(i, i+1)));
        }

        for (int i = 0; i < b.length(); i++){
            listB.add(Integer.valueOf(b.substring(i, i+1)));
        }

        //足し算
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(a.length(),b.length()); i++){
            sb.append((listB.get(i)+listA.get(i))%10);
        }
        System.out.println(sb.toString());

    }


}
