package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes, ano, numeroDeDias;
		boolean esBisiesto;		
		
		System.out.println("Introduzca el mes(1-12): ");
		mes = sc.nextInt();
		System.out.print("Introduzca el año: ");
		ano = sc.nextInt();
		
		// esBisiesto = ((ano/4 == 0) && (ano/100 == 0)) || (ano/400 == 0);

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			numeroDeDias = 31;
			System.out.println("El mes " + mes + " del año " + ano + " tiene "+ numeroDeDias + " días.");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
			numeroDeDias = 30;
			System.out.println("El mes " + mes + " del año " + ano + " tiene "+ numeroDeDias + " días.");
		case 2:
			numeroDeDias = (esBisiesto = ((ano/4 == 0) && (ano/100 == 0)) || (ano/400 == 0)) ? 28 : 29 ;
			System.out.println("El mes " + mes + " del año " + ano + " tiene "+ numeroDeDias + " días.");
		}
		
		
	}

}
