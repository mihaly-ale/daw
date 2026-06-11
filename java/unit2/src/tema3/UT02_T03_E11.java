package tema3;

public class UT02_T03_E11 {
	public static void main(String[] args) {

		int x = 0, n = 10, i = 0;
		float r = 0, a = 15, b = 5, c = 11, d = 4;

		// System.out.println(n++); n = 10 (aumenta el valor, pero en esta línea no se almacena)
		n++;
		System.out.println("n: " + n); // 11 (el valor nuevo fue almacenado en la línea anterior)

		++n; // se aumenta y se sobreescribe el valor
		System.out.println("n: " + n); // 12

		x = ++n; // se aumenta el valor en esta línea, se almecena y se asigna a "x"
		System.out.println("x: " + x); // 13

		x = n++; // se guarda el valor de "n" en "x" antes de aumentarse, y se aumenta el valor de x con 1
		System.out.println("x: " + x); // x = 13 (!!! n = 14)

		i += 2; // i = i + 2 -> 0 + 2 => 2
		System.out.println("i: " + i);

		x *= n - 3; // x=x*(n-3)
		// x = 14*(14-3) = 13*11 = 130 + 13 = 143 
		System.out.println("x: " + x);

		n >>= 1; //  
		// n(14) binario 1110
		// 0111 = 4 + 2 + 1 = 7;
		System.out.println("n: " + n);

		r = a - b++ * --c - d / 2;
		// r = 15 - 5 * 10 - 4 /2 = 15 - 50 - 2 = -37
		System.out.println("r: " + r + " b: " + b + " c: " + c);
		// r: -37, b: 6.0, c: 10.0 
	}
}
