package tema4_3;

import java.util.Scanner;

public class UT02_T04_03_E03 {

	static public int obtenerMenor(int a, int b, int c) {
		int menor = 0;

		if (a < b) {
			if (c < a)
				menor = c;
			else
				menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}

		System.out.println("El menor es: " + menor);
		return menor;
	}

	static public int obtenerMayor(int a, int b, int c) {
		int mayor = 0;

		if (a > b) {
			if (a > c)
				mayor = a;
			else
				mayor = c;
		} else if (b > c) {
			mayor = b;
		} else {
			mayor = c;
		}

		System.out.println("El menor es: " + mayor);
		return mayor;
	}

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		a = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		b = sc.nextInt();
		System.out.println("Introduce el tercero numero");
		c = sc.nextInt();

		obtenerMenor(a, b, c);
		obtenerMayor(a, b, c);
	}

}
