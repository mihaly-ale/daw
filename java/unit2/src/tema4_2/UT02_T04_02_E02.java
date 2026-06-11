package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.printf("Teclea un número entero y positivo: ");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.printf("Error");
		} else {			
				for (int i = numero; i > 0; i--) {
					System.out.print("* ");
			} //for
		}//else
	}
}
