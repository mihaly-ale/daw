package arrays;

import java.util.Arrays;

public class arrayMultiDimMismaLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[2][3];

		System.out.println("\"int[][] m = new int[2][3]\"");
		System.out.println(" m.length: " + m.length);
		System.out.println(" m[0].length: " + m[0].length);
		System.out.println();

		m[1][1] = 7;

		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(" " + m[i][j]);
			}
			System.out.println();
		}

	}

}
