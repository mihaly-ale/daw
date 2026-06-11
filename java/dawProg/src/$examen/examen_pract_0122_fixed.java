package $examen;

import java.util.Arrays;

public class examen_pract_0122_fixed {
	public static void main(String[] args) {
		String[] paises = new String[] { "España", "Francia", "Italia", "Chile" };
		int[][] temperaturas = new int[][] { { 12, 14, 16, 18, 22, 26, 30, 29, 25, 20, 15, 13 },
				{ 8, 10, 12, 15, 18, 22, 25, 24, 20, 16, 12, 9 }, { 6, 8, 12, 16, 20, 24, 28, 27, 23, 18, 12, 8 },
				{ 5, 7, 10, 12, 15, 18, 20, 21, 18, 14, 10, 7 } };
		System.out.println("\n--- Tabla por paises ---");
		imprimirTemperaturasMensuales(paises, temperaturas);
		System.out.println("\n--- Tabla por meses ---");
		imprimirTemperaturasMensuales(paises, temperaturas, -4);
		System.out.println("\n--- Media Anual de Francia ---");
		System.out.println(mediaAnualPais(temperaturas, buscarPais(paises, "Francia")));
	} //main

	public static int buscarPais(String[] paises, String nombre) {
		int indice = -1;

		for (int i = 0; i < paises.length; ++i) {
			if (paises[i].equalsIgnoreCase(nombre)) {
				indice = i;
			}
		}

		return indice;
	} // metodo por Isabel
	
	//4 Add here the fourth - #TODO

	// 3
	public static float mediaAnualPais(int[][] temperaturas, int indicePais) {
		float media = 0.0F;
		int totalTemp = 0;

		for (int i = 0; i < temperaturas[indicePais].length; ++i) {
			totalTemp += temperaturas[indicePais][i];
			media = (float) totalTemp / (float) temperaturas[indicePais].length;
		}

		return media;
	}

	// 2
	public static void imprimirTemperaturasMensuales(String[] paises, int[][] temp, int letras) {
		String[] meses = new String[] { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sept", "oct", "nov",
				"dec" };
		if (letras > 3 || letras < 1) {
			System.out.println("Entrada fuero de rango. Usando valor por defecto: 3.");
			letras = 3;
		}

		System.out.print("Mes \t");
		String paisArrString = Arrays.toString(paises); // this should be like in the first, simple for each
		System.out.print(paisArrString.substring(1, paisArrString.length() - 1));
		System.out.println("\n");

		for (int m = 0; m < meses.length; ++m) {
			System.out.print(meses[m].substring(0, letras) + "\t");

			for (int i = 0; i < paises.length; ++i) { // i should be pais, and m shoud stay as is
				System.out.print("  " + temp[i][m] + "\t");
			}

			System.out.println();
		}

	}

	// 1
	public static void imprimirTemperaturasMensuales(String[] paises, int[][] temp) {
		for (int i = 0; i < paises.length; ++i) {
			System.out.println("País: " + paises[i]);
			System.out.print("Temperaturas: ");

			for (int j = 0; j < temp[i].length; ++j) {
				System.out.print(temp[i][j] + " ");
			}

			System.out.println("\n");
		}

	}
}
