package $tarea_0512;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class tarea_Joaquin {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		int dificultad = 0;

		do {

			System.out.println("Introduce el nivel de dificultad de la contraseña: ");
			System.out.print("   1. Baja \n   2. Media \n   3. Alta \n");

			try {
				dificultad = sc.nextInt();

			} catch (InputMismatchException errorText) {

				System.out.print("ERROR: " + errorText + "\nIntroduce una opción de menú valida: ");
				sc.nextLine(); // Limpia el el buffer del escaner
			}

		} while (dificultad > 3 || dificultad < 1);

		return dificultad;

	}// menu

	public static void contrasena(int nivel, String nombr, String ape) {

		Random rdm = new Random();
		String simbolo = "!@#$%&*?", mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ", imprime = "", mayus = "_",
				simbol = Character.toString(simbolo.charAt(rdm.nextInt(0, simbolo.length())));
		boolean alternar = true;
		int longitud = 0;

		switch (nivel) {
		case 1:

			System.out.println(
					"La contraseña es: \n   " + nombr.substring(0, 3) + ape.substring(0, 3) + rdm.nextInt(0, 99));

			break;

		case 2:

			System.out.println("La contraseña es: \n   " + nombr.substring(0, 3) + ape.substring(0, 3)
					+ rdm.nextInt(0, 99) + simbol); // Se usa el simbolo aleatorio de inicializacion

			break;

		case 3:

			do {

				System.out.println("Introduce la longitud de caracteres especiales de la contraseña (1-50): ");

				try {
					longitud = sc.nextInt();

				} catch (InputMismatchException errorText) {

					System.out.print("ERROR: " + errorText + "\nIntroduce una opción de menú valida: ");
					sc.nextLine(); // Limpia el el buffer del escaner
				}

			} while (longitud > 50 || longitud < 1);

			// System.out.println(mayus);
			// System.out.println(simbol);

			// Comienza en 2 porque se introducen en mayus _ y un simbolo aleatorio al
			// inicio
			for (int i = 2; i < longitud; i++) {

				imprime += mayus + simbol;

				if (alternar) {
					mayus = Character.toString(mayusculas.charAt(rdm.nextInt(0, mayusculas.length())));
					alternar = false;

				} else {
					simbol = Character.toString(simbolo.charAt(rdm.nextInt(0, simbolo.length())));
					alternar = true;
				}

			}

			// System.out.println(imprime);

			System.out.printf("%nLa contraseña es: \n   %s%s%d%s%s ", nombr.substring(0, 3), ape.substring(0, 3),
					rdm.nextInt(0, 99), simbolo.charAt(rdm.nextInt(0, simbolo.length())), imprime);

			break;

		}
	}

	public static void main(String[] args) {

		String nombre, apellido;

		System.out.println("Introduce el nombre: ");
		nombre = sc.next();

		System.out.println("Introduce el apellido: ");
		apellido = sc.next();

		int dificultad = menu();

		// System.out.println(dificultad + nombre + apellido);

		contrasena(dificultad, nombre, apellido);

	}
}
