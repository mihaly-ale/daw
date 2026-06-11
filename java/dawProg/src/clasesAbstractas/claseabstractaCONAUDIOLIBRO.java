package clasesAbstractas;

// LIBRO
abstract class LibroX { // impide instanciación de los objetos
	private String titulo;
	private String autor;

	public LibroX(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	// ABSTRACTOS - exitysen en clases abstractos, como plantillas de implementar en clases concretas
	abstract void prestar();

	abstract void mostrarInfoDetallada();

	// CONCRETO
	public String getTitulo() { // CON EL ABSTRACT SE LLAMA MÉTODO CONCRETO - tiene cuerpo
		return titulo;
	}
}

// LibroFisico
class LibroFisicoX extends LibroX { // SI SU PADRE ES UN CLASE ABSTRACTO, LOS MÉTODOS ABSTRACTOS TINE QUE
									// IMPLEMENTAR - OBLIGATORIO

	private int numPaginas;

	LibroFisicoX(String titulo, String autor, int numPaginas) {
		super(titulo, autor);
		this.numPaginas = numPaginas;
	}

	// ABSTRACTOS - desde el Source (Override/Implement Methods) or de menu local

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
abstract class LibroDigitalX extends LibroX {
	private int tamañoArchivo; // Expresado en KB (Solo texto, 2MB; con ilustraciones 10MB; ilustraciones
								// pesadas 200MB)

	public LibroDigitalX(String titulo, String autor, int tamañoArchivo) {
		super(titulo, autor);
		this.tamañoArchivo = tamañoArchivo;
	}

	// ABSTRACTAS - no más mostraInfoDetallada - baja un nivel más
	@Override
	void prestar() {
		System.out.println("El libro digital" + this.getTitulo() + " ha sido prestado");
	}

	// CONCRETOS
	public int getTamañoArchivo() {
		return tamañoArchivo;
	}
}


// AudioLibro
class AudioLibro extends LibroDigitalX{
	private String narrador;
	private int duracionMinutos;
	
	public AudioLibro (String titulo, String autor, int tamañoArchivo, String narrador, int duracionMinutos) {
		super(titulo, autor, tamañoArchivo);
		this.narrador = narrador;
		this.duracionMinutos = duracionMinutos;		
	}
	
	@Override
	void mostrarInfoDetallada() {
		System.out.println("Libro audio - Titulo: " + this.getTitulo() + " , tiene " + duracionMinutos + " minutos" + " , tiene " + this.getTamañoArchivo() + " tamaño" +  ", narrado por " + narrador);
	}
}

//******** PUBLIC
public class claseabstractaCONAUDIOLIBRO {

	public static void main(String[] args) {

		AudioLibro l2 = new AudioLibro("Cien Años de Soledad", "Gabriel García Márquez", 2, "Joaquim", 120);
		System.out.println(l2.getTitulo());
		l2.mostrarInfoDetallada();
		l2.prestar();

	}
}
