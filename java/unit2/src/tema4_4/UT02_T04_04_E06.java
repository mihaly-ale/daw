package tema4_4;

public class UT02_T04_04_E06 {

	public static void main(String[] args) {
		int numero = 10;

		for (int i = 0; i < numero; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	static int fibonacci(int num) {

		if (num == 0) {
			return 0;
		}

		if (num == 1) {
			return 1;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);

	}

}
