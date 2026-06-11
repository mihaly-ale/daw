package UT03_T02_02_MAQUINAEXPENDEDORA;

import java.util.HashMap;
import java.util.Scanner;

public class UsaInventario {

	public static void main(String[] args) {

		// PRODUCTOS
		Producto agua = new Bebida("Agua", 120, false);
		Producto patatas = new Snack("Patatas", 130, true);
		Producto mixto = new Sandwich("Mixto", 350, null);

		Producto[] productos = { agua, patatas, mixto };

		for (Producto p : productos) {
			imprimirProducto(p);
		}

		// INVENTARIO

		HashMap<CodigoProducto, Slot> inventario = new HashMap<>();
		try {
			inventario.put(new CodigoProducto("A1"), new Slot(agua, 3));
			inventario.put(new CodigoProducto("B2"), new Slot(patatas, 4));
			inventario.put(new CodigoProducto("B3"), new Slot(patatas, 4));
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		// ************************************
		// log
		logInventario(inventario);

		// Usuario compra
		System.out.print("\nElige un producto: ");
		Scanner sc = new Scanner(System.in);
		String codigo = sc.next();
		CodigoProducto codigoProductoAVender = new CodigoProducto(codigo);

		if (!inventario.containsKey(codigoProductoAVender)) {
			System.err.println("El producto no existe.");
			return;
		}

		inventario.get(codigoProductoAVender).vender();
		logInventario(inventario);

		// Reponer
		inventario.get(codigoProductoAVender).reponer(2);
		logInventario(inventario);

	} // main

	public static void logInventario(HashMap<CodigoProducto, Slot> inv) {
		System.out.println("\nStock actual:");
		for (CodigoProducto c : inv.keySet()) {
			System.out.println("\t" + c.codigoProducto() + " - > | stock=" + inv.get(c).getStock());
		}
	}

	public static void imprimirProducto(Producto p) {
		if (p instanceof Bebida) {
			System.out.println(((Bebida) p).imprimir());
		} else if (p instanceof Snack) {
			System.out.println(((Snack) p).imprimir());
		} else if (p instanceof Sandwich) {
			System.out.println(((Sandwich) p).imprimir());
		} else {
			System.out.println(p.imprimirBasico());
		}
	}
} // main