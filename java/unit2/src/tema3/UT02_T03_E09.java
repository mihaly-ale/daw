package tema3;

public class UT02_T03_E09 {
	public static void main(String[] args) {

		int p = 10, q = 0;
		boolean r;

		r = p != 0 && q != 0;
		// p = 10 no es igual a 0 => true
		// q no es igual a 0 => false (q es 0)
		// true AND false => false
		System.out.println("r: " + r);

		r = p != 0 || q > 0; 
		// true OR false => true
		System.out.println("r: " + r);

		r = q < p && p <= 10; 
		// r = 0 < 10 => true
		// 10 <= 10 => true
		// true AND true => true
		System.out.println("r: " + r);

		r = !r;
		// r = !true => false
		System.out.println("r: " + r);

	}
}
