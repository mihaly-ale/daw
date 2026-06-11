package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import filechecks.fileValidator;

public class dataInputStream {

	public static void main(String[] args) {

		String dirPathSchool = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "dawProg" + File.separator + "src" + File.separator + "stream" + File.separator + "resources"
				+ File.separator + "creados";

		String dirPathHome = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "dawProg" + File.separator + "src"
				+ File.separator + "stream" + File.separator + "creados";

		String fichero = "misDatosDOS.dat";

		String validPath;

		if (filechecks.fileValidator.resolveExistingPath(dirPathHome)) {
			validPath = dirPathHome + File.separator + fichero;
		} else {
			validPath = dirPathSchool + File.separator + fichero;
		}
		
	
		if (filechecks.fileValidator.resolveFilePath(validPath) == null) {
			System.out.println("Ejecuta \"dataOutputStreamWrite.java\" para crear el fichero \"" + fichero + "\".");
		} else {
			System.out.println("Fichero \"" + fichero + "\" existe. Lanza programa ...\n");
			System.out.println("\nleer datos en orden de escritura:");
			leerContenidoConocido(validPath);
			System.out.println("\nleer UTF con \"dis.readChar()\":");
			leerHastaEOF(validPath);

		}

	} // main

	private static void leerContenidoConocido(String filePath) {
		try (DataInputStream DIS = new DataInputStream(new FileInputStream(filePath));) {
			System.out.println(DIS.readBoolean()); // true
			System.out.println(DIS.readByte()); // 127
			// System.out.println(DIS.readShort()); // we skip this on the next line
			DIS.skipBytes(2);
			System.out.println(DIS.readChar()); // A
			System.out.println(DIS.readUTF()); // Hola Mundo

		} catch (EOFException e) {
			System.out.println(e.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

	private static void leerHastaEOF(String filePath) {

		try (DataInputStream DIS = new DataInputStream(new FileInputStream(filePath));) {
			do {
				System.out.println(DIS.readBoolean()); // 1
				System.out.println(DIS.readByte()); // 127
				System.out.println(DIS.readShort()); // 3200
				System.out.println(DIS.readChar()); // A, lee UTF
			} while (true);

		} catch (EOFException e) {
			System.out.println(
					"EOFException - Signals that an end of file or end of stream has been reached unexpectedly during input.");
			System.out.println(e.toString());

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
