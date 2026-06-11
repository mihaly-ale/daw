package herencia;

import java.util.ArrayList;

// class Libro
class LibroAGR {
	private String titulo;

	public LibroAGR(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
}

// class Persona
class PersonAGR {
	private String nombre;
	private ArrayList<LibroAGR> listaLibro = new ArrayList<>();

	public PersonAGR(String nombre) {
		this.nombre = nombre;
	}

	public void agregarLibro(LibroAGR libro) {
		listaLibro.add(libro);
	}

	public void quitarLibro(LibroAGR libro) {
		listaLibro.remove(libro);
	}

	public void leeLibro(LibroAGR l) {
		System.out.println(nombre + "está leyendo el libro " + l.getTitulo());
	}

	public void mostrarLibros() {
		System.out.println("Persona: " + nombre);
		if (listaLibro.isEmpty()) {
			System.out.println("  - Sin libros");
		} else {
			for (LibroAGR l : listaLibro) {

				System.out.println("  - " + l.getTitulo());
			}
		}
	} // mostrarLibroASSs
}

public class herenciaAGR {
	public static void main(String[] args) {

		PersonAGR pepe = new PersonAGR("Pepe");
		PersonAGR ana = new PersonAGR("Ana");
		LibroAGR quijote = new LibroAGR("El quijote");
		LibroAGR cienAnos = new LibroAGR("Cien años de soledad");

		// agregación
		pepe.agregarLibro(quijote); // el método debe implemntar en Persona
		pepe.agregarLibro(cienAnos); // el método debe implemntar en Persona

		// log
		System.out.println("***ANTES DEL REGALO***");
		pepe.mostrarLibros();
		ana.mostrarLibros();

		// regalo
		pepe.quitarLibro(cienAnos);
		ana.agregarLibro(cienAnos);

		// show again
		System.out.println("\n***DESPUES EL REGALO***");
		pepe.mostrarLibros();
		ana.mostrarLibros();

	}

}
