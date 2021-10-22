package others;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

//初回実装。単純ループ
public class ooaannoo5 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		String s = new String();
		s = String.valueOf(RandomStringUtils.randomAlphabetic(1000000));
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}

		System.out.println(sb.toString());
		
		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");

	}
}
