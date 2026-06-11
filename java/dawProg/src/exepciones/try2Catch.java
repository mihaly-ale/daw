package exepciones;

public class try2Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "La casa es azul";
		try {
			System.out.println(7 / 0); // genera un ERROR
			System.out.println(cadena.charAt(cadena.length())); // esto es omitido por el programa, aunque genera un
																// ERROR
		} catch (StringIndexOutOfBoundsException e) { // entra al bloque, si el error es un
														// StringIndexOutOfBoundsException
			System.out.println("catch primero");
			System.out.println("Error: " + e.getMessage());
		} catch (ArithmeticException e) { // entra al bloque, si el error es un ArithmeticException
			System.out.println("catch segundo");
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Final del primer bloque \"try\".");
		System.out.println("-------- \n");

		try {
			System.out.println(cadena.charAt(cadena.length())); // ERROR
			System.out.println(7 / 0); // ERROR, pero no registrado
		} catch (ArithmeticException | StringIndexOutOfBoundsException e) { // Java Multi-Catch => elige si el error es
																			// de una u otra
			System.out.println("Error: " + e.getMessage());
		}
	}
}
