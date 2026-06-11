package tema4_4;

import java.math.BigInteger;

public class UT02_T04_04_E04 {

	public static void main(String[] args) {
		int num = 3;
		int fact = factorial(num);
		System.out.println("factorial de int: " + num);
		System.out.println(fact);

		int numBI = 100;
		BigInteger factBI = factorialBigInt(numBI);
		System.out.println("\nfactorial de BigInteger: " + numBI);
		System.out.println(factBI);
	}

	public static int factorial(int num) {

		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	} // final factorial

	public static BigInteger factorialBigInt(int num) {
		BigInteger numBI = BigInteger.valueOf(num);
		
		if (numBI == BigInteger.valueOf(0)) {
			return BigInteger.valueOf(1); 
		} else {
			return numBI.multiply(factorialBigInt(num - 1));
		}
	}

}
