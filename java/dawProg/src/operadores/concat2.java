package operadores;

public class concat2 {

	public static void main(String[] args) {
		System.out.println(7 + 2);
		System.out.println(7 + 2 + " es el resultado.");
		System.out.println("Operación " + 7 + 2 + " es el resultado.");
		
		// System.out.println("Operación" + 7 - 2 + " es el resultado.");
		// Operación7 - 2 => string menos 2 es un error
		
		System.out.println("Operación " + 7 * 2 + " es el resultado."); 
		// *, /, % → higher precedence
		System.out.println("Operación " + (7 + 2) + " es el resultado.");

	}

}
