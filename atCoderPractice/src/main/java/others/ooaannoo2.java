package others;

import org.apache.commons.lang3.RandomStringUtils;

//改善策
public class ooaannoo2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder(RandomStringUtils.randomAlphabetic(1000000));
		for (int i = 0; i < (sb.length() - 1) / 2; i++) {
			char tmp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(sb.length()-(i+1)));
			sb.setCharAt(sb.length()-(i+1), tmp);
		}
		
		System.out.println(sb.toString());

		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");
	}
}
