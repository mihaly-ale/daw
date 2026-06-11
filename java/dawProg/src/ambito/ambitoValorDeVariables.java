package ambito;

public class ambitoValorDeVariables {

	static int entero;
	static float decimal;
	static char car;
	static boolean booleano;
	// ambito de clase se iniclizan por defecto
	// el valor por defecto de tipo primitivo
	static String valorS;

	public static void main(String[] args) {
		metodo();		
	}

	public static void metodo() {
		int a = 0;

		System.out.println("Variable local a de método: " + a);
		System.out.println("Valor por defecto de tipo int de la clase: " + entero);
		System.out.println("Valor por defecto de tipo float de la clase: " + decimal);
		System.out.println("Valor por defecto de tipo char de la clase: " + (int)car);
		System.out.println("Valor por defecto de tipo booleano de la clase: " + booleano);
		System.out.println("Valor por defecto de tipo NO primitivo (tipo de Referencia): " + valorS);
		// null, porque la variable apunta a un sitio de la memoria, que es vacío
	}

} // class
