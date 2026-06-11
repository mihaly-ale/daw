package exepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excepcionComprobado2 {

	public static void main(String[] args) {
		
//		// ***********
//		abrirFichero();
		// Error: Unresolved compilation problem: ==> debe manejar con try-catch o propaga más arriba con un throws 
//		// Unhandled exception type FileNotFoundException
//		//********
		
		try {
			abrirFichero();
		} catch (FileNotFoundException e) {
			String localizedMessage = e.getLocalizedMessage();
			System.out.println(localizedMessage);
		}
		System.out.println("Final programa ...");

	} // main

	// FileNotFoundException es una excepción comprobada (checked), Java obliga a manejarla o propagarla
	public static void abrirFichero() throws FileNotFoundException { // propaga a main
		// no manejo la excepción aqui
		// se propaga (se sube) a quien llama el método (en este caso main)
		FileInputStream fis = new FileInputStream("no_existe.txt");
		System.out.println("method final"); // se ejecuta solo si no hay excepción
	}

}// class