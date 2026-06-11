package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad = 0, curso, mayoresDe12 = 0, mujeres  = 0, hombres = 0, edadTotal = 0, edadMedia = 0;
		String sexo;
		boolean mujerEn4 = false;

		do {
			// entradas
			System.out.print("Edad? (0-100)");
			edad = sc.nextInt();
			
			if (edad < 0 || edad > 100) {
				System.out.println("sale del bucle incondicionalmente");
				break;	
			}

			System.out.print("Curso? (1, 2, 3, 4)");
			curso = sc.nextInt();

			System.out.print("Sexo? (H/M)");
			sexo = sc.next();
			System.out.println();

			// computación
			
			if (edad > 12 && sexo.equalsIgnoreCase("m") && curso == 3) {
				mayoresDe12++;
			}
			

			if (sexo.equalsIgnoreCase("m")) {
				mujeres++;
				if (curso == 4) {
					mujerEn4 = true;
				}
			} else
				hombres++;
			
			if (curso == 3) {
				edadTotal += edad;
				edadMedia = edadTotal / (mujeres  + hombres);				
			}

			

		} while (edad > 0 && edad < 100);
		
		System.out.println("end");
		
		System.out.println("Numero mujeres : " + mujeres + ". Numero hombres: " + hombres);
		System.out.println("Hay " + mayoresDe12 + " mujer(es) mayor(es) de 12 años en curso 3º.");
		System.out.println("La edad media de los alumnos de 3º es " + edadMedia + ".");
		System.out.println("Hay " + (mujerEn4 ? "alguna " : "ninguna ") + "mujer matriculada en 4º.");


	};
	
	
	

}
