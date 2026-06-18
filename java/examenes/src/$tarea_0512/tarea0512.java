package $tarea_0512;

import java.util.Random;
import java.util.Scanner;

public class tarea0512 {

	// dificultad baja comienzo
	public static String generarContrasenaBaja(String apellido, String nombre) {
		int numRnd;
		String contrasena, apellidoCon3Cars, nombreCon3Cars;

		// crear número aleatorio
		Random rnd = new Random();
		numRnd = rnd.nextInt(10, 99);
		apellidoCon3Cars = apellido.substring(0, 3);
		nombreCon3Cars = nombre.substring(0, 3);

		contrasena = nombreCon3Cars + apellidoCon3Cars + numRnd;
		return contrasena;
	} // fin baja

	// dificultad media comienzo
	public static String generarContrasenaMedia(String apellido, String nombre) {
		String cars = "!@#$%&*?";
		String contrasenaMedia;
		char simbolo = ' ';
		String contrasena = generarContrasenaBaja(apellido, nombre);

		// obtener simbolo
		Random rnd = new Random();
		for (int i = 0; i < cars.length(); i++) {
			simbolo = cars.charAt(rnd.nextInt(cars.length()));
		}

		// crear contra de media
		contrasenaMedia = contrasena + simbolo;

		return contrasenaMedia;
	} // fin media

	// dificultad alta comienzo
	public static String generarContrasenaAlta(String apellido, String nombre) {
		String contrasenaAlta = "", cadenaDeSimbolos = "_";
		int contrasenaLongitud, contrasenaAltaLongitud;
		String contrasena = generarContrasenaMedia(apellido, nombre);

		Scanner scan = new Scanner(System.in);

		// Pedir longitud
		System.out.print("Longitud de la contraseña: (De 10 a 20)");
		contrasenaAltaLongitud = scan.nextInt();

		// Computacion de contra alta
		contrasenaLongitud = contrasena.length(); // 9

		for (int i = contrasenaLongitud; i <= contrasenaAltaLongitud; i++) {
			boolean iEsPar = i % 2 == 0;

			if (iEsPar == false) { // empezar de 11
				String cars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				Random rnd = new Random();

				cadenaDeSimbolos += cars.charAt(rnd.nextInt(cars.length()));

			} else {// obtener simbolo
				String cars = "!@#$%&*?";

				Random rnd = new Random();
				cadenaDeSimbolos += cars.charAt(rnd.nextInt(cars.length()));
			}

		}

		contrasenaAlta = contrasena + cadenaDeSimbolos;
		return contrasenaAlta;
	} // fin alta

	public static void main(String[] args) {
		String nombre, apellido, contrasena = "";
		int dif;
		Scanner scan = new Scanner(System.in);

		System.out.print("Nombre:");
		nombre = scan.next().toLowerCase();
		System.out.print("Apellido:");
		apellido = scan.next().toLowerCase();
		System.out.print("Seleccione el nivel de dificultad de la contraseña: \n 1. Baja \n 2. Media \n 3. Alta ");
		dif = scan.nextInt();

		// llamar metodo contrasenaBaja
		if (dif == 1) {
			contrasena = generarContrasenaBaja(apellido, nombre);
		} else if (dif == 2) {
			contrasena = generarContrasenaMedia(apellido, nombre);
		} else if (dif == 3) {
			contrasena = generarContrasenaAlta(apellido, nombre);
		}

		System.out.println("Su contraseña generada es " + contrasena);

	} // fin main

}
