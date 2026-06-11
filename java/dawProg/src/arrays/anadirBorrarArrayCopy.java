package arrays;

import java.util.Arrays;

public class anadirBorrarArrayCopy {

	public static void main(String[] args) {
		String[] nombres = { "Ana", "Pedro", "Maria", "Andres" };
		String[] nombreSuprimido = new String[nombres.length - 1]; //longitud 3

		int indice = 2; // quiero borrar Maria

		System.arraycopy(nombres, indice, nombreSuprimido, 0, indice);
		// [Maria, Andres, null] - copiar 2 elementos (=indice) en un array de longitud 3 (nombres.length-1)
		System.out.println(Arrays.toString(nombreSuprimido));
		System.arraycopy(nombres, indice + 1, nombreSuprimido, indice, nombres.length - indice - 1);
		// from 3rd of nombres 1 (last parameter) element into the 2nd of nombreSuprimido 
		System.out.println(Arrays.toString(nombreSuprimido));
	}
}
