package theOther;

import java.util.Scanner;

public class practiceForString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("a", "").replace("i","").replace("u","").replace("e","").replace("o","").replace("A", "").replace("I","").replace("U","").replace("E","").replace("O","");
        System.out.println(s.toString());
    }
}
