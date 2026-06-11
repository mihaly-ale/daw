package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca edad: ");
		int edad = scanner.nextInt();
		System.out.print("Introduzca la altura en m: ");
		float altura = scanner.nextFloat();
		System.out.println("Tiene " + edad + " años y mide " + altura + " m.");

		if (edad > 18) {
			System.out.println("Es mayor de edad.");
		}

		if (altura < 1.75) {
			System.out.println("Mide menos de 1.75.");
		}
		scanner.close();

	}

}
