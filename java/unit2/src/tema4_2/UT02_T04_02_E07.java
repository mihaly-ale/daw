package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float nota;
		int totalAlumnos = 0;
		float sumaNotas = 0;
		int aprobados = 0;
		int suspendidos = 0;
		boolean existeNotaExcelente = false;
		
		System.out.println("¿Nota?");
		nota = sc.nextFloat();
		
		while  (nota >= 0 && nota <= 10) {
			totalAlumnos++;
			sumaNotas += nota;
			
			if (nota >= 5) {
				aprobados++;
			} else suspendidos++;
			
			if(nota == 8.5 ) {
				existeNotaExcelente = true;
			}		
			
			System.out.println("¿Nota?");
			nota = sc.nextFloat();
			
		}
		System.out.println("Total alumnos: " + totalAlumnos);
		System.out.println("Nota media: " + (float)(sumaNotas/totalAlumnos));
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Suspendidos: " + suspendidos);
		String mensaje = existeNotaExcelente ? ("Algún") : ("Ningún");
		System.out.println(mensaje+ " alumno tuvo un 8.5.");

	}

}
