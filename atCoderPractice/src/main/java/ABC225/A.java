package ABC225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A {
	static List<String> ans1 = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			list.add(s.substring(i, i+1));
		}
		
		permutation(list);
		ans1 = ans1.stream().distinct().collect(Collectors.toList());
		System.out.println(ans1.size());
	}
	
	    private static void permutation(List<String> seed) {
	        String[] perm = new String[seed.size()];
	        boolean[] used = new boolean[seed.size()];
	        buildPerm(seed, perm, used, 0);
	    }

	    private static void buildPerm(List<String> seed, String[] perm, boolean[] used, int index) {
	        if (index == seed.size()) {
	            procPerm(perm);
	            return;
	        }

	        for (int i = 0; i < seed.size(); ++i) {
	            if (used[i]) continue;
	            perm[index] = seed.get(i);
	            used[i] = true;
	            buildPerm(seed, perm, used, index + 1);
	            used[i] = false;
	        }
	    }

	    private static void procPerm(String[] perm) {
	    	StringBuilder sb = new StringBuilder();
	    	for (String s : perm) {
	    		sb.append(s);
	    	}
	    	
	    	ans1.add(sb.toString());
	    }
		
}
