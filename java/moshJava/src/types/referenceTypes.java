package types;

import java.awt.Point;

public class referenceTypes {
	public static void main(String[] args) {

		Point point1 = new Point(1,2);		
		System.out.println("point1: " + point1);
		// point1: java.awt.Point[x=1,y=2]
		
		Point point2 = point1;
		System.out.println("point2: " + point2);
		// point2: java.awt.Point[x=1,y=2]
		
		point2.x = 9999;
		System.out.println("point1: " + point1);
		// point1: java.awt.Point[x=9999,y=2]
		
		point1.y = 1111;
		System.out.println("point2: " + point2);
		// point2: java.awt.Point[x=9999,y=1111]		
	}
}
