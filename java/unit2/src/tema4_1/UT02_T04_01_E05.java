package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea un carácter: ");
		char caracter = scanner.next().charAt(0);

//		if (caracter >= 97) {
//			if (caracter <= 122) {
//				System.out.println("carácter " + caracter+ " es minúscula");
//			}
//		} else if (caracter >= 65) {
//			if (caracter <= 90)
//				System.out.println("carácter " + caracter + " es mayúscula");
//		} else {
//			System.out.println(caracter + " no es un letra");
//		}

		if (caracter == 'A' || caracter == 'a')
			System.out.println("CORRECTO");
		else
			System.out.println("INCORRECTO");
	}

}
