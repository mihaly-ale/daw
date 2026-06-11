package exepciones;

public class tryCatchSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) { // e es un objeto de esta clase(ArithmeticException)
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Final 7/0.");
		
		System.out.println("\n");
		
		String cadena = "La casa es azul";		
		try {
			System.out.println(cadena.charAt(cadena.length()));
		} catch (StringIndexOutOfBoundsException e) { // e es un objeto de esta clase(StringIndexOutOfBoundsException)
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Final cadena length.");

	}

}
