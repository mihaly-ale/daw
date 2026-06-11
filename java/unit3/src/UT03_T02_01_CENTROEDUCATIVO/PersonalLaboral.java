package UT03_T02_01_CENTROEDUCATIVO;

import java.time.LocalDate;

public class PersonalLaboral extends Trabajador {
	private int horasExtra;
	private double tarifaHoraExtra;

	// constructor
	PersonalLaboral(Identificacion id, String nombre, LocalDate fechanac, double salarioBase, int horasExtra,
			double tarifaHoraExtra) {
		super(id, nombre, fechanac, salarioBase);
		this.horasExtra = horasExtra;
		this.tarifaHoraExtra = tarifaHoraExtra;
	}
	
	// métodos concretos
	public String rol() {		
		return "Personal Laboral ";
	}
	
	// pagos, sueldos
	public double calcularExtraPago() {
		return horasExtra * tarifaHoraExtra;
	}
	
	public double calcularSueldo() {		
		return super.getSalarioBase() + calcularExtraPago();
	}		
	
	// logs
	public String mostarHorasExtras() {
		return horasExtra + " h * " + tarifaHoraExtra + " €/h = " + calcularExtraPago() + " €";
	}
	
	public void descripcionDetalladaMensual() {
		
		System.out.println(
		"===== NÓMINA - PERSONAL LABORAL ====== \n" + mostrarEncabezado() + "\nSueldo base:\t\t " + super.getSalarioBase() + "\nHoras extra:\t\t " +  this.mostarHorasExtras() + "\n---------------------------------------\nTOTAL A PERCIBIR: " + calcularSueldo()	+ " €");
	};

}
