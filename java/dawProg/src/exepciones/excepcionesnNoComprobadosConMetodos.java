package exepciones;

import java.time.DateTimeException;
import java.time.LocalDate;

public class excepcionesnNoComprobadosConMetodos{

	public static void main(String[] args) {

		try {
			establecerPorcentaje(120, -1); // IllegalArgumentException
			setPeriodo(LocalDate.of(2026, 2, 1), LocalDate.of(2024, 2, 10)); // DateTimeException
			System.out.println(Integer.parseInt("42"));
			System.out.println(Integer.parseInt("4a2")); // ERROR: NumberFormatException
		} catch (NumberFormatException | DateTimeException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	public static void establecerPorcentaje(int p, double cantidad) {
		if (p < 0 || p > 100)
			throw new IllegalArgumentException("Ël porcentaje debe estar entre 0 y 100."); // constructor
		if (cantidad <= 0)
			throw new IllegalArgumentException("Cantidad >= 0");

	} // establecerPorcentaje

	public static void setPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
		if (fechaFin.isBefore(fechaInicio))
			throw new IllegalArgumentException(
					"La fecha debe ser posterior" + "recibidio: inicio=" + fechaInicio + ", fin" + fechaFin);
	} // setPeriodo

}
