package booleanos;

public class compruebaHora {

	public static void main(String[] args) {
		compruebaHora(12, 23, 57);
		compruebaHora(38, 23, 57);
		compruebaHora(9, 23, 57);
		compruebaHora(12, 8, 57);

		System.out.println("----");
		compruebaHoraConNegacion(12, 23, 57);
		compruebaHoraConNegacion(38, 23, 57);
		compruebaHoraConNegacion(12, 61, 57);
		compruebaHoraConNegacion(12, 48, 65);
	}

	private static void compruebaHora(int hora, int min, int sec) {

		if ((hora >= 0 && hora <= 23) && (min >= 0 && min <= 59) && (sec >= 0 && sec <= 59)) {
			System.out.println("\nhora: " + (hora >= 0 && hora <= 23) + "  min: " + (min >= 0 && min <= 59) + "  sec: "
					+ (sec >= 0 && sec <= 59));
			System.out.printf("La hora es válida: %02d:%02d:%02d%n", hora, min, sec);
		} else
			System.out.println("\nDatos inválidos.");
	} // compruebaHora

	private static void compruebaHoraConNegacion(int hora, int min, int sec) {
		if (!((hora < 0 || hora > 24) || (min < 0 || min > 59) || (sec < 0 || sec > 59))) {
			System.out.println("La hora válida es: " + hora + ":" + min + ":" + sec + ".");
		} else
			System.out.println("Datos inválidos");
	} // compruebaHoraConNegacion

}
