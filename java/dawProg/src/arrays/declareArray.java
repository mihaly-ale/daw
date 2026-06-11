package arrays;

public class declareArray {

	public static void main(String[] args) {

		// DECLARACIÓN E INICIALIZACIÓN de variables
		int numero; // declaración
		numero = 7; // incialización

		int numero1 = 7; // declaración e incialización

		// DECLARACIÓN E INICIALIZACIÓN de **arrays**
		int[] iVector; // Declaración de vector/array (array es un vector?)
		// forma de nombrar por convenio: *tipo[] nombre*
		int iiVector[];


		System.out.println("Incialización:\n\"iVector = new int[4]\"");
		iVector = new int[4]; // Incialización
		// el tamaño de array en cada posición (0,1,2,3 => 4 elementos ) con un tipo entero (int)
		// int[entero] = longitud
		System.out.println("length: " + iVector.length);
		System.out.println("iVector[0]: " + iVector[0]); // al declarar se inicializa con valores por defecto
		
		System.out.println("\ncada posición fue inicializada con el valor por defecto del tipo");
		for (int i = 0; i < 4; i++) {
			System.out.print(iVector[i] + " ");
		}
		
		iVector[0] = 3;
		iVector[1] = 8;
		iVector[2] = -7;
		iVector[3] = 9;

		System.out.println("\n\n\"iVector[0] = 3, etc\"");
		for (int i = 0; i < 4; i++) {
			System.out.print(iVector[i] + " ");
		}
	}

}
