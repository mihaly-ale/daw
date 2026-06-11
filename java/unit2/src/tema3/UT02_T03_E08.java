package tema3;

public class UT02_T03_E08 {
	public static void main(String[] args) {
		int x = 12, y = 2;
		boolean resultado;

		resultado = x == y; // 12 es igual a 10 => false 
		System.out.println(resultado);

		resultado = x > y; // 12 es mayor que 2 => true 
		System.out.println(resultado);

		resultado = x < y; // 12 es menor que 2 => false
		System.out.println(resultado);

		resultado = x != y; // 12 no es igual a 2 => true
		System.out.println(resultado);

		resultado = x <= y; // 12 es menor o igual a 2 => false
		System.out.println(resultado);

		resultado = x >= y; // 12 es mayor o igual a 2 => true
		System.out.println(resultado);
	}
}
