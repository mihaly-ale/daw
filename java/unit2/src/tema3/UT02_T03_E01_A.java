package tema3;

public class UT02_T03_E01_A {
	public static void main(String[] args) {
		// 100/7 = 14.285714285714285714285714285714

		byte b = 100 / 7; // => 100 y 7 tipo int - división normal, corta dígitos decimales => 14, dentro
							// del rango, no error
		short s = 100 / 7; // => 100 y 7 tipo int - división normal, corta dígitos decimales => 14, dentro
							// del rango, no error
		int i = 100 / 7; // => 100 y 7 tipo int - división normal, corta dígitos decimales => 14, dentro
							// del rango, no error
		long l = 100 / 7L; // => 100 es int, 7L es long, 100 => long, división normal
							// corta dígitos decimales => 14, dentro del rango, no error
		float f = 100 / 7F; // => 100 es int, 7F es float, 100 => float, división con decimales, corta unos
							// dígitos, dentro del rango, no error
		double d = 100 / 7D; // => 100 es int, 7D es double, 100 => double, división con decimales, corta
								// unos dígitos, dentro del rango, no error

		System.out.println("b: " + b);
		System.out.println("s: " + s);
		System.out.println("i: " + i);
		System.out.println("l: " + l);
		System.out.println("f: " + f);
		System.out.println("d: " + d);

		// byte b1= 387/3; // 387/3 = 129, fuera del rango => error
		// System.out.println(b1);
		
		// Se puede resolver con cast
		byte b2 = (byte) (387 / 3);
		System.out.println("b2:" + b2); // -127 (256-129 = 127) 
		short s1 = 387 / 3; // 387/3 = 129, dentro del rango
		System.out.println("s1: " + s1);

	}

}
