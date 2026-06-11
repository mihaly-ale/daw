package UT03_T01_02_SOCIO;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Socio {
//atributos
	private String nombre;
	private String dni;
	private String telefono;
	private String matricula;
	private String correoElectronico;
	private Categoria categoria;
	private int numSocio;
	private int visitas;
	private GregorianCalendar fechaAlta;
	private static ArrayList<String> historialCambios = new ArrayList<>();

	private static int numSocioBase = 0; // private para evitar Socio.numSocioBase = 5000;

// constructores

//	public Socio() {
//	};

	public Socio(String nombre, String dni) throws Exception {
		this(nombre, dni, null, null, null);
	}

	public Socio(String nombre, String dni, String telefono, String matricula, String correoElectronico)
			throws Exception {
		this.nombre = nombre;

		dniValido(dni); // para el programa si hay exception

		this.dni = dni;

		if (esValidoTelefono(telefono)) {
			this.telefono = telefono;
		} else {
			this.telefono = "No data";
		}

		if (esValidoMatricula(matricula)) {
			this.matricula = matricula.substring(0, 3) + matricula.substring(matricula.length() - 3).toUpperCase();
		} else {
			System.out.println("here");
			this.matricula = "No data";
		}

		if (esValidoCorreo(correoElectronico)) {
			this.correoElectronico = correoElectronico;
		} else {
			this.correoElectronico = "No data";
		}

		this.categoria = Categoria.BASICA;
		this.numSocio = ++numSocioBase;
		this.visitas = 0;
		this.fechaAlta = new GregorianCalendar();
	}

	private void dniValido(String dni) throws Exception {
		String strValidacion = "TRWAGMYFPDXBNJZSQVHLCKE";

		if (!dni.matches("\\d{8}\\D{1}")) {
			throw new Exception("El formato de Dni no es válido.");
		}

		String digitosDni = dni.substring(0, dni.length() - 2);
		String letraDni = dni.substring(dni.length() - 1);

		int indice = Integer.parseInt(digitosDni) % 23;
		System.out.println("letra " + letraDni + "\n " + strValidacion.charAt(indice)); // helper log

		if (indice != strValidacion.indexOf(letraDni.toUpperCase())) {
			throw new Exception("El formato de Dni no es válido.");

		}

	}

	private boolean esValidoTelefono(String telefono) {
		return (telefono.matches("[6-9]{1}\\d{8}") ? true : false);
	}

	private boolean esValidoMatricula(String matricula) {
		return (matricula.matches("\\d{4}(\s|-)?\\D{3}") ? true : false);
	}

	private boolean esValidoCorreo(String correoElectronico) {
		return (correoElectronico.matches("^[A-Za-z]+([.-][\\w]+)?@{1}[\\w]+[.-]?[\\w]+.[\\w]{2,}$") ? true : false);
	}

// ^[A-Za-z]+([.-][\w]+)?@{1}[\w]+[.-]?[\w]+.[\w]{2,}$

// metodos
	public static ArrayList<String> getHistorialCambios() {
		return historialCambios;
	}

	public void subirCategoria() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yy HH:mm:ss");
//		LocalDateTime.now().format(dtf);

		if (this.visitas == 50) {
			String log = LocalDateTime.now().format(dtf) + " - [" + getNombre() + "] Cambio a " + Categoria.PLATINO
					+ " con " + getVisitas();
			this.categoria = Categoria.PLATINO;
			historialCambios.add(log);
		} else if (this.visitas == 20) {
			String log = LocalDateTime.now().format(dtf) + " - [" + getNombre() + "] Cambio a " + Categoria.PREMIUM
					+ " con " + getVisitas();
			this.categoria = Categoria.PREMIUM;
			historialCambios.add(log);
		}

	}

	public void registrarVisita() {
		this.visitas++;
		subirCategoria();
	}

//toString
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Socio [nombre=" + nombre + ", categoria=" + categoria + ", dni=" + dni + ", numSocio=" + numSocio
				+ ", visitas=" + visitas + ", fechaAlta=" + sdf.format(fechaAlta.getTime()) + ", telefono=" + telefono
				+ ", matricula=" + matricula + ", correo electronico=" + correoElectronico + "]";
	}

// getters, setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public int getVisitas() {
		return visitas;
	}

	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

}

//if (!dni.matches("\\d{8,9}(-|\\s)?\\D{1}")) { // no match, solo mostramos errores
//	String err = "";
//	if (digitosDni.length() < 8) {
//		err = "Debe tener al menos 8 digitos";
//	}
//
//	if (digitosDni.length() > 9) {
//		err = "Debe tener menos de 10 digitos";
//	}
//
//	if (!letraDni.matches("\\D")) {
//		err = "El último caracter debe ser una letra";
//	}
//
//	System.out.print("Formato de DNI es inválido: " + err + ". \n");
//} else { // si formato es OK, realizamos validacion
//	if (!(Character.toString(digitosDni.charAt(digitosDni.length() - 1))).matches("\\d")) {
//		digitosDni = digitosDni.substring(0, digitosDni.length() - 1);
//	}
//
//	int indice = Integer.parseInt(digitosDni) % 23;
////	System.out.println("letra " + letraDni + "\n " + strValidacion.charAt(indice)); // helper log
//
//	if (indice == strValidacion.indexOf(letraDni.toUpperCase()))
//		valido = true;
//}
//
//return valido;
