package UT04_T01_Ficheros_UsuariosContrasena;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class GeneradorUsuarios {

	public static String generarPassword(String usuario) { // deberia ser público, pero reulizamos código
		return generadorContrasenas.generarPassword(usuario);
	}

	public static void escribirUsuarios(String rutaFichero) {

		Random rnd = new Random();
		int cantidadUsuarios = rnd.nextInt(10, 21);// 1. usuarios entre 10 y 20
		System.out.println("Creamos " + cantidadUsuarios + " contraseñas en (GeneradosUsuarios) :");

		for (int i = 0; i < cantidadUsuarios; i++) {
			String usuario = String.format("user%02d", i + 1);

			try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(rutaFichero, true))) {

				String zero = "";
				if (i <= 8) {
					zero = "0";
				}

				dos.writeChars("user" + zero + (i + 1) + " => " + generarPassword(usuario));
				dos.writeChars("\n");
			} catch (FileNotFoundException e) {
				System.out.println("this");
				System.out.println(e.toString());
			} catch (IOException e) {
				System.out.println("o this");
				System.out.println(e.toString());
			}
		}

	}

} // GeneradorUsuarios
