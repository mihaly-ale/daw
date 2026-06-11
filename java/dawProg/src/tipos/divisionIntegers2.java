package tipos;

public class divisionIntegers2 {
	public static void main(String[] args) {
		float valor;

		// 4 / 3 = 1.333333...
		valor = 4 / 3; // integer división => 1 
		
		System.out.println(valor); // int 1 a float => 1.0
		// @formatter:off
		System.out.println(
					((Object)(valor))
					.getClass()
					.getSimpleName()); // float - línea 6
		// @formatter:on
		
		// Solución
		valor = 4 / 3f; // float división
		System.out.println(valor); // 1.3333334
		
		double valorDouble = 4 / 3d;   // double división
		System.out.println(valorDouble); // prints 1.0


	}
}
