package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {

	public static void main(String[] args) {

		File archivo = new File("src/stream/resources/archivo.txt");

		// NOTE working directory is always the project folder, here dawProg
//		File archivo = new File("src/file/archivo");

		if (archivo.exists()) {
			System.out.println("Existe");

			if (!archivo.isDirectory()) {
				try {
					Scanner scan = new Scanner(archivo);
					while (scan.hasNextLine()) {
						System.out.println(scan.nextLine());
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

			} else {
				System.out.println("Es una carpeta.");
			}
		} else {
			System.out.println("No existe.");
		}
	}

}
