package ABC242;

import java.util.Scanner;

public class A1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextInt();
		float b = sc.nextInt();
		float c = sc.nextInt();
		float x = sc.nextInt();
		
		if(x <= a) {
			System.out.println(a/a);
		} 
		
		if(x > b){
			System.out.println(0);
		}
		
		if(x > a && x <= b) {
			System.out.println(c / (b-a));
		}
		
	}
}
