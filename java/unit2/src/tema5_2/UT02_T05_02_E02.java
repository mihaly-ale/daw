package tema5_2;

public class UT02_T05_02_E02 {

	public static void main(String[] args) {

		String frase = "La CASA de mis abuelos es una casa antigua, pero cada casa tiene su historia, y esta casa guarda muchos recuerdos.";
		String palabra = "casa";

		buscaPalabra(frase, palabra);
	}
	static void buscaPalabra(String frase, String palabra) {
		int contador = 0;

		int indicePalabra = frase.toLowerCase().indexOf(palabra.toLowerCase()); // obtener indice la primera vez

		while (indicePalabra != -1) {
			contador++; // incrementar la primera vez, porque ha entrado el bucle, es decir encontró la primera occurencia
			indicePalabra = frase.toLowerCase().indexOf(palabra.toLowerCase(), indicePalabra + palabra.length()); 
			
		}

		System.out.println("La palabra \"casa\" aparece "  + contador +  " veces en la frase.");

	}

}
