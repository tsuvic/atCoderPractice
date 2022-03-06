package ABC242;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		//String型配列にしたい
		char[] list = s.toCharArray();
		List<String> list2 = new ArrayList<>();
		for (char a : list) {
			list2.add(Character.toString(a));
		}
		
		list2.stream().sorted().forEach(System.out::print);
	}
}
