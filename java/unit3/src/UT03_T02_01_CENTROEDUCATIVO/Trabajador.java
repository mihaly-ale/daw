package UT03_T02_01_CENTROEDUCATIVO;

import java.time.LocalDate;
import java.time.Period;

public abstract class Trabajador extends Persona {
	private double salarioBase;

	// constructor
	public Trabajador(Identificacion id, String nombre, LocalDate fechanac, double salarioBase) {
		super(id, nombre, fechanac);
		this.salarioBase = salarioBase;
	}

	// métodos abstractos
	public abstract double calcularSueldo();

	// métodos concretos
	public LocalDate fechaInicioLaboral() {
		return this.getFechanac().plusYears(30);
	};

	public int aniosTrabajados(LocalDate enFecha) {
		LocalDate inicio = fechaInicioLaboral();

		if (enFecha.isBefore(inicio))
			return 0;
		return Period.between(inicio, enFecha).getYears();
	}

	// getters
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
