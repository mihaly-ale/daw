package tema3;

import java.util.Scanner;

public class UT02_T03_E17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número entero: ");
		int entrada = scanner.nextInt();

		int entradaStrLength = Integer.toString(entrada).length();
		char ultChar = Integer.toString(entrada).charAt(entradaStrLength - 1);
		String resultado = ((Character.getNumericValue(ultChar) % 2 == 0) ? ("par") : ("impar"));
		System.out.println("El último dígito es " + ultChar + " es es un número " + resultado + ".");

		scanner.close();

	}

}
