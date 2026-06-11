package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import filechecks.fileValidator;

public class fileInputStreamErrorHandling {

	public static void main(String[] args) {

		String imagePathSchool = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "dawProg" + File.separator + "src" + File.separator + "stream" + File.separator + "resources"
				+ File.separator + "AzulJava.jpg";

		String imagePathHome = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "dawProg" + File.separator + "src"
				+ File.separator + "stream" + File.separator + "resources" + File.separator + "AzulJava.jpg";

		// NOTE: checking if at home or school, and setting correct path
		String validPath;
		
		if (filechecks.fileValidator.resolveExistingPath(imagePathHome)) {
			validPath = imagePathHome;
		} else {
			validPath = imagePathSchool;
		}
		
		// System.out.println(filechecks.fileValidator.resolveFilePath(validPath));

		///
		if (!(filechecks.fileValidator.resolveFilePath(validPath).equals(null))) {
			/// ABRIR Y CERRAR el flujo manualmente (tedioso) - SOLUTION: ↓↓↓ -linea 56
			FileInputStream fis = null;
			try {
				// FileInputStream fis = new FileInputStream(imagePathSchool);
				// puede lanzar un excepetion SOLUTION: ↓↓↓
				/// sacar afuera para no dar exception

				fis = new FileInputStream(validPath);
				System.out.println("Flujo abierto ...");
			} catch (FileNotFoundException e) {
				System.out.println(e.toString());
			} finally { // finally siempre se ejecuta
				try {
					// fis.close(); // NOTE: solo se puede llamar si el flujo se creó correctamente;
					// de ​​lo contrario, no hay ningún recurso que cerrar.
					// System.out.println("Flujo está cerrado ...");
					if (fis != null) {
						fis.close();
						System.out.println("Cerrando flujo ...");
					} else {
						System.out.println("No es necesario cerrar el flujo: nunca se fue creado.");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.err.println("Fichero no existe.");
		}

	}
}
