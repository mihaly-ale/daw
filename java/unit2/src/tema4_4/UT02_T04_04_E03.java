package tema4_4;

public class UT02_T04_04_E03 {

	public static void main(String[] args) {
		int dividiendo = 4;
		int divisor = 3;

		int cociente = dividir(dividiendo, divisor);
		System.out.println(cociente);

	}

	static int dividir(int dividiendo, int divisor) {

		if (dividiendo < divisor) { // 15 < 3
			return 0;
		} else {
			return 1 + dividir(dividiendo - divisor, divisor);
			// dividir(15-3,3); ...
		}

	}

}
