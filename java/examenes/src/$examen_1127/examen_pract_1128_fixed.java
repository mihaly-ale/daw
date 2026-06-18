package $examen_1127;

import java.util.Scanner;

public class examen_pract_1128_fixed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numLineas = 0;
		int longitudLinea;

//	a
		do {
			System.out.print("¿Cuantas líneas quiere pintar?");
			try {
				numLineas = scan.nextInt();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scan.nextLine(); // sin limpiar el scanner, produce un bucle infinito
			}
		} while (numLineas < 10 || numLineas > 20);

//		do {
//			System.out.print("¿Cuantas líneas quiere pintar?");
//			numLineas = scan.nextInt();
//		} while (numLineas < 10 || numLineas > 20);

		System.out.println(); // separador

		for (int i = 0; i < numLineas; i++) {
			longitudLinea = (int) (Math.random() * 40 + 1);
			for (int j = 0; j < longitudLinea; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // final a

//		System.out.println("\n___________b_____________\n"); // separador

//	b
		for (int k = 0; k < numLineas; k++) {
			longitudLinea = (int) (Math.random() * 40 + 1);
			int carElector = (int) (Math.random() * 6 + 1);
			char car = ' ';

			switch (carElector) {
			case 1: {
				car = '*';
				break;
			}
			case 2: {
				car = '-';
				break;
			}
			case 3: {
				car = '=';
				break;
			}
			case 4: {
				car = '.';
				break;
			}
			case 5: {
				car = '|';
				break;
			}
			case 6: {
				car = '@';
				break;
			}
			} // final switch
			for (int j = 0; j < longitudLinea; j++) {
				System.out.print(car);
			}
			System.out.println();
		} // final b
	}
}
