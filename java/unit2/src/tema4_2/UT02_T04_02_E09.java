package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int entrada;

		System.out.println("Teclea un número entero: ");
		entrada = sc.nextInt();
		System.out.println("");

		if (entrada == 0) {
			System.out.println("Entrada es " + entrada + " fin.");
		}

		while (entrada < 0) {
			System.out.println("Dato inválido, solo números positivos.");
			entrada = sc.nextInt();
		}

		if (entrada > 50) {
			System.out.println("Número es superior a 50.");
			if (entrada % 7 != 0) {
				int multiploProximo = ((entrada / 7) + 1) * 7; // con bucle !!!
				System.out.println("El múltiplo de 7 más próximo a " + entrada + " es " + multiploProximo + ".");
			} else
				System.out.println(entrada + " es múltiplo de 7.");
		} else if (entrada <= 50) {
			System.out.println("Número igual o inferior a 50, y es el " + entrada + ".");
//			for (int i = 1; i < entrada; i += 3) {
//				System.out.println(i);
//			}

			int i = 1;
			 while (i < entrada) {
				 System.out.print(i + " ");
				i += 3;
			}
			 
//			do {
//				System.out.println(i);
//				i += 3;
//			} while (i < entrada);
		}
	}
}
