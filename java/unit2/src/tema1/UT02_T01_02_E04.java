package tema1;

import java.util.Scanner;

public class UT02_T01_02_E04 {
	public static void main(String[] args) {
		// instanciación
		Scanner sc = new Scanner(System.in);

		// declarar variables
		double numeroUno, numeroDos, numeroTres, numeroCuatro, suma, producto;

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
		suma = numeroUno + numeroDos;
		producto = numeroTres * numeroCuatro;

		// mostrar resultados
		System.out.println("La suma de los dos primeros numeros: " + suma);
		System.out.println("El producto de los dos segundos numeros: " + producto);

	}
}