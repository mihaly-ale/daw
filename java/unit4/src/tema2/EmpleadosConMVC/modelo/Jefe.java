package tema2.EmpleadosConMVC.modelo;

import java.time.LocalDate;

public class Jefe extends Empleado {
	private double incentivo;

	public Jefe(String nombre, double sueldo, int ano, int mes, int dia, String departamento) {
		super(nombre, sueldo, ano, mes, dia, departamento);
	}

	public Jefe(String nombre, double sueldo, int ano, int mes, int dia, String departamento, double incentivo) {
		super(nombre, sueldo, ano, mes, dia, departamento);
		this.incentivo = incentivo;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return super.getSueldo();
	}

	@Override
	public String toString() {
		return "Jefe [incentivo=" + incentivo + "]";
	}

}
