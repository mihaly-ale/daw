package string;

public class stringComparison  {

	public static void main(String[] args) {

		String cad = "hola"; // String literal almacenado en el String pool
		String cad1 = new String("hola"); // Nuevo objeto String en el heap
		String cad2 = cad; // Misma referencia que cad (mismo objeto del String pool)


		System.out.println("equals() compara el contenido");
		System.out.println(" " + cad.equals(cad1)); // true, el mismo contenido
		System.out.println(" " + cad1.equals(cad2)); // true, el mismo contenido
		System.out.println(" " + cad.equals(cad2)); // true, el mismo contenido
		
		
		System.out.println("\nSystem.identityHashCode() proporciona el mismo ID si el objeto tiene la misma referencia");
		System.out.println(" cad  - ID de objeto: " + System.identityHashCode(cad));
		System.out.println(" cad2 - ID de objeto: " + System.identityHashCode(cad2));
		System.out.println(" cad1 - ID de objeto: " + System.identityHashCode(cad1));

		System.out.println("\n== comprueba si dos objetos tienen la misma referencia");
		System.out.println(" " + (cad == cad2)); // true, el mismo objeto, apuntan a la misma posición de la memoria
		System.out.println(" " + (cad == cad1)); // false, cad1 fue creada en el String pool
		System.out.println(" " + (cad1 == cad2)); // false
		
	}

}
