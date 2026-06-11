package tema1;

import java.util.Scanner;

public class UT02_T01_02_E02 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declarar variables
		double entrada, raizCuadrada;

		// leer entradas
		System.out.println("Escribe un número: ");
		entrada = sc.nextDouble();

		// computación
		raizCuadrada = Math.sqrt(entrada);

		// mostrar resultado
		System.out.println("Su raiz cuadrada es: " + raizCuadrada);
	}
}