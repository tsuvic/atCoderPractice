package ABC224;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Point> list = new ArrayList<>();
		
		for (int i =0; i < n; i++) {
			Point a = new Point();
			a.setLocation(sc.nextInt(), sc.nextInt());
			list.add(a);
		}
		
		int count = 0;
		int ans = 0;
		for (Point fromPoint : list ) {
			for (Point toPoint : list ) {
				if (fromPoint.x <= toPoint.x && fromPoint.y <= toPoint.y) {
					count++;
				}
			}
			if (count > 1) {
				ans += count -1;
			}
		}
		
		System.out.println();
	}
}
