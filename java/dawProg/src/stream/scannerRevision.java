package stream;

import java.util.Scanner;

public class scannerRevision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner

		String str1 = sc.next(); // lee palabras
		String str2 = sc.next();

		sc.close(); // aqui se cierra, y no se puede utilizar más bajo
		// ERROR: Exception in thread "main" java.lang.IllegalStateException: Scanner
		// closed

		sc.nextLine(); // limpiar buffer

		String frase = sc.nextLine(); // lee frases

		System.out.print("str1: " + str1 + " str2: " + str2 + " frase: " + frase);

		sc.close(); // Cerrar el flujo del escaner
	}
}
