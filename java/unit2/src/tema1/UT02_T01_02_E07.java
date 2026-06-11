package tema1;

import java.util.Scanner;

public class UT02_T01_02_E07 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declarar variables
		double entrada;
		double resultado;

		// leer entradas
		System.out.print("Teclea un número: ");
		entrada = sc.nextDouble();

		// computación
		resultado = entrada % 2;

		// mostrar resultados
		System.out.println("¿El número es par? " + (resultado == 0));
	}
}
