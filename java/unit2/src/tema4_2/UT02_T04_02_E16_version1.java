package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E16_version1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float total;
		int bill500 = 0, bill200 = 0, bill100 = 0, bill50 = 0, bill20 = 0, bill10 = 0, bill5 = 0, mon2 = 0, mon1 = 0,
				cent50 = 0, cent20 = 0, cent10 = 0, cent5 = 0, cent2 = 0, cent1 = 0;

		System.out.println("Introduce la cantidad de euros: ");
		total = sc.nextFloat();

		do {
			if ((total / 500) >= 1) {
				bill500 += total / 500;
				total = total % 500;			
			}

			if ((total / 200) >= 1) {
				bill200 += total / 200;
				total = total % 200;
			}

			if ((total / 100) >= 1) {
				bill100 += total / 100;
				total = total % 100;
			}

			if ((total / 50) >= 1) {
				bill50 += total / 50;
				total = total % 50;
			}

			if ((total / 20) >= 1) {
				bill20 += total / 20;
				total = total % 20;
			}

			if ((total / 10) >= 1) {
				bill10 += total / 10;
				total = total % 10;
			}

			if ((total / 5) >= 1) {
				bill5 += total / 5;
				total = total % 5;
			}

			if ((total / 2) >= 1) {
				mon2 += total / 2;
				total = total % 2;
			}

			if ((total / 1) >= 1) {
				mon1 += total / 1;
				total = total % 1;
			}
		} while (total > 1);
		
		if (total < 1) {
			int totalCentimos;
			
			totalCentimos = (int)(total * 100);

			while (totalCentimos > 0) {
				if ((totalCentimos / 50) >= 1) {
					cent50 += totalCentimos / 50;
					totalCentimos = totalCentimos % 50;
				}
				if ((totalCentimos / 20) >= 1) {
					cent20 += totalCentimos / 20;
					totalCentimos = totalCentimos % 20;
				}
				if ((totalCentimos / 10) >= 1) {
					cent10 += totalCentimos / 10;
					totalCentimos = totalCentimos % 10;
				}
				if ((totalCentimos / 5) >= 1) {
					cent5 += totalCentimos / 5;
					totalCentimos = totalCentimos % 5;
				}
				if ((totalCentimos / 2) >= 1) {
					cent2 += totalCentimos / 2;
					totalCentimos = totalCentimos % 2;
				}
				if ((totalCentimos / 1) == 1) {
					cent1 = 1;
					totalCentimos = 0;
				}
			}
			System.out.println("fin");
		}

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
