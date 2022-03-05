package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeIfTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList(new String[] {"A", "B", "C"})
        );

//        list.removeIf(
//                (String s) -> {
//                    return s.equals("B");
//                }
//        );

        //listをList型インタフェースでやり取りするため、固定長ではなく可変長として扱う
        for (String s: list){
            if("B".equals(s)){
                list.remove(s);
            }
        }
        list.add("D");

        for (String s : list){
            System.out.println(s);
        }

        System.out.println(list);

    }
}
