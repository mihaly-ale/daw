package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeroUno, numeroDos;

		System.out.println("Introduzca el primero número entero: ");
		numeroUno = sc.nextInt();
		System.out.println("Introduzca el segundo número entero: ");
		numeroDos = sc.nextInt();

		if (numeroUno > numeroDos) {
			System.out.println("Error en la entrada de datos");
		} else {
			for (;numeroUno <= numeroDos; numeroUno++) {
				System.out.print(numeroUno + " ");
			}
		}

	}
}