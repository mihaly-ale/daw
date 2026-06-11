package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import filechecks.fileValidator;

public class fileOutputStream {

	public static void main(String[] args) {

		String rutaDirSchool = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "dawProg" + File.separator + "src" + File.separator + "stream" + File.separator + "creados";

		String rutaDirHome = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "dawProg" + File.separator + "src"
				+ File.separator + "stream" + File.separator + "creados";

		String fichero = "misDatosFOS.dat";

		// NOTE: checking if at home or school, and setting correct path
		String validPath;

		if (filechecks.fileValidator.resolveExistingPath(rutaDirHome)) {
			validPath = rutaDirHome + File.separator + fichero;
		} else {
			validPath = rutaDirSchool + File.separator + fichero;
		}

		System.out.println(validPath);
		System.out.println("fichero existe? " + filechecks.fileValidator.resolveFilePath(validPath));

		if (filechecks.fileValidator.resolveFilePath(validPath) == null) {
			try {
				new File(validPath).createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// NOTE: si fichero no existe, se crea o si fichero existe sobrescribe el
		// contenido
		try (FileOutputStream fos = new FileOutputStream(validPath)) {
			System.out.println("Escribiendo en \"" + fichero + "\" ...");
			/// 1
			/*
			 * fos.write(72); fos.write(111); fos.write(108); fos.write(97);
			 */

			/// 2
			String texto = "HOLA";
			byte[] datos = texto.getBytes();
			fos.write(datos);

			fos.write('\n');
			fos.write(437);
			// 00000001 10110101 (256(no)-128-X-32-16-X-4-X-1)
			// solos until 181 (suma de 128+32 ...)
			// NOTE: solo le byte, resto se pierde

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}
}