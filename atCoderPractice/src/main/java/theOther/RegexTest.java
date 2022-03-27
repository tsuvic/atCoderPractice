package theOther;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();

        /**
         * 数値（整数）チェック
         *
         * @param value 検証対象の値
         * @return 結果（true：数値、false：数値ではない）
         */

        //-123がtrueなので、^は後ろの全てのexpressionにかかっている
        //http://www.turtle.gr.jp/techno/regular-expression.html

        boolean result = false;
        if (value != null) {
            Pattern pattern = Pattern.compile("^[0-9]+$|-[0-9]+$");
            result = pattern.matcher(value).matches();
        }
        System.out.println(result);

    }
}
