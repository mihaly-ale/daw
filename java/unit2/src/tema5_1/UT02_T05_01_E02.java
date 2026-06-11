package tema5_1;

import java.util.Scanner;

public class UT02_T05_01_E02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] notasArray = new int[4];
		float sumNotas = 0f;
		int aprobados = 0, notaConsultar, alumnoConNotaConsultar = 0;

		for (int i = 0; i < notasArray.length; i++) {
			System.out.print("Introduce nota " + (i + 1) + ": ");
			try {
				notasArray[i] = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada no válida. Reinicia el programa.");
				scan.nextLine(); // limpiar scanner
				return;
			}
		}

		for (int nota : notasArray) {
			sumNotas += nota;
			if (nota >= 5)
				aprobados++;
		}

		System.out.println("Nota media d los alumnos: " + (sumNotas / notasArray.length));
		System.out.println(
				aprobados + " alumno(s) ha(n) aprobado. " + aprobados * 100 / notasArray.length + "% ha aprobado.");

		System.out.print("\nIndica la nota a consultar: ");
		notaConsultar = scan.nextInt();

		for (int i = 0; i < notasArray.length; i++) {
			alumnoConNotaConsultar += (notasArray[i] == notaConsultar) ? 1 : 0; // ?
		}

		System.out.println(alumnoConNotaConsultar + " tiene(n) la nota " + notaConsultar
				+ ". Porcentaje de alumno(s) con la nota " +notaConsultar + ": "+  alumnoConNotaConsultar * 100 / notasArray.length + "%.");
	}

}
