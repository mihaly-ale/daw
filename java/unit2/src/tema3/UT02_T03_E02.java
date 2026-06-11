package tema3;

public class UT02_T03_E02 {
	public static void main(String[] args) {
		// 147

		int a = 147;

		// 147 => 10010011 => cada tres: 223 => con prefix 0
		int b = 0223;

		// 10010011 => cada cuatro: 93 => con prefix 0x
		int c = 0x93;

		System.out.println("Decimal:" + a);
		System.out.println("Decimal expresado en octal:" + b);
		System.out.println("Decimal expresado en hexadecimal:" + c);

	}
}
