package theOther;

import java.util.*;

public class practiceForSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String direction;
        String color;


        for(int i=0; i<n; i++){
            direction = sc.next();
            color = sc.next();

            if(direction.equals("L")){
                switch (color){
                    case "R":
                        a--;
                        break;
                    case "G":
                        b--;
                        break;
                    case "B":
                        c--;
                        break;
                    case "Y":
                        a--;
                        b--;
                        break;
                    case "M":
                        a--;
                        c--;
                        break;
                    case "C":
                        b--;
                        c--;
                        break;
                    case "W":
                        a--;
                        b--;
                        c--;
                        break;
                }
            } else {
                switch (color){
                    case "R":
                        a++;
                        break;
                    case "G":
                        b++;
                        break;
                    case "B":
                        c++;
                        break;
                    case "Y":
                        a++;
                        b++;
                        break;
                    case "M":
                        a++;
                        c++;
                        break;
                    case "C":
                        b++;
                        c++;
                        break;
                    case "W":
                        a++;
                        b++;
                        c++;
                        break;
                }
            }

            if (a == b && b == c){
                System.out.println(a);
                return;
            }

        }
        System.out.println("no");
    }
}
