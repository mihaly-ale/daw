package herencia;


// class Libro
class LibroASS {
	private String titulo;

	public LibroASS(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}

// class Persona
class PersonaASS {
	private String nombre;

	public PersonaASS(String nombre) {
		this.nombre = nombre;
	}

	public void leeLibro(LibroASS l) {
		System.out.println(nombre + " está leyendo el el libro " + l.getTitulo());

	}
}

// MAIN para agregar los dos clases
public class herenciaASS {
	public static void main(String[] args) {

		PersonaASS pepe = new PersonaASS("Pepe");
		LibroASS quijote = new LibroASS("El quijote");

		// asociación 1:1 ," tiene un" - ambos objetos existen por si mismos
		pepe.leeLibro(quijote); // el método debe implemntar en PersonaAGR

	}

}
