package clases;

import java.math.BigInteger;

public class javaMathBigInteger {

	public static void main(String[] args) {

		// constantes de clase
		System.out.println(BigInteger.ONE);

		//declare new BigInt
		BigInteger NumBI = new BigInteger("0");
		String zero = "0";
		BigInteger NumBI2 = new BigInteger(zero);
		System.out.println("NumBI: " + NumBI + "\nNumBI2: " + NumBI2);

		// métodos
		System.out.println("\nMÉTODOS de clase BigInteger\n--------------------------");
		System.out.print("-> BigInteger add: ");
		System.out.println(NumBI.add(BigInteger.ONE));

		System.out.print("\n->BigInteger substract: ");
		BigInteger NumBI_2 = BigInteger.TWO;
		System.out.println(NumBI_2.subtract(NumBI));

		int x = 5, y = 3;
		System.out.println("\nsuma de dos enteros: " + (x + y));
		System.out.println("producto de dos enteros: " + (x * y));

		// convert tipo int a BigInteger
		System.out.println("\nint a BigInteger con \"BigInteger.valueOf(int)\"");
		BigInteger xBI = BigInteger.valueOf(x);
		BigInteger yBI = BigInteger.valueOf(y);
		System.out.print("\nBigInteger add:  \"yBI.add(xBI)\" = ");
		System.out.print(yBI.add(xBI));
		System.out.print("\nBigInteger multiply: \"yBI.multiply(xBI)\" = ");
		System.out.println(xBI.multiply(yBI));
	}

}
