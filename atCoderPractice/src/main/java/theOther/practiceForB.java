package theOther;

import java.util.*;

public class practiceForB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //乗用可能人数
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        //乗用した人数
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ans.put(i, 0);
        }

        int j = 0; //status
        for (int i = 0; i < m; i++) { //人の数

            int people = sc.nextInt();
            while (true) {
                if (list.get(j) >= people) {
                    ans.replace(j, ans.get(j) + people);

                    j++;
                    if (j == n){
                        j = 0;
                    }
                    break;

                } else {
                    ans.replace(j, ans.get(j) + list.get(j));
                    people -= list.get(j);
                    j++;
                    if (j == n){
                        j = 0;
                    }
                }

            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(ans.get(i));
        }

    }

}
