package $tarea_0512;

import java.util.Random;
import java.util.Scanner;

public class tarea_Sandra {
	Random numero = new Random();

	public static String baja(String nombre, String apellido) {
		Random numero = new Random();

		String contraseña = "";

		String tresNombre = nombre.substring(0, 3); // cojo los 3 primeros caracteres de nombre y de apellido
		String tresApellido = apellido.substring(0, 3);

		contraseña = tresNombre + tresApellido + numero.nextInt(10, 99); // añadimos a la contraseña el numero aleatorio

		return contraseña;
	}

	public static String media(String nombre, String apellido) {

		Random numero = new Random();

		String contraseña = baja(nombre, apellido), caracteres = "!@#$%&*?";

		int posicion = numero.nextInt(0, 7); // las posiciones van de 0 a 7 no de 1 a 8

		contraseña += caracteres.charAt(posicion);

		return contraseña;
	}

	public static String alta(String nombre, String apellido, int longitud) {

		Random numero = new Random();

		String contraseña = media(nombre, apellido), caracteres = "!@#$%&*?", mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char guion = '_';

		contraseña += guion;

		char mayusculaAleat = ' ';
		char caracterAleat = ' ';

		for (int i = 11; i <= longitud; i++) {

			if (i % 2 != 0) {
				mayusculaAleat = mayusculas.charAt(numero.nextInt(0, 25));
				contraseña += mayusculaAleat;
			} else {
				caracterAleat = caracteres.charAt(numero.nextInt(0, 7));
				contraseña += caracterAleat;
			}

		}

		return contraseña;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre: ");
		String nombre = sc.next();
		System.out.println("Apellido: ");
		String apellido = sc.next();

		System.out.println("Seleccione el nivel de dificultad de la contraseña: ");
		System.out.println("1. Baja\n2. Media\n3. Alta");
		int opc = sc.nextInt();

		switch (opc) {

		case 1:
			System.out.println("Su contraseña generada es: " + baja(nombre, apellido));
			break;
		case 2:
			System.out.println("Su contraseña generada es: " + media(nombre, apellido));
			break;

		case 3:
			System.out.println("Longitud de la contraseña (De 10 a 20): ");
			int longitud = sc.nextInt();
			System.out.println("Su contraseña generada es: " + alta(nombre, apellido, longitud));
			break;

		}

	}

}
