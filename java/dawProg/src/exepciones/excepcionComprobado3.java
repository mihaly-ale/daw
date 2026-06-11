package exepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excepcionComprobado3 {

	public static void main(String[] args) // throws Exception
	{

		int numero = 20; // leer òr teclado

		if (numero < 0 || numero > 10) {
			System.out.println("Dato no válido.");
			// dado que el numero es erroneo, puede lanzar un excepción
			
//			 throw new IllegalArgumentException("Numero debe ser entre 0 y 10"); // esto es suficiente por si mismo, porque es un excepción no comprobado 
			 
			try {
				throw new Exception("Numero debe ser entre 0 y 10"); // Exception in thread "main" java.lang.Error:
																		// Unresolved compilation problem:
				// Excpetion cannot be resolved to a type ==> throws
			} catch (Exception e) {

				System.out.println("Error: " + e.getMessage());

			}
			System.out.println("Programa continúa...");

//			throw new Exception("Numero debe ser entre 0 y 10");
			// ERROR: Unresolved compilation problem: ==> throws Exception in main
			// Unhandled exception type Exception

		}

	}

}// class