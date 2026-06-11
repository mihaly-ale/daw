package arrays;

import java.util.Arrays;

public class arrayMultiDimDiffLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {{3,4,5},{2,5,7,9, -1, 99}};
		
		System.out.println("\"int[][] m = {{3,4,5},{2,5,7,9, -1, 99}}\"");
		System.out.println(" m.length: " + m.length);
		System.out.println(" m[0].length: " + m[0].length);
		System.out.println(" m[1].length: " + m[1].length);
		System.out.println();
		
	
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(" " + m[i][j]);
			}
			System.out.println();
		}

	}

}
