package UT04_Tema01_Ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class UT04_T01_01_E03 {

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

		} else {
			validPath = dirPathSchool;

		}

		String ficheroUno = "EnterosOrdenados1.dat"; // 2,3,4,9,12
		String ficheroDos = "EnterosOrdenados2.dat"; // 1,3,7

		// obtener variables
		int lonFichUno = leerLongitud(validPath + File.separator + ficheroUno);
		int lonFichDos = leerLongitud(validPath + File.separator + ficheroDos);
		int[] intArray = new int[lonFichUno + lonFichDos];

		// crear array (con indices vacios) para almacenar nums de fichero segundo
		try (DataInputStream dis = new DataInputStream(new FileInputStream(validPath + File.separator + ficheroUno))) {

			for (int i = 0; i < lonFichUno; i++) {

				int entero = dis.readInt();

				intArray[i] = entero;
			}
		} catch (EOFException e) {
			System.out.println(e.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Final del fichero " + ficheroUno);
			System.out.println("Final del fichero " + ficheroDos);
		}

		// añadir and sortear valores
		try (DataInputStream dis = new DataInputStream(new FileInputStream(validPath + File.separator + ficheroDos));
				DataOutputStream dos = new DataOutputStream(
						new FileOutputStream(validPath + File.separator + intArray))) {

			for (int i = 0; i < lonFichDos; i++) {

				int entero = dis.readInt();

				int j;
				for (j = lonFichUno + i; j > 0 && intArray[j - 1] > entero; j--) {
					intArray[j] = intArray[j - 1];
				}
				intArray[j] = entero;
			}
		} catch (EOFException e) {
			System.out.println(e.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Final del fichero " + ficheroDos);
		}

		System.out.println("\nContenido de los dos ficheros: " + Arrays.toString(intArray));
	}

	private static int leerLongitud(String fichero) {
		int longitud = 0;

		try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {

			do {
				dis.readInt();
				longitud++;
			} while (true);

		} catch (EOFException e) {
			System.out.println(e.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Final del fichero " + fichero);
		}

		return longitud;
	}
}

/*
 * right shif j=5: 12 > 1? → copia [4]→[5] → [2,3,4,9,12,12,0,0] j=4: 9 > 1 →
 * copia [3]→[4] → [2,3,4,9, 9,12,0,0] j=3: 4 > 1 → copia [2]→[3] → [2,3,4, 4,
 * 9,12,0,0] j=2: 3 > 1 → copia [1]→[2] → [2,3,3, 4, 9,12,0,0] j=1: 2 > 1? →
 * copia [0]→[1] → [2,2,3, 4, 9,12,0,0] j=0: sale del bucle (j > 0 es false)
 * intArray[0] = 1 => [1,2,3,4,9,12,0,0]
 * 
 * j=6: ¿intArray[5]=12 > 3? sí → [5]→[6] → [1,2,3,4,9,12,12], j=5 j=5:
 * ¿intArray[4]= 9 > 3? sí → [4]→[5] → [1,2,3,4,9, 9,12], j=4 j=4: ¿intArray[3]=
 * 4 > 3? sí → [3]→[4] → [1,2,3,4,4, 9,12], j=3 j=3: ¿intArray[2]= 3 > 3? NO →
 * sale del bucle intArray[3] = 3 → [1,2,3,3,4,9,12] ✓
 */