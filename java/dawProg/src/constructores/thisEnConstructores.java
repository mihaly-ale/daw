package constructores;

public class thisEnConstructores {
	public static void main(String[] args) {

		// Crear instancias de Persona
		Persona p1 = new Persona("Ana", "12345678A");
		Persona p2 = new Persona("Miguel", "87654321B", "987-654-321");
		
		System.out.println(p2.toString());
		// Persona [nombre=Miguel, dni=null, telefono=987-654-321] -> dni es null, porque dni=dni no tiene efecto
		System.out.println(p1.toString());
		// Persona [nombre=Ana, dni=null, telefono=null] -> telefono se pasa como null
	}
}

// Top-level class Persona
class Persona {
	private String nombre;
	private String dni;

	private String telefono;

	// Constructor sin telefono
	public Persona(String nombre, String dni) {
		this(nombre, dni, null); // llamar otro constructor - sobrecarga de constructor
	}

	// Constructor con telefono
	public Persona(String nombre, String dni, String tel) {
		this.nombre = nombre; // reutiliza el nombre de la variable
		dni = dni; // WARINING: the assignment to variable dni has no effect.
		telefono = tel; // no hay conflicto de los nombres
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}

}
