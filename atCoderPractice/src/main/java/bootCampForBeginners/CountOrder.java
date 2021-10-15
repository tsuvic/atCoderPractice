package bootCampForBeginners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


//FAIL
public class CountOrder {
	public static int [] permArray;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		Arrays.setAll(p,  x -> Integer.parseInt(sc.next()));
		Arrays.setAll(q,  x -> Integer.parseInt(sc.next()));
		
		permArray = new int[n];

		for(int i =0; i < n; i++) {
			permArray[i] = i+1;
		}
		
		System.out.println(Math.abs(getRank(p) - getRank(q)));
	
	}
	
	//写経
	public static int getRank(int[] array) {
		int rank = 1;
		//引数で渡された配列の要素の先頭から順番に比較。最初に一致しなかった要素の添字を返す。
		if (Arrays.mismatch(permArray, array) == -1) { 
			return rank;
		}
		
		while(nextPermutation(permArray)) {
			rank++;
			if (Arrays.mismatch(permArray, array) == -1) {
				break;
			}		
		}
		
		//次回、getRankメソッドを使用するためにリセット
		Arrays.sort(permArray);
		return rank;
	}
	
	//順列を渡して、arrayに合致するまで、次順に移動する
	public static boolean nextPermutation(int[] array) {
		int si = -1;
		
		//入れ替え要素（si）を特定することを目的に、配列の後方から要素の比較を行う。
		for (int i = array.length -1; i > 0; i--) {
			if(array[i-1] < array[i]) {
				si = i;
				break;
			}
		}
		
		if ( si == -1) {
			return false;
		}
		
		//入れ替え要素（si）を用いて、次順を作る　ADCBの時、siは1
		//指定範囲を昇順にソート。array.lengthの要素は含まない
		//A DCB⇨ABCD(si 1
		//AC DB⇨ACBD(si 2
		//ADB C⇨ADBC(si 3
		
		Arrays.sort(array, si , array.length);
		for (int i = si; i< array.length; i++) {
			if (array[si-1] < array[i]) { //入れ替え要素（si）の一つ前の要素 と i番目の要素
				int tmp = array[si-1];
				array[si-1] = array[i];
				array[i] = tmp;
				break;
			}
		}
		
//		Arrays.sort(array, si, array.length);
		return true;
	}
	
	
	
	
//	//写経
//	static String nextPermutaiton (String s) {
//		ArrayList <Character> list = new ArrayList<>();
//		for (int i = 0; i < s.length(); i ++) {
//			list.add(s.charAt(i));
//		}
//		
//		int pivotPos = -1;
//		char pivot = 0;
//		for (int i=list.size()-2;i>=0; i--) { //リスト後方から要素の比較
//			if(list.get(i) < list.get(i+1)) {
//				pivotPos = i;
//				pivot = list.get(i);
//				break;
//			}		
//		}
//		
//		if (pivotPos ==-1 && pivot == 0) {
//			return "Final";
//		}
//		
//		int L = pivotPos+1;
//		int R = list.size()	-1;
//		int minPos = -1;
//		char min = Character.MAX_VALUE;
//		
//		for (int i = R; L<= i; i--) { //ピボット位置より右にある最小の値を後方から探索
//			if (pivot < list.get(i)) {
//				if (list.get(i) < min) {
//					min = list.get(i);
//					minPos = i;
//				}
//			}
//		}
//		
//		Collections.swap(list, pivotPos, minPos);
//		Collections.sort(list.subList(L, R+1));
//		
//		StringBuilder sb = new StringBuilder()	;
//		for (int i = 0; i < list.size(); i++) sb.append(list.get(i));
//				
//		return  sb.toString();
//	}
	
}
