package tema2;

import java.util.Scanner;

class UT02_T02_E01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, n, x, e, y, resultado;

		System.out.print("Teclea número a: ");
		a = sc.nextDouble();
		System.out.print("Teclea número b: ");
		b = sc.nextDouble();
		System.out.print("Teclea número n: ");
		n = sc.nextDouble();
		System.out.print("Teclea número x: ");
		x = sc.nextDouble();
		System.out.print("Teclea número e: ");
		e = sc.nextDouble();
		System.out.print("Teclea número y: ");
		y = sc.nextDouble();

		resultado = (a * x + b * y) * n;

		System.out.println("El resultado es: " + resultado);
	}
}