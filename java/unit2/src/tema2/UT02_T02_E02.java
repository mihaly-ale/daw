package tema2;

import java.util.Scanner;

class UT02_T02_E02 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declarar variables
		double rad;
		double esfera;

		// entrada del dato
		System.out.print("Teclea el radio de la esfera:");

		// leer entrada
		rad = sc.nextDouble();

		// computación
		esfera = (4.0 / 3.0) * Math.PI * Math.pow(rad, 3);

		// mostrar resultado
		System.out.println("El volumen de la esfera:" + esfera);

	}
}
