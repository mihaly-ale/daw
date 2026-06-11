package UT04_T01_Ficheros_UsuariosContrasena;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class LectorUsuarios {
	public static ArrayList<String> leerUsuarios(String rutaFichero)

	{
		ArrayList<String> usuarios = new ArrayList<>();

		try (DataInputStream dis = new DataInputStream(new FileInputStream(rutaFichero));) {

			do {
				usuarios.add(dis.readUTF());
			} while (true);

		} catch (EOFException e) {
			System.out.println("Fin del fichero.");
		} catch (IOException e) {
			System.out.println("Error al leer el fichero.");
		}

		return usuarios;
	}

}
