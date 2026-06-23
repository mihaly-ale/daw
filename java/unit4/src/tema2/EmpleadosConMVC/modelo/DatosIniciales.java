package tema2.EmpleadosConMVC.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class DatosIniciales {

	public static ArrayList<Empleado> crearLista() {
		ArrayList<Empleado> lista = new ArrayList<>();

		lista.add(new Jefe("Carlos Ruiz", 3300, LocalDate.of(2019, 2, 20), "CONTABILIDAD", 300));
		lista.add(new Empleado("Elena Martín", 1700, LocalDate.of(2023, 1, 10), "CONTABILIDAD"));
		lista.add(new Empleado("Jorge Díaz", 1750, LocalDate.of(2020, 11, 5), "CONTABILIDAD"));
		lista.add(new Jefe("Ana Torres", 3500, LocalDate.of(2020, 5, 10), "INFORMATICA", 400));
		lista.add(new Empleado("Luis Pérez", 1800, LocalDate.of(2022, 3, 1), "INFORMATICA"));
		lista.add(new Empleado("Marta Gómez", 1900, LocalDate.of(2021, 7, 15), "INFORMATICA"));
		lista.add(new Jefe("Laura Sánchez", 3200, LocalDate.of(2018, 4, 12), "RECURSOS_HUMANOS", 200));
		lista.add(new Empleado("Pedro Núñez", 1650, LocalDate.of(2021, 6, 3), "RECURSOS_HUMANOS"));
		lista.add(new Empleado("Sandra Mora", 1680, LocalDate.of(2022, 9, 21), "RECURSOS_HUMANOS"));
		lista.add(new Jefe("Javier López", 3400, LocalDate.of(2017, 10, 8), "VENTAS", 400));
		lista.add(new Empleado("Raúl Gómez", 1600, LocalDate.of(2023, 2, 14), "VENTAS"));
		lista.add(new Empleado("Natalia Romero", 1620, LocalDate.of(2022, 12, 1), "VENTAS"));

		return lista;
	}
}
