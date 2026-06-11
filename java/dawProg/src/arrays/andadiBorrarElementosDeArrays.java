package arrays;

import java.util.Arrays;

public class andadiBorrarElementosDeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = { "Ana", "Pedro", "Maria", "Andres" };
		String[] nombreSuprimido = new String[nombres.length - 1];

		int j = 0; // Para controlar nimbreSuprimido
		for (int i = 0; i < nombres.length; i++) {
			if (!nombres[i].equals("Maria")) {
				nombreSuprimido[j] = nombres[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(nombreSuprimido));
	}

}
