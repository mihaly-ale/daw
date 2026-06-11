package tema3;

public class UT02_T03_E07 {
	public static void main(String[] args) {

		int x = 10, y = 0;
		double z = 10.98;
		boolean r;

		r = x == y; // asignar el resultado de comparación de dos ints => 10 =/= 0 => false
		System.out.println("r: " + r);

		r = x > y; // 10 > 0 => true
		System.out.println("r: " + r);

		r = x != y; // 10 no es igual a 0 ? => true
		System.out.println("r: " + r);

		// De distinto tipo
		r = x == z; // 10 == 10.98 => false 
		System.out.println("r: " + r);

	}
}

// = operador de asignación
// == operador de comprobación