package $examen;

import java.util.Arrays;

public class examen_pract_0122 {

	public static void main(String[] args) {
		// Nombres de los países
		String[] paises = { "España", "Francia", "Italia", "Chile" };
		// Temperaturas mensuales ya inicializadas (12 meses por país)

		int[][] temperaturas = { { 12, 14, 16, 18, 22, 26, 30, 29, 25, 20, 15, 13 }, // España
				{ 8, 10, 12, 15, 18, 22, 25, 24, 20, 16, 12, 9 }, // Francia
				{ 6, 8, 12, 16, 20, 24, 28, 27, 23, 18, 12, 8 }, // Italia
				{ 5, 7, 10, 12, 15, 18, 20, 21, 18, 14, 10, 7 } // Chile
		};

		System.out.println("\n--- Tabla por paises ---");
		imprimirTemperaturasMensuales(paises, temperaturas);

		System.out.println("\n--- Tabla por meses ---");
		imprimirTemperaturasMensuales(paises, temperaturas, -4);

		System.out.println("\n--- Media Anual de Francia ---");
		System.out.println(mediaAnualPais(temperaturas, buscarPais(paises, "Francia")));

		// Procesar cada país pasado como argumento
		for (int i = 0; i < paises.length; i++) {

			if (args.length != 4) {
				System.out.println("El programa necesita 3 argumentos.");
				return;
			}

			for (int j = 0; j < args.length; j++) { // paisArg: Italia, Noruega, Pepe, CHILE
				if ((paises[j]).equalsIgnoreCase(args[j])) {
					System.out.println("Media annual de " + args[i] + " " +  mediaAnualPais(temperaturas, i));
				} else {
					System.out.println("El país \"" + args[i] + "\" no existe.");
				}
			}

		}
	}

	// Buscar país por nombre (ignora mayúsculas/minúsculas)
	public static int buscarPais(String[] paises, String nombre) {
		int indice = -1;

		for (int i = 0; i < paises.length; i++)
			if (paises[i].equalsIgnoreCase(nombre))
				indice = i;

		return indice;
	}

	// 3.
	public static float mediaAnualPais(int[][] temperaturas, int indicePais) {

		float media = 0.0f;
		int totalTemp = 0;

		for (int i = 0; i < temperaturas[indicePais].length; i++) {
			totalTemp += temperaturas[indicePais][i];
			media = (float) totalTemp / temperaturas[indicePais].length;
		}

		return media;
	};

	// 2.
	public static void imprimirTemperaturasMensuales(String[] paises, int[][] temp, int letras) {

		String[] meses = { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sept", "oct", "nov", "dec" };

		if (letras > 3 || letras < 1) {
			System.out.println("Entrada fuero de rango. Usando valor por defecto: 3.");
			letras = 3;
		}

		System.out.print("Mes \t ");
		for (int i = 0; i < paises.length; i++) {

			System.out.print(paises[i] + " \n");
			for (int j = 0; j < temp[i].length; j++) {
				System.out.print("\n" + meses[j].substring(0, letras) + " " + temp[i][j]);
			}
		}
	}

	// 1.
	public static void imprimirTemperaturasMensuales(String[] paises, int[][] temp) {

		for (int i = 0; i < paises.length; i++) {
			System.out.println("País: " + paises[i]);
			System.out.print("Temperaturas: ");

			for (int j = 0; j < temp[i].length; j++) {
				System.out.print(temp[i][j] + " ");
			}

			System.out.println("\n");
		}
	} // final 1

}
