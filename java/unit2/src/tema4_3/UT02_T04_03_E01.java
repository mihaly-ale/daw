package tema4_3;

import java.util.Scanner;

public class UT02_T04_03_E01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double num1, num2, resultado = 0;
		int operacion;

		System.out.print("Primer numero: ");
		num1 = scan.nextDouble();
		System.out.print("Segundo numero: ");
		num2 = scan.nextDouble();

		System.out.println("\n1. sumar\n2. restar\n3. multiplicar\n4. dividir\n5. salir\n ");
		do {
			System.out.println("Seleccione la operación deseada: ");
			operacion = scan.nextInt();
		} while (operacion != 1 && operacion != 2 && operacion != 3 && operacion != 4 && operacion != 5);

		switch (operacion) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
		case 5:
			System.out.println("El programa se cierra.");
			return;
		}

		System.out.println("Resultado: " + resultado);

	}
}
