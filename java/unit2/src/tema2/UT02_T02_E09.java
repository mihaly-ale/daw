package tema2;

import java.util.Scanner;

class UT02_T02_E09 {
	public static void main(String[] args) {

		// instanciación
		Scanner sc = new Scanner(System.in);

		// definir variables
		int numero1;
		int numero2;
		int numero3;
		int numeroMenor;
		int numeroMayor;
		int suma;

		// pedir numeros
		System.out.print("Teclea el primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Teclea el segundo número: ");
		numero2 = sc.nextInt();
		System.out.print("Teclea el tercero número: ");
		numero3 = sc.nextInt();
		
		// computacion
		numeroMenor = Math.min(numero1, (Math.min(numero2, numero3)));
		numeroMayor = Math.max(numero1, (Math.max(numero2, numero3)));
		suma = (numero1 + numero2 + numero3);


		//Mostra resultado
		System.out.println("El numero menor de los tres: " + numeroMenor);
		System.out.println("El numero mayor de los tres: " + numeroMayor);
		System.out.println("Los numeros ordenados: " + numeroMenor + " " + (suma - numeroMenor - numeroMayor) + " " + numeroMayor);
		System.out.println("Los numeros ordenados: " + numeroMenor  + (suma - numeroMenor - numeroMayor) + numeroMayor);
	}
}