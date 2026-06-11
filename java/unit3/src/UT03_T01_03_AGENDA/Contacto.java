package UT03_T01_03_AGENDA;

import java.util.ArrayList;

public class Contacto {

	private String id;
	private String nombre;
	private String apellidos;
	private Telefono telefono;
	private Evento evento;
	private Direccion direccion;
	private ArrayList<Telefono> listaTelefonos = new ArrayList<>();
	private ArrayList<Evento> listaEventos = new ArrayList<>();
	private ArrayList<Direccion> listaDirecciones = new ArrayList<>();

	private static int primerID = 0;

	// constructor
	public Contacto(String nombre, String apellidos) {
		this(nombre, apellidos, null, null, null);
	}

	public Contacto(String nombre, String apellidos, Telefono telefono) {
		this(nombre, apellidos, telefono, null, null);
	}

	public Contacto(String nombre, String apellidos, Evento evento) {
		this(nombre, apellidos, null, evento, null);
	}
	
	public Contacto(String nombre, String apellidos, Telefono telefono, Evento evento) {
		this(nombre, apellidos, telefono, evento, null);
	}
	
	public Contacto(String nombre, String apellidos, Direccion direccion) {
		this(nombre, apellidos, null, null, direccion);
	}

	public Contacto(String nombre, String apellidos, Telefono telefono, Evento evento, Direccion direccion) {
		this.id = Integer.toString(primerID++);
		this.nombre = Validacion.validarCadenaNuloVacio(nombre, "Nombre de contacto");
		this.apellidos = Validacion.validarCadenaNuloVacio(apellidos, "Apellido(s) de contacto");

		if (telefono != null) {
			addTelefono(telefono);
		}

		if (evento != null) {
			addEvento(evento);
		}
		
		if (direccion != null) {
			addDireccion(direccion);
		}
	}

	@Override
	public String toString() {
		return "Contacto [\n\tid=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", \n\tlistaTelefonos=\n\t\t"
				
				+ listaTelefonos + ",\n\tlistaEventos=" + listaEventos + ",\n\tlistaDirecciones=" + listaDirecciones + "]";
	}

	// setter
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// telefono
	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	// evento
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	// listaTelefonos
	public ArrayList<Telefono> getListaTelefonos() {
		return listaTelefonos;
	}

	public void addTelefono(Telefono telefono) {
		this.listaTelefonos.add(telefono);
	}

	// listaEventos
	public ArrayList<Evento> getListaEventos() {
		return listaEventos;
	}

	public void addEvento(Evento evento) {
		this.listaEventos.add(evento);
	}
	
	// ListaDirecciones
	public ArrayList<Direccion> getListaDirecciones() {
		return listaDirecciones;
	}
	
	public void addDireccion(Direccion direccion) {
		this.listaDirecciones.add(direccion);
	}

}
