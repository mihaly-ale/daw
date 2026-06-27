package tema2.EmpleadosConMVC.Aplicacion;

import java.time.LocalDate;
import java.util.ArrayList;

import tema2.EmpleadosConMVC.modelo.Empleado;
import tema2.EmpleadosConMVC.modelo.Jefe;

public class Usa1 {

	public static void main(String[] args) {
		
		ArrayList<Empleado> empleadosIniciales;

		
				empleadosIniciales.add(new Jefe("Carlos Ruiz", 3300, LocalDate.of(2019, 2, 20), "CONTABILIDAD", 300));
				empleadosIniciales.add(new Empleado("Elena Martín", 1700, 2023, 1, 10, "CONTABILIDAD"));
				empleadosIniciales.add(new Empleado("Jorge Díaz", 1750, 2020, 11, 5, "CONTABILIDAD"));

				empleadosIniciales.add(new Jefe("Ana Torres", 3500, 2020, 5, 10, "INFORMATICA", 400));
				empleadosIniciales.add(new Empleado("Luis Pérez", 1800, 2022, 3, 1, "INFORMATICA"));
				empleadosIniciales.add(new Empleado("Marta Gómez", 1900, 2021, 7, 15, "INFORMATICA"));

				empleadosIniciales.add(new Jefe("Laura Sánchez", 3200, 2018, 4, 12, "RECURSOS_HUMANOS", 200));
				empleadosIniciales.add(new Empleado("Pedro Núñez", 1650, 2021, 6, 3, "RECURSOS_HUMANOS"));
				empleadosIniciales.add(new Empleado("Sandra Mora", 1680, 2022, 9, 21, "RECURSOS_HUMANOS"));

				empleadosIniciales.add(new Jefe("Javier López", 3400, 2017, 10, 8, "VENTAS", 400));
				empleadosIniciales.add(new Empleado("Raúl Gómez", 1600, 2023, 2, 14, "VENTAS"));
				empleadosIniciales.add(new Empleado("Natalia Romero", 1620, 2022, 12, 1, "VENTAS"));

				
		
	}

}
