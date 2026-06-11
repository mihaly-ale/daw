package $examen;


public class examen_pract_1127_extended_not_fixed {

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
				endIndice = i; // 2, 7, 10
				palabra = frase.substring(startIndice, i); // 0-2, 3-7, 8-10 => incrementamos startIndice por uno antes
															// de salir de if, porque queremos que startIndice marca la
															// letra que viene despues el espacio
//				System.out.println(palabra); // para ver variable
//				System.out.println(Character.toUpperCase(palabra.charAt(0))); // para ver la primera letra en mayúscula de cada palabra

				palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);

				System.out.println(palabra);
				startIndice = i + 1;
				
				if (endIndice == 10 ) { // no funciona en el case de fraseOne
					String ultimaPalabra = frase.substring(endIndice + 1);
					ultimaPalabra = Character.toUpperCase(ultimaPalabra.charAt(0)) + ultimaPalabra.substring(1);
					System.out.println(ultimaPalabra);
				}
			}
		}		
	} // final obtenerPalabras

	static void palindromo(String frase) {
		int fraseLongitud = frase.length(); // 15 en fraseOne
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
			System.out.println(frase + " es palindrome");
		} else {
			System.out.println(frase + " no es palindrome");
		}
	}

} // final class
