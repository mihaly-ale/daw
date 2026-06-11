package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_e14 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int numero, cantidadDeDigitos;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce un numero entero:");
			numero = sc.nextInt();
			
			if (numero == 0) {
				cantidadDeDigitos = 1;
			} else {
				cantidadDeDigitos = 0;
				numero = Math.abs(numero);
				
				while (numero > 0 ) {
					numero = numero/ 10;
					cantidadDeDigitos++;
				}
			}
			
			System.out.println("El número tiene " + cantidadDeDigitos + " dígitos.");
		}

}
