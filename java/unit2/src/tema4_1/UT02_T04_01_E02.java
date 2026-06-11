package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int descuento = 10;
		int precioFinal;

		System.out.println("El precio de cd: ");
		int cd = scanner.nextInt();
		System.out.println("El precio de amplificador: ");
		int amplificador = scanner.nextInt();
		System.out.println("El precio de sintonizador: ");
		int sintonizador = scanner.nextInt();
		System.out.println("El precio de pletina: ");
		int pletina = scanner.nextInt();

		int sumaComponentes = cd + amplificador + sintonizador + pletina;

//		(sumaComponentes > 1000) ? ("si"):("no");

		if (sumaComponentes > 1000) {
			precioFinal = (sumaComponentes -  (sumaComponentes * 10 / 100));
		} else {
			precioFinal = sumaComponentes;
		}

		System.out.println("El precio a pagar es " + precioFinal + ".");

	}

}
