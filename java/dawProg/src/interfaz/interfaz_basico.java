package interfaz;

// NOTE: INTERFACE
// permite herencia múltiple
/// class implements Interface1, Interface2, InterfaceN ...
// por defecto es abstracta (Interface1 i = new Interface1) - ❌
interface SerVivo {

	// NOTE: un campo (field) son por defecto público, estático y final
	/// efectivamente son CONSTANTES => mayùscula!!!
	String ALIMENTO_PLANTAS = "plantas";
	String ALIMENTO_CARNE = "carne";
	String ALIMENTO_ZEBRA = "zebra";

	// NOTE: METODOS de Interface
	/// 1 - por defecto publico y abstracto
	/// Una clase que implementa una interfaz tiene que implementar el método
	/// (a menos que la clase sea abstracta)
	void comer(String alimento);

	/// 2 - Método default (SOLO desde JAVA 8)
	// ==> puede tener cuerpo
	default void respirar() {
		System.out.println("Respirando oxigeno ...");
	};

	/// 3 - Método static - utilidades de la interfaz
	// se llaman desde la interface (SerVivo.descGeneral())
	static void desccGeneral() {
		System.out.println("Todos los seres vivos realizan las funciones vitales.");
	};

}

class Persona implements SerVivo {

	private final String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override // override Object.toString()
	public String toString() {
		return "Persona {" + "nombre = '" + nombre + '\'' + '}';
	}

	@Override // override SerVivio.comer() - abstracto =>
				// NOTE: Error de compilación si no está implementado
	public void comer(String alimento) {
		System.out.println(nombre + " está comiendo " + alimento.toLowerCase() + " con cubiertos.");
		System.out.println(nombre + " puede comer " + ALIMENTO_CARNE + ".");
		// mejor de ser explicito: SerVivo.ALIMENTO_PLANTAS)
		// se puede ver aqui, porque es estático
		// mejor utilizar un clase separado o enum
	}

	@Override // override default SerVivo.respirar()
	public void respirar() {
		System.out.println("Esta persona respira profundamente antes de comer.");
	}
}

class Animal implements SerVivo {

	private final String especie;

	public Animal(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Animal {" + "especie = '" + especie + '\'' + '}';
	}

	@Override
	public void comer(String alimento) {
		System.out.println(especie + " está comiendo " + alimento + ".");
	}

	// NOTE: default: comparte comportamiento OR se puede sobreescribir (si un
	// coportamiento diferente es necesario)
	/// si no es default, el método es es abstracto => hay que implementralo
//	@Override 
//	public void respirar() { 
//		System.out.println("Respirando oxigeno ...");
//
//	}
}

public class interfaz_basico {
	public static void main(String[] args) {

		SerVivo leon = new Animal("León");
		SerVivo perro = new Animal("Perro");
		SerVivo maria = new Persona("María");
		SerVivo juan = new Persona("Juan");

		System.out.println("*** leon ***");
		System.out.println(leon.toString());
		leon.comer("carne");
		leon.comer(SerVivo.ALIMENTO_ZEBRA);
		leon.respirar(); // desde el método default de la interfaz
		System.out.println("\n*** María *** ");
		System.out.println(maria.toString());
		maria.comer("Plátanos");
		maria.respirar(); // sobreescrito

		System.out.println("\n*** los seres vivos ***");

		SerVivo.desccGeneral();
	}
}

// JAVA API italics are interfaces