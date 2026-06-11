package operadores;

class concat1 {

	public static void main(String[] args) {
		int edad = 17; // ámbito global
		int num = 1;

		System.out.println("Edad " + edad + " este año"); 				// + funciona como concat
		System.out.println("Edad " + edad + 1 + " el próximo año");		// + funciona como concat
		System.out.println("Edad " + (edad + 1) + " el próximo año");	// para evitar concatenation cerrar entre ()
		System.out.println("Edad " + (edad + num) + " el próximo año");	
		System.out.println("Edad " + (edad - 1) + " el previo año");
		// resta tambien entre ()
		// + y - tienen la misma precedencia, asi que Edad17-1 es inválido
		System.out.println("Edad " + (edad - num) + " el previo año");

	}
}