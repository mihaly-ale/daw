package tema5_1;

import java.util.Arrays;
import java.util.Scanner;

public class UT02_T05_01_E06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String[] nombres = { "Ana", "Luis", "Sofia" };
		int[][] notas = { { 8, 7, 9, 10, 6 }, { 6, 5, 7, 8, 7, }, { 9, 10, 8, 9, 10 } };

		logNotas(nombres, notas);

		System.out.print("Nombre de usuario: ");
		nombre = sc.next();
		nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);

		int indiceAlumno = comprobarEstudiante(nombres, nombre);

		if (indiceAlumno != -1) {
			int examen, nota;
			int[] notasAlumno = notas[indiceAlumno];

			do {
				System.out.print("Examen (1-5): ");
				examen = sc.nextInt();
				if (examen < 1 || examen > notasAlumno.length) {
					System.out.println("Número de examen inválido. Debe ser entre 1 y " + (notasAlumno.length) + " .");
				}
			} while (examen < 1 || examen > 5);

			do {
				System.out.print("Nota (1-10): ");
				nota = sc.nextInt();
				if (nota < 1 || nota > 10) {
					System.out.println("Nota inválida. Debe ser entre 1 y 10.");
				} else {
					cambiarNota(notasAlumno, examen, nota);
					System.out.println("Notas actualizadas de alumno " + nombre + " " + Arrays.toString(notasAlumno));
				}
			} while (nota < 1 || nota > 10);

		} else {
			System.out.println("El alumno no existe.");
			return;
		}

		System.out.println("int[][] notas actualizadas " + Arrays.deepToString(notas));

	} // main

	static void logNotas(String[] nombres, int[][] notas) {
		for (int i = 0; i < nombres.length; i++) { // obtener índices

			float promedio = 0, sumNotas = 0;
			System.out.print(nombres[i] + " --> Notas: ");

			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
				sumNotas += notas[i][j];
				promedio = sumNotas / notas[i].length;
			} // final j

			System.out.print(" \t | Promedio: " + promedio + "\n");
		} // final i
	} // final logNotas

	static int comprobarEstudiante(String[] nombres, String nombre) {

		for (int i = 0; i < nombres.length; i++) {
			if (nombre.equals(nombres[i])) {
				return i;
			} 
		}
		return -1;
	} // final comprobarEstudiante

	static void cambiarNota(int[] notasAlumno, int examen, int nota) {
		notasAlumno[examen - 1] = nota;
	}
}

// no es necesario recorrer el array tantas vaces si el longitud es el mismo
/*
 * static void logNotas(String[] nombres, int[][] notas) { for (int i = 0; i <
 * nombres.length; i++) { // Ana, Luis ... for (int j = 0; j < notas.length;
 * j++) { // {8,7,9 ...}, {} ... if (i == j) { float promedio = 0, sumNotas = 0;
 * System.out.print(nombres[i] + " --> Notas: "); for (int k = 0; k <
 * notas[j].length; k++) { System.out.print(notas[j][k] + " "); sumNotas +=
 * notas[j][k]; promedio = sumNotas / notas[j].length; } // final k
 * System.out.print(" \t | Promedio: " + promedio + "\n"); } // final if } //
 * final j } // final k
 */