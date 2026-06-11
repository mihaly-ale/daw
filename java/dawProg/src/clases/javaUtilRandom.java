package clases;

import java.util.Random;

public class javaUtilRandom {

	public static void main(String[] args) {

		Random rnd = new Random();
		// he creado la referencia del objeto (el sitio ne la memoría)

		System.out.println("numero entero aleatorio creado con la clase Random: " + rnd.nextInt());
		System.out.println("numeros enteros aleatorios (con limites) creado con la clase Random (1-7): " + rnd.nextInt(1,7) + ", " +  rnd.nextInt(1,7) + ", " + rnd.nextInt(1,7));

	}

}
