package UT04_T01_Ficheros_UsuariosContrasena;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class old {

	public static void main(String[] args) {
		

		String dir = getValidPath();
		// ****************************************************

		String usuarios = "usuarios.dat";

		// crea dir dependiendo de casa/cole
		if (new File(dir).exists()) {
			System.out.println("Directorio " + dir + " existe.");
		} else {
			System.out.println("Creamos dir " + dir);
			new File(dir).mkdir();
		}

		// crea fichero
		String fichero = dir + File.separator + usuarios;
		try {
			new File(fichero).createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// crear usuarios, y guardarlos en un fichero
		Random rnd = new Random();
		int cantidadUsuarios = rnd.nextInt(10, 21);// 1. usuarios entre 10 y 20

		for (int i = 0; i < cantidadUsuarios; i++) {
			String usuario = String.format("user%02d", i + 1);

			String contrasena = generadorContrasenas.generarPassword(usuario);

			try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero, true))) {

				String zero = "";
				if (i <= 8) {
					zero = "0";
				}

				dos.writeUTF("user" + zero + (i + 1) + " => " + contrasena);
//				dos.writeUTF("\n");

			} catch (FileNotFoundException e) {
				System.out.println(e.toString());
			} catch (IOException e) {
				System.out.println(e.toString());
			}

		}

		// ****************************
		for (String s : LectorUsuarios.leerUsuarios(fichero)) {
			System.out.println(s);
		}

	}

	// métodos
	public static String getValidPath() {

		String rutaDirSchool = "C:" + File.separator + "Users" + File.separator + "mihaly.ale.EDUCA" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "unit4" + File.separator + "src" + File.separator + "UT04_T01_Ficheros_UsuariosContrasena"
				+ File.separator + "creados";

		String rutaDirHome = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "unit4" + File.separator + "src"
				+ File.separator + "UT04_T01_Ficheros_UsuariosContrasena" + File.separator + "creados";

		String validPath;
		System.out.println("here");

		if (filechecks.fileValidator.resolveExistingPath(rutaDirHome)) {
			validPath = rutaDirHome;
		} else {
			validPath = rutaDirSchool;
		}

		return validPath;
	}

}
