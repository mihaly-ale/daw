package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeroFact;
		int factorial = 1;

		System.out.println("Introduce el número del que quieres el factorial: ");
		numeroFact = sc.nextInt();

		for (int i = numeroFact; i >= 1; i--)
			factorial *= i;

		System.out.println("El factorial de " + numeroFact + " es " + factorial + ".");

	}

}
