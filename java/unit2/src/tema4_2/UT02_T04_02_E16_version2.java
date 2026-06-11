package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E16_version2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float entrada;
		int total;
		int bill500 = 0, bill200 = 0, bill100 = 0, bill50 = 0, bill20 = 0, bill10 = 0, bill5 = 0, mon2 = 0, mon1 = 0,
				cent50 = 0, cent20 = 0, cent10 = 0, cent5 = 0, cent2 = 0, cent1 = 0;

		System.out.println("Introduce la cantidad de euros: ");
		entrada = sc.nextFloat();

		total = (int)(entrada * 100);

		bill500 = total / 50000;
		total = total % 50000;
		
		bill200 = total / 20000;
		total = total % 20000;
		
		bill100 = total / 10000;
		total = total % 10000;
		
		bill50 = total / 5000;
		total = total % 5000;
		
		bill20 = total / 2000;
		total = total % 2000;
		
		bill10 = total / 1000;
		total = total % 1000;
		
		bill5 = total / 500;
		total = total % 500;
		
		mon2 = total / 200;
		total = total % 200;
		
		mon1 = total / 100;
		total = total % 100;
		
		cent50 = total / 50;
		total = total % 50;
		
		cent20 = total / 20;
		total = total % 20;
		
		cent10 = total / 10;
		total = total % 10;
		
		cent5 = total / 5;
		total = total % 5;
		
		cent2 = total / 2;
		total = total % 2;
		
		cent1 = total / 1;
		total = total % 1;


		System.out.println("--------");
		System.out.println("\nBilletas de 500€: " + bill500);
		System.out.println("Billetas de 200€: " + bill200);
		System.out.println("Billetas de 100€: " + bill100);
		System.out.println("Billetas de 50€: " + bill50);
		System.out.println("Billetas de 20€: " + bill20);
		System.out.println("Billetas de 10€: " + bill10);
		System.out.println("Billetas de 5€: " + bill5);
		System.out.println("Monedas de 2€: " + mon2);
		System.out.println("Monedas de 1€: " + mon1);
		System.out.println("Monedas de 50 céntimos: " + cent50);
		System.out.println("Monedas de 20 céntimos: " + cent20);
		System.out.println("Monedas de 10 céntimos: " + cent10);
		System.out.println("Monedas de 5 céntimos: " + cent5);
		System.out.println("Monedas de 2 céntimos: " + cent2);
		System.out.println("Monedas de 1 céntimo: " + cent1);

	}

}
