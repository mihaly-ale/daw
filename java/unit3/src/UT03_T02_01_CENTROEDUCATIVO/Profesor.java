package UT03_T02_01_CENTROEDUCATIVO;

import java.time.LocalDate;

abstract class Profesor extends Trabajador {
	public static final double IMPORTE_TRIENIO = 50;
	public static final double IMPORTE_SEXENIO = 120;

	// constructor
	public Profesor(Identificacion id, String nombre, LocalDate fechanac, double salarioBase) {
		super(id, nombre, fechanac, salarioBase);
	}

	// metodos concretos
	public int numTrienios() {
		int añosEnTrabajo = aniosTrabajados(LocalDate.now());
		return añosEnTrabajo /3;
	}

	public int numSexenios() {
		int añosEnTrabajo = aniosTrabajados(LocalDate.now());
		return añosEnTrabajo / 6;
	}

	// metodos extra
	public double getImporteTrienio() {
		return numTrienios() * (int)IMPORTE_TRIENIO;
	}

	public double getImporteSexenio() {
		return numSexenios() * (int)IMPORTE_SEXENIO;
	}
}
