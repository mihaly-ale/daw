package $examen_1127;

public class examen_pract_1127_extended_fixed {

	public static void main(String[] args) {

		String fraseOne = "La casa es azul";
		String fraseDos = "Amo la paloma";

		int numLetras = 0;
		int numEspacios = 0;
		int numPalabras = 0;

		int fraseOneLongitud = fraseOne.length(); // 15

		System.out.println("----Palabras----");
		for (int i = 0; i < fraseOneLongitud; i++) {

			char letra = fraseOne.charAt(i);

			if (letra != ' ') { // letra no es un espacio, ergo es una letra
//				System.out.println("en el if la letra es: "+ letra);
				numLetras++;
				System.out.print(letra); // Salida: La (cada letra, una tras otra hasta, hasta que la letra es espacio
											// => else)

			} else { // letra es espacio
//				System.out.println("en el else la letras es: " + letra);
				numEspacios++;
				System.out.println("");
			}
		}
		numPalabras = numLetras / numEspacios;

		System.out.println("\n");
		System.out.println("Número de letras: " + numLetras);
		System.out.println("Número de palabras: " + numPalabras);

		System.out.println("\n----start metodo obtenerPalabras----");
		obtenerPalabras(fraseOne);
		System.out.println();
		obtenerPalabras(fraseDos); 

		System.out.println("\n----start metodo palindromo----");
		palindromo(fraseOne);
		palindromo(fraseDos);

	} // final main

	static void obtenerPalabras(String frase) {

		int fraseLongitud = frase.length(); // 15
		int startIndice = 0;
		int endIndice;
		String palabra;

		for (int i = 0; i < fraseLongitud; i++) {

			char letra = frase.charAt(i);

			if (letra == ' ') {
				// System.out.println(i); // la posición de cada espacio en la frase
				endIndice = i; // 2, 7, 10 - fraseOne
				palabra = frase.substring(startIndice, endIndice); // 0-2, 3-7, 8-10 => incrementamos startIndice por uno antes
															// de salir de if, porque queremos que startIndice marca la
															// letra que viene despues el espacio
//				System.out.println(palabra); // para ver variable
//				System.out.println(Character.toUpperCase(palabra.charAt(0))); // para ver la primera letra en mayúscula de cada palabra

				palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);

				System.out.println(palabra);
				startIndice = i + 1;
			}
		}
		String ultimaPalabra = frase.substring(startIndice);
		ultimaPalabra = Character.toUpperCase(ultimaPalabra.charAt(0)) + ultimaPalabra.substring(1);
		System.out.println(ultimaPalabra);
	} // final obtenerPalabras

	static void palindromo(String frase) {
		int fraseLongitud = frase.length(); // 15
		String fraseSinEspacio = "";
		String fraseInvertido = "";

		for (int i = 0; i < fraseLongitud; i++) {
			if (frase.charAt(i) != ' ') {
				fraseSinEspacio += frase.charAt(i);
//				System.out.println(fraseSinEspacio.toLowerCase());
			}
		}

		for (int i = fraseLongitud - 1; i >= 0; i--) {
			if (frase.charAt(i) != ' ') {
				fraseInvertido += frase.charAt(i);
//				System.out.println(fraseInvertido.toLowerCase());
			}
		}
		

		if (fraseSinEspacio.toLowerCase().equals(fraseInvertido.toLowerCase())) {
			System.out.println(frase + " es palíndromo");
		} else {
			System.out.println(frase + " no es palíndromo");
		}
		
		if ((fraseSinEspacio.compareToIgnoreCase(fraseInvertido)) == 0) { // 0 es igual, otros valores no => API
			System.out.println(frase + " es palíndromo. (compareToIgnoreCase)");
		} else System.out.println(frase + " no es palíndromo. (compareToIgnoreCase)");	
		
		
		if (fraseSinEspacio.equalsIgnoreCase(fraseInvertido)) { // true OR false
			System.out.println(frase + " es palíndromo. (equalsIgnoreCase)");
		} else System.out.println(frase + " no es palíndromo. (equalsIgnoreCase)");	

	}

} // final class