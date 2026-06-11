package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// variables
			// constantes
		int NUMERO_GORDO = 16236;
			// entradas
		int numCliente;
		int decimosJugados;
			// variables para calcular
		int precio;
		boolean tieneGordo;
		String numClienteString;
		String numGordoString;

		// Pedir entradas
		System.out.printf("Teclea su número: ");
		numCliente = sc.nextInt();
		System.out.printf("Teclea su décimo: ");
		decimosJugados = sc.nextInt();

		// Computación
		numClienteString = Integer.toString(numCliente);
		numGordoString = Integer.toString(NUMERO_GORDO);
		
		// ***logs
		// System.out.println(numClienteString.substring(numClienteString.length() -
		// 2));
		// System.out.println(numGordoString.substring(numGordoString.length() - 2));

		tieneGordo = numCliente == NUMERO_GORDO;

			// actualizar valor de precio
		if (tieneGordo)
			precio = 400000;
		else {
			if (numCliente == (NUMERO_GORDO - 1) || numCliente == (NUMERO_GORDO + 1))
				precio = 2000;
			else if ((numClienteString.substring(numClienteString.length() - 2))
					.equals(numGordoString.substring(numGordoString.length() - 2)))
				precio = 100;
			else if ((numClienteString.substring(numClienteString.length() - 1))
					.equals(numGordoString.substring(numGordoString.length() - 1)))
				precio = 20;
			else
				precio = 0;
		}
		
		System.out.printf("%nEl número gordo de este año es %d.%n", NUMERO_GORDO);
		System.out.printf("El número de jugador es %d.%n",  numCliente);
		System.out.printf("==================================== %n");
		
		System.out.printf("Ha ganado %d euros.%n", precio * decimosJugados );

	}

}
