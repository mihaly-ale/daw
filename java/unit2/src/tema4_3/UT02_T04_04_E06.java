package tema4_3;

import java.util.Random;

public class UT02_T04_04_E06 {

	public static void main(String[] args) {

		mostrarAleatorios(5);
		System.out.println();
		mostrarAleatorios(5, 10, 20);
	};

	public static void mostrarAleatorios(int cant) {
		Random rnd = new Random();

		for (int i = 0; i < cant; i++) {
			System.out.printf("%.4f%n", rnd.nextFloat());
		}
	};

	public static void mostrarAleatorios(int cant, int start, int end) {
		Random rnd = new Random();

		for (int i = 0; i < cant; i++) {
			System.out.println(rnd.nextInt(10, 20));
		}
	}

}
