package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca el primero carácter: ");
		char primChar = scanner.next().charAt(0);
		System.out.println("Introduzca el segunda carácter: ");
		char segChar = scanner.next().charAt(0);
		
		if (primChar < segChar) System.out.println(primChar + " " + segChar);
		else System.out.println(segChar + " " + primChar);
	}
}
