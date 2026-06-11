package tema5_1;

import java.util.Random;
import java.util.Scanner;

public class UT02_T05_01_E01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[10];

//		do {
//			
//		} while (intArray[9] == 0);

		for (int i = 0; i < intArray.length; i++) {
			System.out.print("Introduce un numero entero: ");
			intArray[i] = sc.nextInt();
		}
		
		for (Integer entero: intArray)
		System.out.print(entero + " ");
		
		System.out.println();
		for (int i = intArray.length-1; i >= 0; i-- ) {
			System.out.print(intArray[i]+ " ");
		}
		
		
		System.out.println("\n");
		System.out.println("numeros aleatorios");
		for (int i = 0; i < intArray.length; i++) {
			Random rnd = new Random();
			intArray[i] = rnd.nextInt(1, 100);
		}
		
		for (Integer entero: intArray)
			System.out.print(entero + " ");
			
			System.out.println();
			for (int i = intArray.length-1; i >= 0; i-- ) {
				System.out.print(intArray[i]+ " ");
			}
	}

}
