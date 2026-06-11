package exepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excepcionComprobado1 {

	// 1. - Propagación/Propagation
//	public static void main(String[] args) throws FileNotFoundException {
//		// soy consciente de que puede dar un error, pero no lo manejo
		// throws es una promesa, no una solución
//		FileInputStream fis = new FileInputStream("no_existe.txt");
//		// puede lanzar una excepción comprobada
//	}

	// 2. -  -- Manejo en el main/Handling
//	public static void main(String[] args) {
// 		ahora estamos tratando la excepción			
//		try {
//			FileInputStream fis = new FileInputStream("no_existe.txt");
//		} catch (FileNotFoundException e) {
//			System.out.println("Fichero no encontarado " + e.toString());
//		}

	public static void main(String[] args) {
		abrirFichero();
		System.out.println("Final programa ...");// la ejecución llega aquí aunque ocurra el error, porque el error está manejado
	} // main

	public static void abrirFichero() { // no propaga a main
		try {
			FileInputStream fis = new FileInputStream("no_existe.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado " + e.toString());
		}

	} // método

}// class