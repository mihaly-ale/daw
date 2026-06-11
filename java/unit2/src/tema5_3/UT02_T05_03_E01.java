package tema5_3;

public class UT02_T05_03_E01 {

	public static void main(String[] args) { // palabra, numero, caracater

		if (args.length != 3) {
			System.out.println("El programa necesita 3 argumentos.");
			return;
		}

		String palabra = args[0];
		int numero;
		String letra = args[2].toLowerCase();

		try {
			numero = Integer.parseInt(args[1]); // se puede convertir a un entero
		} catch (Exception e) {
			System.out.println("El segundo argumento no es un Integer.");
			return;
		}

		boolean letraEsIoD = letra.equals("i") || letra.equals("d"); // logical OR

		if (letraEsIoD) {
			visualizarPalabra(palabra, numero, letra);
		} else {
			System.out.println("El tercer argumento debe ser \"i\" o \"d\".");
			return;
		}

	} // main

	static void visualizarPalabra(String palabra, int numero, String letra) {

		for (int i = 0; i < numero; i++) {
			if (letra.equals("d")) {
				System.out.print(palabra+ " ");
			} else {
				System.out.print(new StringBuilder(palabra).reverse());
			}
		} // for

	} // método

} // class
