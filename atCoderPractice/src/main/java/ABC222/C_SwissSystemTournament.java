package ABC222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C_SwissSystemTournament {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int round = sc.nextInt();

		int rank [] [] = new int [2*people] [2];
		String gcp [] = new String [2*people];
		
		for (int i = 0; i < (2*people); i++) {
			rank[i][1] = i;			//全員分のランク　２次元配列の２次元目が1の時の要素
			gcp[i] = sc.next(); // 全員分のgcp
		}
		
		for(int i =0; i< round; i++) {	 //ラウンド数
			for (int j =0; j<people; j++) {		//１ラウンド内での各プレイヤーの勝負を繰り返す
				char playerA;
				char playerB;
				
				int a = 2*j;
				int b = 2*j+1;
				playerA = gcp[rank[a][1]].charAt(i);
				playerB = gcp[rank[b][1]].charAt(i);
				
				if (playerA == 'G') {
					if(playerB == 'C') {
						rank[a][0]++;
					}
					if(playerB =='P') {
						rank[b][0]++;
					}
				}
				if(playerA =='C') {
					if(playerB == 'P') {
						rank[a][0]++;
					}
					if(playerB == 'G') {
						rank[b][0]++;
					}
				}
				if(playerA=='P') {
					if(playerB == 'G') {
						rank[a][0]++;
					}
					if(playerB == 'C') {
						rank[b][0]++;
					}
				}
				
			}
			
			Arrays.sort(rank, (x,y) -> x[0] == y[0] ? Integer.compare(x[1], y[1]) : -Integer.compare(x[0], y[0]));
			
		}
		
		for(int i =0; i < 2*people; i++) {
			System.out.println(rank[i][1]+1);
		}
		
//		String [] gcp = new String [round]; 
//		List<Man> rank = new ArrayList<>();
//		
//		for (int i = 0; i < people; i++) {
//			Man man = new Man();
//			man.setId(i);
//			
//			String gcpp = sc.next();
//			for(int j = 0; j < round; j++) {
//				gcp[j] = gcp.split("");
//			}
//			man.setGcp(gcp);
//			rank.add(man);
//		}
//		
//		
//		
//	}
//	
//	public class Man {
//		int id;
//		String [] gcp;
//		int win = 0;
//		int draw = 0;
//		int lose = 0;
//		
//		public int getId() {
//			return id;
//		}
//		public void setId(int id) {
//			this.id = id;
//		}
//		public String[] getGcp() {
//			return gcp;
//		}
//		public void setGcp(String[] gcp) {
//			this.gcp = gcp;
//		}
//		public int getWin() {
//			return win;
//		}
//		public void setWin(int win) {
//			this.win = win;
//		}
//		public int getDraw() {
//			return draw;
//		}
//		public void setDraw(int draw) {
//			this.draw = draw;
//		}
//		public int getLose() {
//			return lose;
//		}
//		public void setLose(int lose) {
//			this.lose = lose;
//		}
	}
}
