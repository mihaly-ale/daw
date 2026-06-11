package arrays;

import java.util.Arrays;

public class _copyOf {

	public static void main(String[] args) {
		int[] iNumeros3 = {3,8,-7,9,7,5};
		System.out.println("\"Arrays.copyOf(iNumeros, 5)\"\n" + " " + Arrays.toString(Arrays.copyOf(iNumeros3, 5)));
		System.out.println("\ncopyOf(int[] original, int newLength)");
		
		int[] arrayMenor = Arrays.copyOf(iNumeros3, 3);
		int[] arrayMayor = Arrays.copyOf(iNumeros3, 10);
		int[] arrayMedio = Arrays.copyOfRange(iNumeros3, 2,4);
		System.out.println("\narrayMenor " + Arrays.toString(arrayMenor));
		System.out.println("arrayMedio " + Arrays.toString(arrayMedio));
		System.out.println("arrayMayor " + Arrays.toString(arrayMayor));
		System.out.println("\ncopyOfRange(int[] original, int from, int to)");
	}

}
