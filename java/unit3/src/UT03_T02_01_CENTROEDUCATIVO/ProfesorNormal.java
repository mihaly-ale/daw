package UT03_T02_01_CENTROEDUCATIVO;

import java.time.LocalDate;

public class ProfesorNormal extends Profesor {
	CargoJefatura cargo;

	// constructor
	public ProfesorNormal(Identificacion id, String nombre, LocalDate fechanac, double salarioBase,
			CargoJefatura cargo) {
		super(id, nombre, fechanac, salarioBase);
		this.cargo = cargo;
	}

	// metodos abstractos
	public String rol() {
		return "Profesor Normal";
	}

	public double calcularSueldo() {
		return getSalarioBase() + getImporteTrienio() + getImporteSexenio() + cargo.getBonus();
	}

	public void descripcionDetalladaMensual() {

		System.out.println("===== NÓMINA - PROFESOR NORMAL ====== \n" + mostrarEncabezado() + "\n" + "Sueldo fijo:\t" + "\t"
				+ " " + getSalarioBase() + "\nTrienios (" + numTrienios() + " x " + IMPORTE_TRIENIO + " ): \t" + ""

				+ getImporteTrienio() + " €" + "\n" + "Sexenios (" + numSexenios() + " x " + IMPORTE_SEXENIO + " ): \t"
				+ getImporteSexenio() + " €" + "\nPlus Jefatura: \t\t" + cargo.getBonus() + " € (" + cargo.toString()
				+ ")" +

				"\n---------------------------------------\nTOTAL A PERCIBIR: " + calcularSueldo() + " €");
	};

}

