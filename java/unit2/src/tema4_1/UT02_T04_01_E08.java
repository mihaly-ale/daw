package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int precioOrdenador = 1000;
		int precioImpresora = 60;
		float precioTotal = 0.0f;
		float descuentoOrdenador = 0.0f;
		float descuentoImpresora = 0.0f;


		System.out.print("Cuantos ordenadores quiere comprar? ");
		int cantidadOrdenador = sc.nextInt();
		System.out.print("Cuantos impresoras quiere comprar? ");
		int cantidadImpresora = sc.nextInt();
		precioTotal = cantidadImpresora * precioImpresora + cantidadOrdenador * precioOrdenador;

		if (cantidadOrdenador > 5) {
			descuentoOrdenador = (cantidadOrdenador * precioOrdenador * 8 / 100);
		}
		if (cantidadImpresora > 5) {
			descuentoImpresora = (cantidadImpresora * precioImpresora * 6 / 100);
		}
		precioTotal -= descuentoImpresora + descuentoOrdenador;
		
		System.out.println("\nPrecio de " + cantidadOrdenador +  " ordenadores: " + (cantidadOrdenador * precioOrdenador));
		System.out.println("Descuento de ordenadores: " + descuentoOrdenador);
		System.out.println("Precio de " + cantidadImpresora +  " impresoras: " + (cantidadImpresora * precioImpresora));
		System.out.println("Descuento de ordenadores: " + descuentoImpresora);
		System.out.println("================================================");
		if(precioTotal > 2500) System.out.println("Aplicamos un 1% de descuento adicional en su compra.");
		System.out.println("El precio total de la compra: " +  ((precioTotal > 2500) ? (precioTotal -= precioTotal * 1 /100) : precioTotal) + " euros.");
	}
}