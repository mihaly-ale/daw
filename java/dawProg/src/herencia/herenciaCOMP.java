package herencia;

import java.util.ArrayList;

// class componente, "partes"
class Hoja {
	private int numero;
	private String contenido;

	public Hoja(int numero, String contenido) {
		this.numero = numero;
		this.contenido = contenido;
	}
};

// class compuesto, "todo"
class LibroCOMP {
	private String titulo;

	private ArrayList<Hoja> hojas = new ArrayList<>();

	public LibroCOMP(String titulo, int numeroDeHojas) {
		this.titulo = titulo;

		for (int i = 1; i <= numeroDeHojas; i++) {
			hojas.add(new Hoja(i, "Contenido de la hoja" + i)); // aqui ocurre la composición
		}
		// COMPOSICIÓN:
		// El todo crea las partes.
		// Las partes no pueden existir sin el todo.
		// Las piezas no se comparten, no se reutilizan, no se transmiten
		// El conjunto controla el ciclo de vida de las piezas.
	}

	@Override
	public String toString() {
		return " " + titulo + ", que tiene " + hojas.size() + " hojas.";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}

// class Persona
class PersonaCOMP {
	private String nombre;

	public PersonaCOMP(String nombre) {
		this.nombre = nombre;
	}

	public void leeLibro(LibroCOMP l) {
		System.out.println(nombre + " está leyendo el libro" + l.toString());
	}
}

public class herenciaCOMP {
	public static void main(String[] args) {

		PersonaCOMP pepe = new PersonaCOMP("Pepe");
		LibroCOMP quijote = new LibroCOMP("El quijote", 100);

		pepe.leeLibro(quijote);
	}

}
