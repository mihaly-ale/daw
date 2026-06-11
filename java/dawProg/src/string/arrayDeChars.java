package string;

public class arrayDeChars {

	public static void main(String[] args) {
		char[] miCadena = { 'h', 'o', 'l', 'a' };

		// -------------------------
		// PREGUNTA DE CUESTIONARIO
		// -------------------------
		
		System.out.println("longitud: " + miCadena.length); // 4
		System.out.println("contenido: " + miCadena); // contenido [C@7eda2dbb
		// Java interpreta el signo + como concatenación cuando el primer operando es un String		
		System.out.println(miCadena); /// hola - solo en el caso de que sea un array de caracteres (`char[]`)
		
		// El método de println() es sobrecargado
		
	}

}
