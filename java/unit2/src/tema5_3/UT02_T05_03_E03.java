package tema5_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UT02_T05_03_E03 {

	public static void main(String[] args) {
//		C:/Windows/system32
//		C:/Window/system32
//		tema5_3/archivo.txt
//		tema5_3/archivo.text
		File recurso;

		if (args.length == 0) {
			System.out.println("Necesita el argumento.");
			return;
		} else {
			recurso = new File(args[0]);
		}

		if (recurso.exists()) {
			visualizarContenido(recurso);
		} else {
			System.out.println("El recurso no existe.");
		}

	} // main

	static void visualizarContenido(File recurso) {

		if (recurso.isDirectory()) { // directorio
			System.out.println("Es un directorio.");

			String[] contenidoDir = recurso.list();

			System.out.println("\n*\nContenido:\n");
			for (String s : contenidoDir) {

				File subRuta = new File(recurso, s);
				String prefijo;

				if (subRuta.isDirectory()) {
					prefijo = "[DIR]";
				} else {
					prefijo = "[FICH]";
				}

				System.out.println(prefijo + " " + s);
			}

		} else { // archivo
			System.out.println("Es un archivo.");

			try {
				Scanner lector = new Scanner(recurso);

				System.out.println("\n*\nContenido:\n");
				while (lector.hasNextLine()) {
					System.out.println(lector.nextLine());
				}

				lector.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

}
