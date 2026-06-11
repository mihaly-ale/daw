package arrays;

import java.util.Arrays;

public class _sort {

	public static void main(String[] args) {
		int[] iNumeros = { 15, 8, 13, 13 };
		System.out.println("iNumeros no ordenada => " + Arrays.toString(iNumeros));
		Arrays.sort(iNumeros);
		System.out.println("\n\"Arrays.sort(int[] a)\"\n");
		System.out.println("iNumeros ordenada => " + Arrays.toString(iNumeros));
	}

}
