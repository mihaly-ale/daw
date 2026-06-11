package exepciones;

public class tryCatchFinally {

	public static void main(String[] args) {

		String cadena = "La casa es azul";
		
		try {
			System.out.println(7 / 2);
			System.out.println(cadena.charAt(cadena.length()));
		} catch (StringIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally { // ahora no teine funcionalidad, luego podemos usar para cerrar el scanner
			System.out.println("En el bloque \"finally\" ."); // siempre ejecuta, independientemente del resultado
		}
		
		System.out.println("Final");
	}
}
