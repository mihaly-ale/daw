package tema5_1;

import java.util.Random;

public class UT02_T05_01_E05 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		Random rnd = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rnd.nextInt(1, 10);
			}
		}

//	System.out.println();
		int sumaDiagonal = 0;
		for (int i = 0; i < matriz.length; i++) {
			int sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila += matriz[i][j];
				System.out.print(matriz[i][j] + "\t");
				if (i ==j ) {
					sumaDiagonal += matriz[i][j];
				}
				
			}
			System.out.println("-> " + sumaFila);
		}
		
		System.out.println("\nLa suma de la digital es: " + sumaDiagonal);
	}

}
