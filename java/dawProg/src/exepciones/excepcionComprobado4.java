package exepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excepcionComprobado4 {

	public static void main(String[] args) {

		try {
			System.out.println(leerNumero());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}// main

	public static int leerNumero() throws Exception{

		int numero = 20; // leer de teclado

		if (numero < 0 || numero > 10) {
			throw new Exception("Numero debe ser entre ..."); 
			// tratar error de dos maneras: try-catch (localmente) o throws(propaga)
		} else {
			return numero;			
		}
	}

}// class

