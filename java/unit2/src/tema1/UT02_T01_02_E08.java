package tema1;

import java.util.Scanner;

public class UT02_T01_02_E08 {
	public static void main(String[] args) {

		// instanciación
		Scanner sc = new Scanner(System.in);
		// declarar variables
		double altura, diametro, volumen;

		// leer entradas
		System.out.print("Teclae la altura del cilindro: ");
		altura = sc.nextDouble();
		System.out.print("Teclae el diametro del cilindro: ");
		diametro = sc.nextDouble();

		// computación
		volumen = altura * Math.PI * Math.pow((diametro / 2), 2);

		// mostrar resultados
		System.out.print("El volumen del cilindro es: " + volumen);
	}
}