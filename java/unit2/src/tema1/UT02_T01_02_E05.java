package tema1;

import java.util.Scanner;

public class UT02_T01_02_E05 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declarar variables
		double numeroUno, numeroDos, numeroTres, numeroCuatro, suma, promedio;

		// leer entradas
		System.out.print("Escribe el primer número: ");
		numeroUno = sc.nextDouble();
		System.out.print("Escribe el segundo número: ");
		numeroDos = sc.nextDouble();
		System.out.print("Escribe el tercero número: ");
		numeroTres = sc.nextDouble();
		System.out.print("Escribe el cuarto número: ");
		numeroCuatro = sc.nextDouble();

		// computación
		suma = numeroUno + numeroDos + numeroTres + numeroCuatro;
		promedio = (numeroUno + numeroDos + numeroTres + numeroCuatro) / 4;

		// mostrar resultados
		System.out.println("La suma de los numeros: " + suma);
		System.out.println("El promedio de los numeros: " + promedio);

	}
}