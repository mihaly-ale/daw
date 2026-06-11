package arrays;

import java.util.Arrays;

public class _equals {

	public static void main(String[] args) {
		int[] iNumeros1 = { 15, 8, 13, 13 };
		int[] iNumeros2 = { 15, 8, 13, 13 };
		int[] iNumeros3 = { 51, 8, 13, 13 };
		
	System.out.println("\"Arrays.equals(int[] a, int[] b)\"");
		
		System.out.println(" ?Iguales¿ " + Arrays.equals(iNumeros1,iNumeros2));
		System.out.println(" ?Iguales¿ " + Arrays.equals(iNumeros1,iNumeros3));
	}

}
