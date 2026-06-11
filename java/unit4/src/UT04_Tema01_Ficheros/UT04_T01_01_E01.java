package UT04_Tema01_Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import filechecks.*;

public class UT04_T01_01_E01 {

	public static void main(String[] args) {

		String dirPathSchool = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "unit4" + File.separator + "src" + File.separator + "UT04_Tema01_Ficheros" + File.separator
				+ "resources" + File.separator + "ImagenesJAVA";

		String dirPathHome = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "unit4" + File.separator + "src"
				+ File.separator + "UT04_Tema01_Ficheros" + File.separator + "resources" + File.separator
				+ "ImagenesJAVA";

		String validPath;
		String dest;

		if (filechecks.fileValidator.resolveExistingPath(dirPathHome)) {
			validPath = dirPathHome;
			dest = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator + "PROG"
					+ File.separator + "prog-ws" + File.separator + "unit4" + File.separator + "src" + File.separator
					+ "UT04_Tema01_Ficheros" + File.separator + "creados";

		} else {
			validPath = dirPathSchool;
			dest = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
					+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
					+ "unit4" + File.separator + "src" + File.separator + "UT04_Tema01_Ficheros" + File.separator
					+ "creados";

		}
		System.out.println("ruta válida: " + validPath + "\n" + "carpeta de copia de seguridad: " + dest);

		// ****************************************

		String rutaCarpetaCopia = "copiaDirImagenesJava"; // para crear

		String dirCarpetaCopia = creaDir(dest, rutaCarpetaCopia); // creación
		
		for (String s : new File(validPath).list()) {
			copiarFichero(validPath + File.separator + s, dirCarpetaCopia + File.separator + s);
		}

	}

	private static void copiarFichero(String original, String copia) {
		try (FileInputStream fis = new FileInputStream(original); FileOutputStream fos = new FileOutputStream(copia);) {

			int byteLeido = 0;

			while ((byteLeido = fis.read()) != -1) {
				fos.write(byteLeido);
			}

		} catch (FileNotFoundException e) {
			// NOTE:
			/// 1. fis - fichero no existe, o no es un fichero (sino una carpeta)
			/// 2. fos - no se puede crear el fichero (no existe dir de padre => creaDir())
			System.out.println(e.toString());
		} catch (IOException e) {
			// NOTE: todo que no es FileNotFoundException
			/// p.ej: disk full, interrupted opration, closing errors (open by another app)
			System.out.println(e.toString());
		}

		System.out.println("Copiando " + original);
	} // copiaficheros

	private static String creaDir(String rutaPadre, String nombreDir) {

		File repo = new File(rutaPadre + File.separator + nombreDir);
		if (repo.exists()) {
			if (repo.isDirectory()) {
				System.err.println("El directorio ya existe. No se puede crearlo. Utilizamos " + repo.toString());
			} else {
				System.out.println("Argumentos inválidos al crear la carpeta.");
			}
		} else {
			System.out.println("Creando carpeta ...");
			repo.mkdir(); // crea aqui/
		}

		return repo.toString();
	} // creardir
}
