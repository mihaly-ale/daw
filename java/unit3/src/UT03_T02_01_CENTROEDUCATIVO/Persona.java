package UT03_T02_01_CENTROEDUCATIVO;

import java.time.LocalDate;

public abstract class Persona {
//	private String identificacion;
	private Identificacion id;
	private String nombre;
	private LocalDate fechanac;

	// constructor
	public Persona(Identificacion id, String nombre, LocalDate fechanac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechanac = fechanac;
	}

	// métodos abstractos
	public abstract String rol();

	public abstract void descripcionDetalladaMensual();

	// métodos concretos
	public String mostrarEncabezado() {
		return rol() + "ID: " + getIdentificacion().id()+ " - Nombre: " + getNombre() + " - Fecha nacimiento: " + getFechanac();
	}

	// getters	
	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}

	public Identificacion getIdentificacion() {
		return id;
	}

	public void setIdentificacion(String identificacion) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
