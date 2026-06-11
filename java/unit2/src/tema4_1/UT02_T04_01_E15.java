package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = "";
		int num1=0;
		int num2=0;
		

		System.out.println("Elige uno de los opciones:\n Suma\n Resta\n Multiplicación\n División\n");
		System.out.println("Elige una opción seleccionando la letra inicial.");
		System.out.print("Opción: ");
		entrada = sc.next();
		char inicial = entrada.toLowerCase().charAt(0);

		System.out.println("Introduzca el primero número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		// if para 0
		num2 = sc.nextInt();
		
		switch (inicial) {
		case 'd':
			
			if (num2 == 0) System.out.println("Error: No se puede dividir con " + num2);
			else System.out.print("Division: " + (num1 / (float)num2));			
			break;
		case 'm':
			System.out.print("Multiplicación:" + num1  * num2);
			break;
		case 'r':
			System.out.print("Resta:" + (num1 - num2));
			break;
		case 's':
			System.out.print("Suma:" + (num1 + num2));
			break;
		}

	}

}
//Programa que visualice un menú de opciones: Suma, Resta, Multiplicación y División. El programa pedirá teclear un carácter si es 'S' ejecutará la suma, 'R' la resta, 'M' la multiplicación y 'D' la división de dos números enteros pedidos por teclado (el resultado de la división podrá tener decimales). Los caracteres introducidos se podrán teclear en mayúsculas o minúsculas. 