package tema5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TODO_UT02_T05_01_E7_ArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int examenCambiar = 0, notaCambiar;
		String alumno = "";

		ArrayList<String> nombres = new ArrayList(Arrays.asList("Ana", "Luis", "Sofia"));
		ArrayList<ArrayList<Integer>> notas = new ArrayList<>();
		notas.add(new ArrayList<>(Arrays.asList(8, 7, 9, 10, 6)));
		notas.add(new ArrayList<>(Arrays.asList(6, 5, 7, 8, 7)));
		notas.add(new ArrayList<>(Arrays.asList(9, 10, 8, 9, 10)));

		logNotas(notas, nombres);

		System.out.println("Alumno?");
		alumno = scan.next();
		alumno = Character.toUpperCase(alumno.charAt(0)) + alumno.substring(1).toLowerCase();

		int existeAlumno = comprobarEstudiante(nombres, alumno);

		if (existeAlumno == 1) {
			int indice = nombres.indexOf(alumno);

			ArrayList<Integer> notasAlumno = notas.get(indice);

			do {
				System.out.println("Examen?");
				examenCambiar = scan.nextInt();

				if (examenCambiar < 1 || examenCambiar > notasAlumno.size()) {
					System.out.println("Alumno solo tiene " + notasAlumno.size() + " examen(es).");
				}
			} while (examenCambiar < 1 || examenCambiar > notasAlumno.size());

			do {
				System.out.println("Nota?");
				notaCambiar = scan.nextInt();

				if (notaCambiar < 1 || notaCambiar > 10) {
					System.out.println("Nota inválida. Debe ser entre 1 y 10.");
				} else {
					notasAlumno.set(examenCambiar - 1, notaCambiar);
				}
			} while (notaCambiar < 1 || notaCambiar > 10);
			
		} else {
			System.out.println("Alumno no existe.");
			return;
		}

		System.out.println("Notas actualizadas" + notas);

	} // main

	static void logNotas(ArrayList<ArrayList<Integer>> notas, ArrayList<String> nombres) {
		for (int i = 0; i < nombres.size(); i++) {
			ArrayList<Integer> notasAlumno = notas.get(i);
			int sumaNotas = 0;
			double promedio = 0;

			System.out.print(nombres.get(i) + "--> Notas: ");

			for (int nota : notasAlumno) {
				sumaNotas += nota;
				System.out.print(nota + " ");
			}

			promedio = (double) sumaNotas / notasAlumno.size();
			System.out.println("\t| Promedio: " + promedio);
		} // for
	} // logNotas

	static int comprobarEstudiante(ArrayList<String> nombres, String alumno) {
		if (nombres.contains(alumno)) {
			return 1;
		} else
			return 0;
	} // comprobarNotas

	static void cambiarNota(ArrayList<Integer> notasAlumno, int examen, int nota) {
		notasAlumno.set(examen, nota);
	}
} // class
