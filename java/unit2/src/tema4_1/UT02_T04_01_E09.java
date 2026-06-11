package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea la nota de primero módulo: ");
		int nota1 = sc.nextInt();
		System.out.println("Teclea la nota de segundo módulo: ");
		int nota2 = sc.nextInt();
		System.out.println("Teclea la nota de tercero módulo: ");
		int nota3 = sc.nextInt();

		int notaMedia;
		String mensaje;

		if (nota1 <= 5 || nota2 <= 5 || nota3 <= 5)
			notaMedia = 0;
		else
			notaMedia = (nota1 + nota2 + nota3) / 3;

		if (notaMedia >= 9)
			mensaje = "Sobresaliente";
		else if (notaMedia >= 7)
			mensaje = "Notable";
		else if (notaMedia >= 6)
			mensaje = "Bien";
		else if (notaMedia > 5)
			mensaje = "Suficiente";
		else
			mensaje = "Insuficiente";

		System.out.println("La nota media es " + notaMedia + ". Calificación: " + mensaje+ ".");

	}

}
