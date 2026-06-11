package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la edad de Juan: ");
		int edadJuan = scanner.nextInt();
		System.out.println("Introduce la edad de Ana: ");
		int edadAna = scanner.nextInt();

		if (edadJuan < edadAna)
			System.out.println("Juan es más joven que Ana.");
		else {
			if (edadJuan > edadAna)
				System.out.println("Juan no es más joven que Ana.");
			else
				System.out.println("Juan y Ana son de la misma edad.");
			scanner.close();
		}

	}
}
