package theOther;
import java.util.Scanner;

/**
 * @author tsuvi
 * @version 1.0.0
 * 入力値として任意の数字を受け取り、回文数になるまで特定の加算処理を行い、結果として回文数を出力する。
 */
public class palindromicNumber {

    /**
     * <p>1桁以外の任意の数字を1つだけ入力値として受け取り、回文数かどうかを判定し、結果が回文数になるまで繰り返し計算処理を行う。</p>
     * <p>【判定結果が回文数の場合】計算結果の数値を出力する。</p>
     * <p>【判定結果が回文数ではない場合】計算結果の数値に計算結果を反対にした数値を足す計算処理を行う。</p>
     * @param args システム入力値として、1桁以外の任意の数字を1つだけ引数として受け取る。
     *             入力値は保証されていることを前提とし、バリデーションは行わない。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();

        while(true){
            StringBuilder sb = new StringBuilder();
            if (isPalindromic(ans)){
                break;
            }
            ans = ans + Integer.parseInt(sb.append(ans).reverse().toString());
        }
        System.out.println(ans);
    }

    /**
     * 入力値として整数を受け取り、回文数かどうかの判定を行い、判定結果を返却する。
     * @param ans not {@code null}
     * @return boolean
     */
    public static boolean isPalindromic(int ans){
        StringBuilder sb = new StringBuilder();
        return String.valueOf(ans).equals(sb.append(ans).reverse().toString());
    }
}
