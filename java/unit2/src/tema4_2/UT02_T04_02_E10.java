package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int entradaAnterior;
		int entradaActual;
		int positivos = 0;
		int negativos = 0;
		int elNumeroMayorPar = 0 ;
		int validos = 0;

		System.out.print("Numero?");
		entradaAnterior = sc.nextInt(); //
		validos++;

		if (entradaAnterior != 0) {

			if (entradaAnterior > 0) {
				positivos++;
			} else {
				negativos++;
			}

			System.out.print("Numero?");
			entradaActual = sc.nextInt();

			while (entradaActual != 0) {

				if (entradaActual % 2 == 0) elNumeroMayorPar = entradaActual;
				
				
				if (entradaActual > entradaAnterior) {
					if (entradaActual > 0) {
						positivos++;
					} else {
						negativos++;
					}
					validos++;
					entradaAnterior = entradaActual;
				} else {
					System.out.print("Numero? \n Debe ser mayor qué " + entradaAnterior + "o 0 para finalizar.");
				}

				System.out.print("Numero ?");
				entradaActual = sc.nextInt();
			} // while fin
		} else {
			System.out.println("Fin de programa");
		} // if else fin -22

		System.out.println("validos: " + validos);
		System.out.println("positivos: " + positivos);
		System.out.println("negativos: " + negativos);
		System.out.println("elNumeroMayorPar: " + elNumeroMayorPar);

	}

}
