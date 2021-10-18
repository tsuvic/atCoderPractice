package bootCampForBeginners;

import java.awt.Point;
import java.util.Scanner;

public class RuinedSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Point p1 = new Point();
		p1.setLocation(sc.nextInt(), sc.nextInt());
		Point p2 = new Point();
		p2.setLocation(sc.nextInt(), sc.nextInt());
		
		Point p3 = new Point();
		p3.setLocation(p2.getX()-(p2.getY() - p1.getY()), p2.getY()+(p2.getX() - p1.getX()));
		
		Point p4 = new Point();
		p4.setLocation(p3.getX() - (p2.getX() - p1.getX()), p3.getY() - (p2.getY() - p1.getY()));
		
		System.out.println(Integer.valueOf((int) p3.getX()) + " " + (int)p3.getY() + " " + (int)p4.getX() + " " + (int)p4.getY());
		
	}
}
