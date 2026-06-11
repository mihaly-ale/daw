package tema4_3;

import java.util.Random;

import java.util.Scanner;

public class UT02_T04_03_E14 {

	// método base
	public static void generarContrasena(int longitud) {
		String cars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
		String contrasena = "";

		Random rnd = new Random();

		for (int i = 0; i < longitud; i++) {
			contrasena += cars.charAt(rnd.nextInt(cars.length()));
		}
		;

		System.out.println(contrasena);
	}; // final método base

	// método sobrecargado
	public static void generarContrasena(int longitud, int cantidad) {

		for (int i = 0; i < cantidad; i++) {
			generarContrasena(longitud);
		}
	}; // final método sobrecargado

	// main
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la longitud de la contraseña: ");
		int longitud = scanner.nextInt();
		System.out.println();

		System.out.print("¿Cuántas contraseñas deseas generar? ");
		int cantidad = scanner.nextInt();
		System.out.println();

//		generarContrasena(longitud);
		generarContrasena(longitud, cantidad);
	}

}
