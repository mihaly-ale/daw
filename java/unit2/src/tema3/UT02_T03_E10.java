package tema3;

public class UT02_T03_E10 {

	public static void main(String[] args) {

		int a = 12, b = 20;
		boolean resultado;

		resultado = a != 3 && b != 0;
		// true AND true => true
		System.out.println(resultado);

		resultado = a != 0 || b > 3;
		// true OR true => true
		System.out.println(resultado);

		resultado = a < b && b >= 20;
		// true AND true => true
		System.out.println(resultado);

		resultado = !(b > a);
		// !true => false
		System.out.println(resultado);
	}
}