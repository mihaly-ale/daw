package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mensaje;

		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();

		if (numero >= -70) {
			if (numero <= -5) {
				mensaje = "Intervalo A contiene el número";
			} else {
				if (numero >= 12) {
					if (numero <= 200)
						mensaje = "Intervalo B contiene el número";
					else
						mensaje = "Ni intervalo A ni B contienen el número";
				} else
					mensaje = "Ni intervalo A ni B contiene el número";
			}

		} else
			mensaje = "Ni intervalo A ni B contienen el número";

		System.out.println(mensaje);

	}

}
