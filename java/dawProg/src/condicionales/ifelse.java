package condicionales;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Teclea el número primero: ");
		int num = scanner.nextInt();
		char intervalo;

		// Solución con if else
		if (num > 50)
			intervalo = 'C';
		else if (num > 30)
			intervalo = 'B';
		else
			intervalo = 'A';

		System.out.println("El número primero es " + intervalo);

		System.out.print("Teclea el número segundo: ");
		int num2 = scanner.nextInt();

		// Solución con if anidada
		if (num2 > 30) {
			if (num2 > 50)
				intervalo = 'C';
			else
				intervalo = 'B';
		} else
			intervalo = 'A';

		System.out.println("El número segundo es " + intervalo);
	}
}
