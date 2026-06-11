package tema1;

import java.util.Scanner;

public class UT02_T01_02_E06 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declarar variables
		double precioArticulo, cantidadArticulo, precioTotal;

		// leer entradas
		System.out.print("Escribe el precio del artículo: ");
		precioArticulo = sc.nextDouble();
		System.out.print("Escribe la cantidad del artículo: ");
		cantidadArticulo = sc.nextDouble();

		// computación
		precioTotal = precioArticulo * cantidadArticulo;

		// mostrar resultados
		System.out.println("El precio total de los " + cantidadArticulo + " articulos: " + precioTotal);
	}
}