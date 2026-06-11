package UT04_Tema01_Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import filechecks.*;

public class UT04_T01_01_E02 {

	public static void main(String[] args) {

		String dirPathSchool = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "unit4" + File.separator + "src" + File.separator + "UT04_Tema01_Ficheros" + File.separator
				+ "resources";

		String dirPathHome = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "unit4" + File.separator + "src"
				+ File.separator + "UT04_Tema01_Ficheros" + File.separator + "resources";

		String validPath;
		String dest;

		if (filechecks.fileValidator.resolveExistingPath(dirPathHome)) { // casa
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

		String ficheroLineas1 = "Lineas.dat";
		System.out.println(
				"ruta válida: " + validPath + "\n" + "fichero original " + validPath + File.separator + ficheroLineas1);

		// *********************************************************************************

		System.out.println("\nescribirSoloPrimeraLineaSumLineas:\n"); // NOTE:sabemos que las lineas se repiten
		String ficheroContenidoLineas1 = "ContenidoLineas.dat";
		escribirSoloPrimeraLineaSumLineas(validPath, dest, ficheroLineas1, ficheroContenidoLineas1);

		System.out.println("\nescribirTodasLineaSumLineas:\n"); // NOTE: NO sabemos que las lineas se repiten
		String ficheroLineas2 = "ady.dat";
		String ficheroContenidoLineas2 = "contenidoAdy.dat";
		escribirTodasLineasSumLineas(validPath, dest, ficheroLineas2, ficheroContenidoLineas2);

	} // main

	public static void escribirSoloPrimeraLineaSumLineas(String ficheroDir, String ficheroCreadoDir, String fichero,
			String ficheroCreado) {
		try (FileInputStream fis = new FileInputStream(ficheroDir + File.separator + fichero);
				FileOutputStream fos = new FileOutputStream(ficheroCreadoDir + File.separator + ficheroCreado)) {

			int byteLeido = 0;
			int contadorLineas = 0;
			boolean enPrimeraLinea = true;

			while ((byteLeido = fis.read()) != -1) {

				if (enPrimeraLinea && byteLeido != '\n') { // enPrimerLinea es true hasta el primero "\n"
															// byteLeido es un byte differente de "\n"
					fos.write(byteLeido); // al encontrar EOL este if no ejecuta más veces
					System.out.print((char) byteLeido);
				}

				if (byteLeido == '\n') { // si el byte es EOL
					enPrimeraLinea = false;
					contadorLineas++;
				}
			}

			fos.write('\n');
			fos.write(String.valueOf(contadorLineas).getBytes());
			System.out.println(String.valueOf(contadorLineas));

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	} // escribirSoloPrimeraLineaSumLineas

	public static void escribirTodasLineasSumLineas(String ficheroDir, String ficheroCreadoDir, String fichero,
			String ficheroCreado) {
		try (FileInputStream fis = new FileInputStream(ficheroDir + File.separator + fichero);
				FileOutputStream fos = new FileOutputStream(ficheroCreadoDir + File.separator + ficheroCreado)) {

			int byteLeido = 0;
			int contadorLineas = 0;

			while ((byteLeido = fis.read()) != -1) {

				if (byteLeido != '\n') {
					fos.write(byteLeido);
					System.out.print((char) byteLeido);
				}

				if (byteLeido == '\n') {
					contadorLineas++;
				}
			}

			fos.write('\n');
			fos.write(String.valueOf(contadorLineas).getBytes());
			System.out.println(String.valueOf(contadorLineas));

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	} // escribirTodasLineasSumLineas
}
