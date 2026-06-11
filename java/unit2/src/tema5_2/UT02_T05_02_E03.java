package tema5_2;

public class UT02_T05_02_E03 {

	public static void main(String[] args) {

		String original = "Hola mundo";
		String invertida = invertirCadena(original);
		
		System.out.println("original: \n" + original);
		System.out.println("\ninvertida: \n" + invertida);
	}

	public static String invertirCadena(String texto) {

		return new StringBuilder(texto).reverse().toString();
	}
}
