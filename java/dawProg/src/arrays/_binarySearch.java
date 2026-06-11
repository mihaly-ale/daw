package arrays;

import java.util.Arrays;

public class _binarySearch {

	public static void main(String[] args) {

		int[] iNumeros = { 51, 8, 13, 13 };
		System.out.println("\"Arrays.binarySearch(51)\" => " + Arrays.binarySearch(iNumeros, 51));
		System.out.println("El array debe estar ordenda par realizar un sort.\n");
		Arrays.sort(iNumeros);

		System.out.println(Arrays.toString(iNumeros));
		System.out.println("\"Arrays.binarySearch(13)\" => " + Arrays.binarySearch(iNumeros, 13));
		System.out.println("\"Arrays.binarySearch(51)\" => " + Arrays.binarySearch(iNumeros, 51));
		System.out.println("\"Arrays.binarySearch(60)\" => " + Arrays.binarySearch(iNumeros, 60));
		// return -(insertion_point) - 1
		// insertion point: la posición, en la cual el número se insertaría
	    //   = -(4) - 1
	    //	       = -5
		System.out.println("\"Arrays.binarySearch(70)\" => " + Arrays.binarySearch(iNumeros, 70));
		System.out.println("\"Arrays.binarySearch(4)\" => " + Arrays.binarySearch(iNumeros, 4));

	}

}
