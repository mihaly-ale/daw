package tema5_1;

import java.util.ArrayList;
import java.util.Scanner;

public class UT02_T05_01_E07 {

	public static void main(String[] args) {
		int filasSala = 5, asientosFila = 5;
		int entradasVendidas = 0;
		int totalAsientos = filasSala * asientosFila;

		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<String>> sala = crearAsientos(filasSala, asientosFila);

		int opc;

		while ((opc = imprimirMenu(scan)) != 4) {
			switch (opc) {
			case 1:
				entradasVendidas += ventaEntrada(sala, scan, totalAsientos);
				break;
			case 2:
				filasCompletadas(sala);
				break;
			case 3:
				estadoOcupacion(sala);
				break;
			}
		}
		localidadesVendidas(entradasVendidas);
	}

	static int imprimirMenu(Scanner scan) {
		int opcionMenu;
		System.out.println("\n----------Menu---------");
		System.out.println("1. Venta de entradas\n2. Filas completadas\n3. Estado de ocupación\n4. Fin");
		System.out.println("-----------------------");
		System.out.print("\nElige opción de menu: ");
		opcionMenu = comprobarEntrada(scan);
		return opcionMenu;
	}

	static ArrayList<ArrayList<String>> crearAsientos(int filas, int asientos) {
		ArrayList<ArrayList<String>> sala = new ArrayList<>();

		for (int i = 1; i <= filas; i++) {
			ArrayList<String> fila = new ArrayList<>();

			for (int j = 1; j <= asientos; j++) {
				fila.add(Integer.toString(j));
			}
			sala.add(fila);
		}
		return sala;
	}

	static int comprobarEntrada(Scanner scan) {
		int entrada = 0;

		boolean valido = false;

		while (!valido) {
			if (scan.hasNextInt()) { // comprobar Scanner buffer por Integer
				entrada = scan.nextInt(); // leer
				valido = true; // integer es válido
			} else {
				String inválido = scan.next(); // guardar 
				System.out.print("Error: " + inválido + ". Introduce un numero entero:");
			}
		}
		return entrada;
	}

	static int ventaEntrada(ArrayList<ArrayList<String>> sala, Scanner scan, int totalAsientos) {
		int cantidadEntradas, filaSeleccionada;
		int butacaSeleccionada;

		// pedir datos de venta
		do { // asientos
			System.out.print("\nCuántos asientos? ");
			cantidadEntradas = comprobarEntrada(scan);
//			cantidadEntradas = scan.nextInt();
			if (cantidadEntradas <= 0 || cantidadEntradas > totalAsientos) {
				System.out.println("Cantidad invàlida. Debe ser más de 0 or menos de " + totalAsientos + ".");
			}
		} while (cantidadEntradas <= 0 || cantidadEntradas > totalAsientos);

		do { // fila
			System.out.print("\nQue fila? ");
			filaSeleccionada = comprobarEntrada(scan);
			if (filaSeleccionada <= 0 || filaSeleccionada > sala.size()) {

				System.out.println("Fila inválida. Debe ser más de 0 or menos de " + sala.size() + ".");
			}
		} while (filaSeleccionada <= 0 || filaSeleccionada > sala.size());

		ArrayList<String> fila = sala.get(filaSeleccionada - 1);

		for (int i = cantidadEntradas; i > 0; i--) { // pedir butacas
			System.out.println("for " + i);
			boolean reservada = false;

			do {
				do {
					System.out.println("\n Que butaca?");
					butacaSeleccionada = comprobarEntrada(scan);
				} while (butacaSeleccionada < 0 || butacaSeleccionada > fila.size());

				int indice = butacaSeleccionada - 1;
				reservada = fila.get(indice).equals("Reservada");

				if (!reservada) {
					fila.set(indice, "Reservada");
					System.out.println("reserving");
				} else {
					System.out.println("already reserved");
				}
			} while (reservada);
		} // for

		System.out.println("\n");
		return cantidadEntradas;
	} // ventaEntrada

	static void filasCompletadas(ArrayList<ArrayList<String>> sala) {
		System.out.println("\nFILAS COMPLETADAS:");

		for (int i = 0; i < sala.size(); i++) { // obtener filas
			ArrayList<String> fila = sala.get(i);
			boolean filaLlena = true;

			for (String butaca : fila) {
				if (!butaca.equals("Reservada")) { // si butaca NO es reservada cambia valor de booleano
//					System.out.println("En la fila " + (i + 1) + " butaca " + butaca + " no está reservada."); // primer butaca en cada fila no reservada
					filaLlena = false;
					break;
				}
			}

			if (filaLlena) { //
				System.out.println(" La fila " + (i + 1) + " está llena.");
			}
		}
		System.out.println("\n");
	} // filasCompletadas

	static void estadoOcupacion(ArrayList<ArrayList<String>> sala) {
		System.out.println("\nESTADO DE LA SALA:");
		for (ArrayList<String> fila : sala) {
			System.out.println(" " + fila);
		}
		System.out.println("\n");
	} // estadoOcupacion

	static void localidadesVendidas(int entradasVendidas) {
		System.out.println("\nVendí " + entradasVendidas + " entradas.");
		System.out.println("El programa saldrá.");
	}
}

//do { // validar cada butaca
//	System.out.print("\nQué butaca? ");
//	butacaSeleccionada = scan.nextInt();
//
//	if (butacaSeleccionada <= 0 || butacaSeleccionada > fila.size()) { // afuero de rango
//		System.out.println("Butaca inválida. Debe ser entre 1 y " + fila.size() + ".");
//	} else { // comprobar disponibilidad
//
//		int indice = butacaSeleccionada - 1;
//
//		if (fila.get(indice).equals("Reservada")) {
//			System.out.println("Butaca \"" + butacaSeleccionada + "\" en fila " + filaSeleccionada
//					+ " ya está reservada.");
//			butacaReservada = true;
//		} else {
//			fila.set(indice, "Reservada"); // butacReservada es falso, no hemos cambiado
//			System.out.println("Butaca " + butacaSeleccionada + " fue reservada.");
//			break;
//		}
//	}
//
//} while ((butacaSeleccionada > 0 && butacaSeleccionada <= fila.size()) || butacaReservada);
