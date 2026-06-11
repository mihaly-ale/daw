package clasesAbstractas;


// LIBRO
abstract class Libro { // impide instanciación de los objetos
	private String titulo;
	private String autor;

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	// CON LA PALABRA CLAVE ESTOS LLAMAN MÉTODOS ABSTRACTOS
	abstract void prestar();

	abstract void mostrarInfoDetallada();

	public String getTitulo() { // CON EL ABSTRACT SE LLAMA MÉTODO CONCRETO - tiene cuerpo
		return titulo;
	}
}

// LibroFisico
class LibroFisico extends Libro { // SI SU PADRE ES UN CLASE ABSTRACTO, LOS MÉTODOS ABSTRACTOS TINE QUE
									// IMPLEMENTAR - OBLIGATORIO

	private int numPaginas;

	LibroFisico(String titulo, String autor, int numPaginas) {
		super(titulo, autor);
		this.numPaginas = numPaginas;
	}

	// abstractos - desde el Source (Override/Implement Methods) or de menu local

	@Override
	void prestar() {
		System.out.println("El libro fisicio " + this.getTitulo() + " ha sido prestado");
	}

	@Override
	void mostrarInfoDetallada() {
		System.out.println("Libros fisicio - Titulo: " + this.getTitulo() + " , tiene " + numPaginas + " páginas");
	}

}

// LibroDigital
class LibroDigital extends Libro {
	private int tamañoArchivo; // Expresado en KB (Solo texto, 2MB; con ilustraciones 10MB; ilustraciones
								// pesadas 200MB)

	public LibroDigital(String titulo, String autor, int tamañoArchivo) {
		super(titulo, autor);
		this.tamañoArchivo = tamañoArchivo;
	}

	// ABSTRACTAS
	@Override
	void prestar() {
		System.out.println("El libro digital" + this.getTitulo() + " ha sido prestado");
	}

	@Override
	void mostrarInfoDetallada() {
		System.out.println("Libros fisicio - Titulo: " + this.getTitulo() + " , tiene " + tamañoArchivo + " tamaño.");
	}
}

//******** PUBLIC
public class claseabstractaSINAUDIOLIBRO {

	public static void main(String[] args) {
// estos con el ebstrcat no van a funcionar
//      Libro l1 = new Libro("Don Quijote", "Miguel de Cervantes");
//		Libro l2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

		LibroFisico l1 = new LibroFisico("Don Quijote", "Miguel de Cervantes", 200);
		LibroDigital l2 = new LibroDigital("Cien Años de Soledad", "Gabriel García Márquez", 140);
		System.out.println(l1.getTitulo() + " - " + l2.getTitulo());
		System.out.println("abstractos de un libro fisico");
		l1.mostrarInfoDetallada();
		l1.prestar();

	}
}
