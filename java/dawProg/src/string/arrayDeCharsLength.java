package string;

public class arrayDeCharsLength {

	public static void main(String[] args) {
		char[] miCadena = new char[10];
		miCadena[0] = 'H';
		miCadena[1] = 'o';
		miCadena[2] = 'l';
		miCadena[3] = 'a';

		System.out.println("miCadena length " + miCadena.length); // 10
		System.out.println("contenido" + miCadena); // concatena con a dirección de memoria
		System.out.print(miCadena); // desde la posición 5 a 10 es el unicode '\0000' (=\0)
		System.out.print("-");
		System.out.println();

		// solo ver en contenido de cadena
		int i = 0;
		do {
			System.out.print(miCadena[i++]);
		} while (miCadena[i] != '\0');
		System.out.println("*\n");

		System.out.print("Representar un String con enteros: ");
		char[] miCadena2 = { 72, 111, 108, 97 };
		System.out.println(miCadena2); // because char is an entero, y los numeros representan caracteres
		System.out.println("-");

	}

}
