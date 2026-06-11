package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entero: ");
		int numero = sc.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miércoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sábado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "Dato na válido";
		}
		System.out.println(dia);

	}

}
