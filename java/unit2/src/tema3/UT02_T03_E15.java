package tema3;

public class UT02_T03_E15 {

	public static void main(String[] args) {

		String numero = "123";
		String numeroHex = "#ff";
		String numeroBin = "1010";
		String texto = "texto";
		String textoEnd = "texto1";
		String startTexto = "1texto";

		System.out.println("Cadenas de texto:");
		System.out.println("	Número: " + numero + "\n" + "	Número binario: " + numeroBin + "\n"
				+ "	Número hexadecimal: " + numeroHex + "\n" + "	Texto simple: " + texto + "\n"
				+ "	Texto acaba con número: " + textoEnd + "\n" + "	Texto empieza con número: " + startTexto + "\n");

		System.out.println("Cadenas de texto despues el método de Integer.decode()");
		System.out.println("El método devuelve tipo Integer");
		System.out.println("\"" + numero + "\" descifrado con Integer.decode() devuelve: " + Integer.decode(numero));
		System.out.println("\"" + numeroHex + "\" descifrado con Integer.decode() devuelve: " + Integer.decode(numeroHex));
		System.out.println("\"" + numeroBin + "\" descifrado con Integer.decode() devuelve: " + Integer.decode( numeroBin));
		try {
			System.out.println(Integer.decode(texto));
		} catch (NumberFormatException e) {
			System.out.println("\"" + texto + "\" descifrado con Integer.decode() devuelve: " + e.getClass().getSimpleName() + " error.");
		}

		try {
			System.out.println(Integer.decode(textoEnd));
		} catch (NumberFormatException e) {
			System.out.println("\"" + textoEnd + "\" descifrado con Integer.decode() devuelve: " + e.getClass().getSimpleName() + " error.");
		}

		try {
			System.out.println(Integer.decode(startTexto));
		} catch (NumberFormatException e) {
			System.out.println("\"" + startTexto + "\" descifrado con Integer.decode() devuelve: " + e.getClass().getSimpleName() + " error.");
		}

		// ====> parseInt() <=========
		System.out.println("---------------");
		System.out.println("Cadenas de texto despues el método de Integer.praseInt()");
		System.out.println("El método devuelve tipo Integer");
		System.out.println(Integer.parseInt(numero, 10));
		try {
			System.out.println(Integer.parseInt(numeroHex, 16));
		} catch (NumberFormatException e) {
			System.out.println("\"" + numeroHex + "\" descifrado con Integer.parseInt() devuelve: " + e.getClass().getSimpleName() + " error.");
		}
		System.out.println("Sin # simbolo => Integer.parseInt(\"ff\", 16): " + Integer.parseInt("ff", 16));
		System.out.println("Integer.parseInt(\"1010\", 2): " + Integer.parseInt(numeroBin, 2));
		System.out.println(Integer.parseInt(textoEnd));
//		System.out.println(Integer.parseInt(textoEnd));
//		System.out.println(Integer.parseInt(texto));
	}

}
//Visualizar el número entero obtenido a partir de una cadena. Utilizando los métodos de la clase Integer.
//Observar y razona los errores que puede producir,
//
//p.e. si la cadena introducida no está compuesta únicamente de dígitos el método da error.
//¿Qué diferencia hay entre estos dos métodos? 