package others;

import org.apache.commons.lang3.RandomStringUtils;

//標準API
public class ooaannoo3 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder(RandomStringUtils.randomAlphabetic(1000000));
		sb.reverse();
		System.out.println(sb.toString());
		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");

	}
}
