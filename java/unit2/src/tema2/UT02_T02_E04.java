package tema2;

import java.util.Scanner;

public class UT02_T02_E04 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);
		String str = new String();

		// declarar variables
		String entrada;
		int entradaLength;

		// leer entrada
		System.out.print("Introducir una palabra: ");
		entrada = sc.next();

		// computación
		entradaLength = entrada.length();

		// mostrar resultados
		System.out.println("Empieza por la letra: " + entrada.charAt(0));
		System.out.println("Termina por la letra: " + entrada.charAt(entradaLength - 1));
	}
}
