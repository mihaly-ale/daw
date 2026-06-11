package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea el primer apellido: ");
		String apellido = scanner.next();

		System.out.println(apellido);

		if (
			(apellido.charAt(0) == 'E' || apellido.charAt(0) == 'e')
			|| (apellido.charAt(0) == 'F' || apellido.charAt(0) == 'f')
			) {
			System.out.println("El cliente se cobra en este sucursal.");
		} else {
			System.out.println("El cliente no se cobra en este sucursal.");
		}

	}

}
