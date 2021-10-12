package bootCampForBeginners;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// メール内容の取得
		int messageTemplateNum = sc.nextInt();
		String blockTemplate = sc.next();
		String[] messageTemplate = new String[messageTemplateNum];

		for (int i = 0; i < messageTemplateNum; i++) {
			messageTemplate[i] = sc.next();
		}

		// 取引先情報の取得
		int companyNum = sc.nextInt();

		for (int i = 0; i < companyNum; i++) {
			int companyInfoNum = sc.nextInt();
			String[][] companyInfo = new String[companyInfoNum][2];

			for (int k = 0; k < companyInfoNum; k++) {
				for (int j = 0; j < 2; j++) {
					companyInfo[k][j] = sc.next();
				}

				// 置換 indexofの使い方がわかっていない。asListの使い方も分かっていないため要復習。
				String tmp = companyInfo[k][0];
				if (Arrays.asList(messageTemplate).contains(tmp)) {
					messageTemplate[Arrays.asList(messageTemplate).indexOf(tmp)] = companyInfo[companyInfoNum][1];
				}
			}

			// 出力
			StringBuilder sb = new StringBuilder();
			for (int l = 0; l < messageTemplateNum; l++) {
				sb.append(messageTemplate[l]);
			}
			System.out.println(sb);
		}
	}

}
