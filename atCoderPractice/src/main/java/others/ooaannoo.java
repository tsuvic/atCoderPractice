package others;

import java.util.ArrayList;
import java.util.List;

public class ooaannoo {
	public static void main(String[] args) {
		String s = new String();
		s = "ooaannoo";
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}

		System.out.println(sb.toString());

	}
}
//コンパイル、実行をしてはいけない
//文字列の先頭と最後尾から文字を入れ替えることで、ループの繰り返し処理を減らすことができる
//大量の文字の文字列が入力された場合、どのように速度を上げるか。
//サーバスペックを上げる or サーバ台数増やし、反転処理を各サーバで実施 or 文字列を分割し、マルチスレッドで処理
