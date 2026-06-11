package ambito;

class ambitoGlobalVsLocal {
	static public int prueba1; // ámbito de clase o estático

	public static void main(String[] args) {
		int prueba2;
		int prueba3 = 8; // hay que inicializar
		
		System.out.println("Variable declarada en la clase, pero no incializada.");
		System.out.println("prueba1: " + prueba1);
//		 System.out.println("prueba2: " + prueba2);
		// ERROR: The local variable prueba2 may not have been initialized
		System.out.println("\nVariable local de main, es necesario declarar y incializar.");
		System.out.println("prueba3: " + prueba3);

	}
}