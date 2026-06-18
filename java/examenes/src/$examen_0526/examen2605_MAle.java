package $examen_0526;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class examen2605_MAle {
	static int rondas;
	static ArrayList<String> nombres;
	static ArrayList<int[]> puntos;

	// ficheros

	public static void main(String[] args) {
		inicializarDatos();
//		inicializarDatosDeFichero();
		repartirPremios();
	}

	private static void inicializarDatos() {

		nombres = new ArrayList<>();
		puntos = new ArrayList<>();

		rondas = 3;

		// Añadir nombres
		nombres.add("A");
		nombres.add("B");
		nombres.add("C");
		nombres.add("D");

		// Añadir filas de puntos
		puntos.add(new int[] { 11, 7, 3 });
		puntos.add(new int[] { 5, 13, 4 });
		puntos.add(new int[] { 6, 9, 8 });
		puntos.add(new int[] { 5, 2, 12 });

//		System.out.println(puntos.get(1)[2]); // Visualiza el número 4
	}

	private static void repartirPremios() {
		ArrayList<int[]> nuevaPuntosConRondas = new ArrayList<>();

		for (int i = 0; i < puntos.size(); i++) {

			int[] intArray = puntos.get(i); // 11, 7, 3
			int[] newIntArray = new int[intArray.length];

			for (int j = 0; j < intArray.length; j++) {
				newIntArray[j] = intArray[j] * (i + 1);
			}
			nuevaPuntosConRondas.add(newIntArray);

		} // arraylist creado
		
		
		System.out.println("Winners: ");
		int indiceMax = -1;
		int max = 0;
		for (int i = 0; i < rondas; i++) {
			int[] scores = nuevaPuntosConRondas.get(i);

			for (int j = 0; j < scores.length; j++) {
				if (scores[j] > max) {
					max = scores[j];
					indiceMax =  j;
				}

				

//				System.out.println(nuevaPuntosConRondas.get(i)[j]); // set a zero, porque encontrado
			}
			nuevaPuntosConRondas.get(i)[indiceMax] = -1;
			System.out.println(nombres.get(i) + "=>  ronda " + i + " punto: " + max);

		}

	} // repartirPremios

	private static void inicializarDatosDeFichero() {
		String ruta = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator + "Desktop"
				+ File.separator + "Puntuaciones-01.dat";

		try (DataInputStream DIS = new DataInputStream(new FileInputStream(ruta));) {

			int ronda = DIS.readInt();
			System.out.println("rondas " + ronda); // rondas

			do {

				System.out.println("\nnombre: " + DIS.readUTF()); // nombre
				for (int i = 0; i < ronda; i++) { // rondas veces los puntos
					System.out.print(" ronda: " + i + " => punto: " + DIS.readInt() + " | ");
				}
				System.out.println("\n--------------------------------");
			} while (true);
		} catch (EOFException e) {
			System.out.println("\nLectura de fichero " + ruta + " ha finalizado");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	} // inicializarDatosDeFichero

}
