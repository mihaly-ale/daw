package UT03_T01_03_AGENDA;

import java.time.LocalDate;

public class Evento {
	private String nombre;	
	private LocalDate fecha;
	private String notas;	
	
	
	// constructor
	public Evento(String nombre, String fecha, String notas) {
		this.nombre = 
				Validacion.validarCadenaNuloVacio(nombre, "Nombre del evento");
		this.fecha = parsearFecha(fecha);
		this.notas = notas.trim();
	}	
	
	// parsear fecha
	private static LocalDate parsearFecha(String fecha) {		
		String[] fechaArray = fecha.replaceAll("[\s-]", ",").split(",");		
		return LocalDate.of(Integer.parseInt(fechaArray[0]), Integer.parseInt(fechaArray[1]), Integer.parseInt(fechaArray[2]));
	}

	@Override
	public String toString() {
		return "\n\t\tEvento [nombre=" + nombre + ", fecha=" + fecha + ", notas=" + notas + "]\n\t\t";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
}
