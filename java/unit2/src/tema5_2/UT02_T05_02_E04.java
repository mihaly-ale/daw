package tema5_2;

import java.util.Scanner;

public class UT02_T05_02_E04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder frase = new StringBuilder();
		String palabra = "";

		System.out.println("Introduce palabras (escribe 'fin' para terminar):");

		while (!palabra.equalsIgnoreCase("fin")) { // mientras palabra no es "fin"
			palabra = sc.next(); // lee palabra a palabra

			if (!palabra.equalsIgnoreCase("fin")) { // para no añadir "fin" a la frase
				if (frase.length() > 0) {
					frase.append(" "); // añade espacio antes de la siguiente palabra
				} 
				frase.append(palabra);
			} else {
				System.out.println("Ha tecleado solo fin para finalizar.");
				return;
			}
		}

		System.out.println("Frase completa: " + frase.toString());
		sc.close();

	}

}
