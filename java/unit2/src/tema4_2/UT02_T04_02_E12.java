package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numFilas = 25, numColumnas = 80;
		int filaComienzo, columnaComienzo, filaFinal, columnaFinal;
		char car;
		Scanner sc = new Scanner(System.in);

		// Personalizar tamaño de matriz
//		System.out.print("Teclea el número de filas: ");
//		numFilas = sc.nextInt();
//		System.out.print("Teclea el número de columnas: ");
//		numColumnas = sc.nextInt();		


		do {
			System.out.print("fila comienzo: ");
			filaComienzo = sc.nextInt();
		} while (filaComienzo < 0 || filaComienzo > numFilas);

		do {
			System.out.print("fila final: ");
			filaFinal = sc.nextInt();
		} while (filaFinal < filaComienzo || filaFinal > numFilas);

		do {
			System.out.print("columna comienzo: ");
			columnaComienzo = sc.nextInt();
		} while (columnaComienzo < 0 || columnaComienzo > numColumnas);

		do {
			System.out.print("columna final: ");
			columnaFinal = sc.nextInt();
		} while (columnaFinal < columnaComienzo || columnaFinal > numColumnas);

		do {
			System.out.print("Teclea el carácter: ");
			car = sc.next().charAt(0);
		} while (car != '*' && car != '?' && car != '+');

		// Dibujar matrix
		for (int i = 1; i <= numFilas; i++) {
			for (int j = 1; j <= numColumnas; j++)
				if (i >= filaComienzo && i <= filaFinal && j >= columnaComienzo && j <= columnaFinal)
					System.out.print(car);
				else
					System.out.print("a");
			System.out.println("");
		} // final for externo
	}
}
