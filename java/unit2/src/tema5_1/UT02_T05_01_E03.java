package tema5_1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UT02_T05_01_E03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArray, vecesArray;
		int longitudDeArray, totalNumeros, maxValor;
		System.out.print("Teclea la longitud de array: ");
		longitudDeArray = scan.nextInt();
		System.out.println();

		intArray = construirArray(scan, longitudDeArray);

		System.out.println("\n¿Cuántas veces tecleo el 1, cuantas el 2, cuantas el 3, … cuantas el 15?");
		System.out.printf("%9S VECES%n", "numero");
		System.out.println(" ----------------");
		vecesArray = logNumerosVeces(intArray);
		for (int i = 0; i < vecesArray.length; i++) {
			System.out.printf("%6d %6d \n", i + 1, vecesArray[i]);
		}

		System.out.println("\n¿Cuántos números tecleo el usuario? ");
		totalNumeros = obtenerTotalNumeros(vecesArray);
		System.out.print("  El usuario ha tecleado " + totalNumeros + " números.\n");

		System.out.println("\n¿Qué números fueron los más tecleados?");
		System.out.println("\n¿Un máximo de " + maxValor(vecesArray) + " veces se ha tecleado: ");
		maxValor = maxValor(vecesArray);
		for (int i = 0; i < vecesArray.length; i++) {
			if (vecesArray[i] == maxValor)
				System.out.println("\tNúmero " + (i+1));
		}

	} // main

	public static int[] construirArray(Scanner scan, int longitud) {
		int[] array = new int[longitud];
		int i = 0;

		while (i < longitud) {
			int num;

			System.out.print("Teclea un número de 1 a 15 (0 para fin): ");
			try {
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("\nError: debes introducir un número entero.\n");
				scan.nextLine(); // borrar la entrada incorrecta
				continue;
			}

			if (num == 0) {
				System.out.println("\nHas tecleado el número 0, el programa saldrá.");
				return array;
			} else if (num > 0 && num <= 15) { // entrada válida
				array[i++] = num;
			} else {
				System.out.println("Número inválido, inténtalo de nuevo.");
			}

		}

		System.out.println("Has llenado el matriz.");

		return array;
	} // final construirArray

	public static int[] logNumerosVeces(int[] array) {

		int[] vecesArray = new int[15]; // crear array para guardar numero de occurencias de números teclados
		for (int i = 0; i < 15; i++) { // i para índices de vecesArray
			int veces = 0; // contador
			for (int j = 0; j < array.length; j++) { // recorrer el parametro
				if (i + 1 == array[j]) // si numero (i+1) es igual a valores de array
					veces++;
			}
			vecesArray[i] = veces;
		} // final for con num
		return vecesArray;
	} // final logNumerosVeces

	public static int obtenerTotalNumeros(int[] array) {
		int contador = 0;

		for (int i = 0; i < array.length; i++) {
			contador += array[i];
		}
		return contador;
	} // final obtenerDistintosNumeros

	public static int maxValor(int[] array) {
		int contador = 0;

		for (int i = 0; i < array.length; i++) {
			if ((array[i]) > contador)
				contador = array[i];
		}
		System.out.println("cont " + contador);
		System.out.println("arra " + Arrays.toString(array));
		return contador;
	} // final numerosMasFrecuenets

}
// class
