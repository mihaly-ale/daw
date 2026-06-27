package tema2.EmpleadosConMVC.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Empleado implements Serializable{

	private String nombre;
	private double sueldo;
	private LocalDate fechaContrato;
	private String departamento;

	public Empleado(String nombre, double sueldo, LocalDate fechaContrato, String departamento) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fechaContrato = fechaContrato;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public LocalDate getFechaContrato() {
		return fechaContrato;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato
				+ ", departamento=" + departamento + "]";
	}

}
