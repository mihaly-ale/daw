package tema2;

import java.util.Scanner;

public class UT02_T02_E05 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);
		
		// declarar variables
		String entrada;
		int posicion;

		// leer entradas
		System.out.print("Teclea una palabra: ");
		entrada = sc.next();
		System.out.print("Teclea un número: ");
		posicion = sc.nextInt();

		// mostrar resultado
		System.out.print("La letra que ocupa la posición " + posicion + " es la " + entrada.charAt(posicion - 1) + ".");
	}
}
