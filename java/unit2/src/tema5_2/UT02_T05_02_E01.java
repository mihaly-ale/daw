package tema5_2;

import java.util.Scanner;

public class UT02_T05_02_E01 {

	public static void main(String[] args) {
		String nombreCompleto;
		String vocales = "[aáeéiíoóuúAÁEÉIÍOÓUÚ]"; // [] - cualquier de estos caracteres
		String vocalesConBandera = "(?ui)[aáeéiíoóuú]"; // banderas: i - case insensitive, u - 

		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre completo: "); // Álvaro Pérez
		String entrada = scan.nextLine();
		nombreCompleto = entrada.isEmpty() ? "Álvaro Pérez" : entrada;

		System.out.println("\nregexp " + "[aáeéiíoóuúAÁEÉIÍOÓUÚ]");
		System.out.println(nombreCompleto.replaceAll(vocales, ""));
		
		System.out.println("\nregexp " + "(?ui)[aáeéiíoóuú]");
		System.out.println(nombreCompleto.replaceAll(vocalesConBandera, ""));

	}

};