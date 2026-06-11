package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStreamReadWithResources {

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

			// NOTE: this is try with resources
			try (FileInputStream fis = new FileInputStream(validPath)) {
				System.out.println("Fujo abierto ...");

				int byteLeido = 0;
				int totalBytes = 0;
				int contador = 0;

				while ((byteLeido = fis.read()) != -1) {
					System.out.println(byteLeido);

					totalBytes += byteLeido;
					contador++;
				}
				System.out.println("total bytes: " + totalBytes);
				System.out.println("contador: " + contador);

			} catch (FileNotFoundException e) {
				System.out.println(e.toString());
			} catch (IOException e) { // IOException must be handled because read() can fail during I/O operations
				System.out.println(e.toString());
			}
		} else {
			System.err.println("Fichero no existe.");
		}

	}
}
