package arrays;

import java.util.Arrays;

public class _fill {

	public static void main(String[] args) {
		int[] iNumeros = { 3, 4, -5, 6 };
		System.out.println("\"Arrays.toString()\" => " + Arrays.toString(iNumeros));

		Arrays.fill(iNumeros, 15);
		System.out.println("\"Arrays.fill(iNumeros, 15)\" => " + Arrays.toString(iNumeros));
		
		Arrays.fill(iNumeros, 1, 3, 8);
		System.out.println("\"Arrays.fill(iNumeros, 1, 3, 8)\" => " + Arrays.toString(iNumeros));
		System.out.println("\nargs:\nfill(int[] a, int fromIndex, int toIndex, int val)");
		
		Arrays.fill(iNumeros, 2, iNumeros.length, 13);
		System.out.println("\n\"Arrays.fill(iNumeros, 2, iNumeros.length, 13)\" => " + Arrays.toString(iNumeros));

	}

}
