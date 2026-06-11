package tema3;

public class UT02_T03_E05 {

	public static void main(String[] args) {

		int a = 10, b = 3, c;
		float x = 2.0F, y = 3.0F;
		
		y = x + a; // y(3.0f) = 2.0f + 10i => 12.0f 
		System.out.println("y: " + y);

		c = a / b; // c = 10i / 3i = 3i (dividir y truncar)
		System.out.println("c: " + c);

		c = a % b; // c(3i) = 10i % 3i => 1i 
		System.out.println("c: " + c);

		y = a / b; // 12f = 10 / 3 (divison con ints - dividir y truncar) => float 3 => 3.0
		System.out.println("y: " + y);

		c = (int) (x / y); // c(1i) = 2.0f / 3.0f => 0.6 => (int)0.66666666 => 0
		System.out.println("c: " + c);

		x = x / y; // x(2.0f) = 2.0f / 3.0f => 0.6666667
		System.out.println("x: " + x);

	}
}
