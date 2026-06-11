package tema2;

import java.util.Scanner;

public class UT02_T02_E06 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declaración variables
		String entrada;
		int entradaLength;
		String raiz;
		String terminacion;

		// leer entrada
		System.out.print("Escribe un verbo en infinitivo: ");
		entrada = sc.next();

		// computacion
		entradaLength = entrada.length();
		raiz = entrada.substring(0, entradaLength - 2);
		terminacion = entrada.substring(entradaLength - 2);

		// mostrar resultados
		System.out.println("La raíz es: " + raiz);
		System.out.println("La terminación es: " + terminacion);

	}
}
