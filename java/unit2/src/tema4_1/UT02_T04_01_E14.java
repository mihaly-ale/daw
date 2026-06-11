package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entero: ");
		int nota = sc.nextInt();
		String mensaje;
		
		switch (nota)  {
		case 0:
		case 1:
		case 2:
			mensaje = "Muy deficiente";
			break;
		case 3:
		case 4:
			mensaje = "Insuficiente";
			break;
		case 5:
			mensaje = "Suficiente";
			break;
		case 6:
			mensaje = "Bien";
			break;
		case 7:
		case 8:
			mensaje = "Notable";
			break;
		case 9:
		case 10:
			mensaje = "Sobresaliente";
			break;
		default:
			mensaje = "Nota inválida";
		}
		
		System.out.println(mensaje);

	}

}
