package metodos;

public class valorVsReferencia {

	// Aqui se define la variable de ámbito de clase, tiene valores por defecto

	public static void main(String[] args) {
		
		// los tipos primitivos se PASAN POR VALOR
		int numero = 5; 
		System.out.println("Entero ANTES del método: " + numero);
		cambiar(numero);
		System.out.println("Entero DESPUÉS del método: " + numero);
	System.out.println();

		// Objetos inmutables, String, Integer, Float, Double
		// los que se encapsulan los tipos primitivos también se PASAN POR VALOR
		String texto = "Hola";
		System.out.println("String ANTES del método: " + texto);
		cambiarTexto(texto);
		System.out.println("String DESPUÉS del método: " + texto);
		System.out.println();

		// Objeto mutable - paso por referencia
		// Objeto StringBuilder
		StringBuilder textoSB = new StringBuilder("Hola");
		System.out.println("Text con StringBuilder ANTES del método: " + textoSB);
		cambiarSB(textoSB); // referencia del objeto
		System.out.println("Text con StringBuilder DESPUÉS del método: " + textoSB);
		
		System.out.println(sumarDosNumeros(4, numero));
		int suma = sumarDosNumeros(4, numero);
		System.out.println(suma);
		System.out.println(sumarDosNumeros(4, sumarDosNumeros(1, 2))); //sumar tres numeros con ele metdodo que suma 2 numeros

	}

	public static void cambiar(int n) {
		n = 10; // solo cambia la copia local
	}

	public static void cambiarTexto(String s) {
		s = "Adiós"; // solo cambia la copia local
	}

	public static void cambiarSB(StringBuilder sb) {
		sb.append(" Mundo"); // modifica el objeto original
	}
	
	public static int sumarDosNumeros(int a, int b) {
		return a+b;	
	}

}
