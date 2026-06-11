package string;

public class metodosDeString {

	public static void main(String[] args) {
		// replaceAll
		String str1 = "Hola Mundo";
		System.out.println(str1.replaceAll("[aeiou]", "x"));

		// split
		String[] palabras1 = str1.split("");
		String[] palabras2 = "Hola Mundo".split(" ");

		for (String p : palabras1) {
			System.out.print(p +"\t" 
					); // Hola, Mundo
		}
		System.out.println();
		
		for (String p : palabras2) {
			System.out.println(p); // Hola, Mundo
		}

		// contains, indexof
		// return si la cadena estra dentro de la otra cadena
		String palabra = "Mundo";
		System.out
				.println(str1.contains(palabra) ? "Está en posición " + str1.indexOf(palabra) : "No está la palabra.");
	}

}
