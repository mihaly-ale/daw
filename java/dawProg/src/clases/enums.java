package clases;

import java.util.Scanner;

public class enums {

	// sintaxis
	enum DiaSemana {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}

	// ************************************************

	// internamente la MJV crea de esa manera: crea objetos de cada constante
	// public static final Talla MINI = new Talla(); => OJO: public static final
	// eso significa que Talla es una clase => puede tener métodos
	enum Talla {
		MINI("s"), MEDIANO("m"), GRANDE("l"), MUY_GRANDE("xl");

		private String abreviatura;

		// constructor
		private Talla(String abreviatura) { // without this constuctor it will give an error
			this.abreviatura = abreviatura;
		}

		// getter y setter - creado por Eclipse
		public String getAbreviatura() {
			return abreviatura;
		}

		// no tiene sentido tenerla, porque es un constante
		// por esta razón no debemos su valorcambiar
		public void setAbreviatura(String abreviatura) {
			this.abreviatura = abreviatura;
		}
	}

	public static void main(String[] args) {
		// UTILIZAR DiaSemana
		DiaSemana hoy = DiaSemana.MIERCOLES;

		switch (hoy) {
		case LUNES:
			System.out.println("Ánimo, empieza la semana");
			break;
		case MIERCOLES:
			System.out.println("!Casi fin de semana!");
			break;
		default:
			System.out.println("Dia de descanso");
		}

		// **************************************

		// UTILIZAR Talla
		// Talla de las prendas (Pequeña, Mediana, Grande)

		// Un enum ayuda a evitar VALORES INVÁLIDOS al limitar las opciones DISPONIBLES
		String talla;
		System.out.println("\n -- String talla -- ");
		talla = "rojo";
		System.out.println("Mi talla es " + talla + "."); // Mi talla es rojo.

		System.out.println("\n -- enum TALLA -- ");
		Talla miTalla = Talla.GRANDE;
		System.out.println("miTalla: " + miTalla.getAbreviatura());

		for (Talla t : Talla.values()) {
			System.out.print(t.name() + " " + t.getAbreviatura() + ", ");
		}

		// **********************************
		// Pedir TALLA por scanner
		System.out.println("\n\nEscribe un talla (MINI, MEDIANO, GRANDE, MUY_GRANDE): ");
		Scanner scan = new Scanner(System.in);
		String entradaTalla_datos = scan.next().toUpperCase();
		scan.close();

		// Convertir un String a un ENUM
//		System.out.println("Tipo de entrada es: " + ((Object)entradaTalla_datos).getClass().getSimpleName()); // String		
//		Talla entradaTalla = entradaTalla_datos; // ERROR: Type mismatch: cannot convert from String to enums.Talla 
		// ❌ String ≠ enum

		Talla entradaTalla1 = Enum.valueOf(Talla.class, entradaTalla_datos); // da error si la entrada es inválido =>
																				// try-catch
		Talla entradaTalla2 = Talla.valueOf(entradaTalla_datos);

		System.out.println("entradaTalla1 (Enum.valueOf()): " + entradaTalla1);
		System.out.println("entradaTalla2 (Talla.valueOf()): " + entradaTalla2);

		// Aceder "instance variable" abreviatura con un getter
		System.out.println("abreviatura de le entrada: " + entradaTalla1.getAbreviatura());

		// métodos - playgorund
		System.out.println("here");
		System.out.println(Talla.values()[0].toString().replace("I", "a"));

	} // main

} // class
