package tema2.EmpleadosConMVC.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Empleado implements Serializable {
	// GOTO: linea 48

	private String nombre;
	private double sueldo;
	private LocalDate fechaContrato;
	private String departamento;

	public Empleado(String nombre, double sueldo, int ano, int mes, int dia, String departamento) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fechaContrato = LocalDate.of(ano, mes, dia);
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

// https://en.wikipedia.org/wiki/Serialization
/*
 * Serialization is the process of translating a data structure or object state
 * into a format that can be stored (e.g. files in secondary storage devices,
 * data buffers in primary storage devices) or transmitted (e.g. data streams
 * over computer networks) and reconstructed later (possibly in a different
 * computer environment).abstract
 */

// https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html
/*
 * Doesn't offer methods, fields only offers the semantic of being serializable:
 * "the class is safe to serialize".
 */