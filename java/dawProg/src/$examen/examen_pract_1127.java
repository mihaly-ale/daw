package $examen;

public class examen_pract_1127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String frase2 = "Amo la paloma";

		String frase1 = "La casa es azul";
		
		int numLetras = 0;
		int numEspacios = 0;
		int numPalabras = 0;
		int startIndice = 0;
		int endIndice = 0;
		String palabra;

		System.out.println("Palabras----");
		for (int i = 0; i < frase1.length(); i++) {

			char letra = frase1.charAt(i);

			
			if (letra != ' ') {
				numLetras++;
			} else {
				numEspacios++;

				endIndice = i; // 2, 7, 10
				palabra = frase1.substring(startIndice, endIndice);
				

				System.out.println(palabra);
				
				if (endIndice == 10) { // debe ser dinamico aqui
					System.out.println(frase1.substring(endIndice + 1));
				}
				 startIndice = i + 1;
			}

		}
		numPalabras = numLetras / numEspacios;

		System.out.println("\n");
		System.out.println("Número de letras: " + numLetras);
		System.out.println("Número de palabras: " + numPalabras);
	}
}
