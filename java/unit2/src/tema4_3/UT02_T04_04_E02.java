package tema4_3;

import java.util.Random;
import java.util.Scanner;

public class UT02_T04_04_E02 {

	public static void main(String[] args) {
		String chars = "*-=.|@";
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int numLineas;

		do {
			System.out.print("Líneas (10-20): ");
			numLineas = scan.nextInt();
		} while (numLineas < 10 || numLineas > 20);
		
		
		for (int i = 0; i < numLineas; i++) {
			int longLinea =  rnd.nextInt(10, 40);
			char car = chars.charAt(rnd.nextInt(0, chars.length()));
			
			for (int j = 0; j < longLinea; j++) {
				
				System.out.print(car);
			}
			System.out.println();
			
			
		}

	} //main

}

