package tema2;

import java.util.Scanner;

public class UT02_T02_E07 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declarar variables
		String entradaPalabra;
		char entradaChar;
		String nuevaCadena;
		char simbolo = '*';

		// leer entradas
		System.out.print("Teclea una cadena: ");
		entradaPalabra = sc.next();
		System.out.print("Teclea un carácter: ");
		// El método next() devuelve tipo String, que es un array, y elegimos la primera
		// posición.
		entradaChar = sc.next().charAt(0);

		// computación
		nuevaCadena = entradaPalabra.replace(entradaChar, simbolo);

		// mostrar resultados
		System.out.println("Cadena: " + entradaPalabra);
		System.out.println("Carácter: " + entradaChar);
		System.out.println("Cadena nueva: " + nuevaCadena);
	}
}
