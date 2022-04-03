package theOther;

import java.util.*;
import java.util.stream.IntStream;

public class challengeForB_Stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = n*n;
        List<Integer> list = new ArrayList<>();

        List<Integer> finalList = list;
        IntStream.range(0, m).forEach(a -> finalList.add(sc.nextInt()));
        list = list.stream().sorted(Comparator.reverseOrder()).toList();

        boolean flg = true;
        int count = 0;
        for (int b = 0; b < m; b++){
            if(count >= 2){
                return;
            } else if (list.get(b) > list.get(b+1)){
                count++;
            }
            System.out.println(list.get(b));

        }

    }
}
