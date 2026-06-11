package tema4_3;

import java.util.Scanner;

public class UT02_T04_03_E05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Entrada de datos
		System.out.print("Introduce número de aciertos: ");
		int aciertos = scanner.nextInt();

		System.out.print("Introduce total de preguntas: ");
		int total = scanner.nextInt();

		// Evaluación
		int porcentaje = evaluar(aciertos, total);
		// Calcula el porcentaje de aciertos
		String calificacion = evaluar(porcentaje);
		/*
		 * Devuelve una calificación textual según el porcentaje: >= 90: "Excelente" >=
		 * 75: "Bien" >= 60: "Suficiente" < 60: "Insuficiente"
		 */
        String rendimiento = evaluar(calificacion);
		// Devuelve "Sí" si la calificación es "Excelente" o "Bien".
		// Devuelve "No" si es "Suficiente" o "Insuficiente"

		// Resultados
		System.out.println("\nPorcentaje de aciertos: " + porcentaje + "%");
		System.out.println("Calificación: " + calificacion);
        System.out.println("¿Rendimiento aceptable?: " + rendimiento);

		scanner.close();
	}

	public static int evaluar(int aci, int tot) {
		return aci * 100 / tot;
	};

	public static String evaluar(int porc) {
		String cal;

		if (porc >= 90)
			cal = "Excelente";
		else if (porc >= 75)
			cal = "Bien";
		else if (porc >= 60)
			cal = "Suficiente";
		else
			cal = "No suficiente";

		return cal;
	};
	
	public static String evaluar(String cal) {
		String rend;
		
		rend = (cal == "Excelente" || cal == "Bien") ? "Sí": "No";	
		
		return rend;
	};

}
