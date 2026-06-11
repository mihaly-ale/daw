package polimorfismo;

abstract class Animal {
	private String nombre;
	private double peso;

	abstract public void moverse();
	// abstract public boolean esPesoSaludable(double peso, String especie);

	public Animal(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public void hacerSonido() {
		System.out.println("El animal hace un sonido.");
	}

	public void comidasDiarias() {
		System.out.println("El animal come dos veces al día.");
		// Perro → pienso
		// Gato → comida húmeda
	}
}

class Perro extends Animal {
	private String raza; // Labrador, Pastor Alemán,...
	private int nivelObediencia; // 1-10, representa la educación o adiestramiento

	public Perro(String nombre, double peso, String raza, int nivelObediencia) {
		super(nombre, peso);
		this.raza = raza;
		this.nivelObediencia = nivelObediencia;
	}

	// implementar el método abstracto - OBLIGACIÓN de implementación
	@Override
	public void moverse() {
		System.out.println("El perro camina or salta.");
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("El perro ladra.");
	}
}

class Gato extends Animal {
	private String colorPelaje; // blanco, atigrado, siamés,..
	private int nivelIndependencia; // (0-10)

	public Gato(String nombre, double peso, String colorPelaje, int nivelIndependencia) {
		super(nombre, peso);
		this.colorPelaje = colorPelaje;
		this.nivelIndependencia = nivelIndependencia;
	}

	@Override // OBLIGACIÓN de implementación
	public void moverse() {
		System.out.println("El gato se desplaza sigilosamente.");
	}
	
	@Override
	public void hacerSonido() {
		super.hacerSonido();
		System.out.println("\tEl gato maúlla.");
	}
	
	public void personalidad() {
		System.out.println("El gato tiene una personalidad fuerte.");
	}
}

class GatoSiames extends Gato {

	public GatoSiames(String nombre, double peso, String colorPelaje, int nivelIndependencia) {
		super(nombre, peso, colorPelaje, nivelIndependencia);
	}

	@Override
	public void hacerSonido() {
		System.out.println("El gato maúlla (Siames)");
	}

	@Override
	public void personalidad() {
		System.out.println("El siamés es muy sociable.");
	}
}

public class polimorfismo {
	public static void main(String[] args) {
		// Perro a1 = new Perro(); --> No es polimorfismo
		// Gato a2 = new Gato();

		System.out.println("*** 1 ***\n--------");
		// Polimorfismo por referencia (upcasting)
		// Referencia: Animal, Objeto: Perro, Gato
		Animal a1 = new Perro("Kira", 50, "Labrador", 2);
		Animal a2 = new Gato("Michi", 7, "Atigrado", 4);
		// NOTE: los métodos definidos en Perro/Gato NO se pueden llamar desde a1/a2
		// los métodos de Animal que están sobreescritos en Perro/Gato se ejecutan según
		// el objeto real (runtime)
		// ↓↓↓
		// Polimorfismo por sobreescritura
		a1.hacerSonido(); // El perro ladra.
		a2.hacerSonido(); // El animal hace un sonido. El gato maúlla.
		// (Gato.hacersonido llama super.hacerSonido)

		System.out.println("\n*** 2 ***\n--------");

		// con la personalidad
		Gato a3 = new Gato("Muchi", 7, "Atigrado", 4); 
		a3.hacerSonido(); // El animal hace un sonido. El gato maúlla.
		a3.personalidad(); // El gato tiene una personalidad fuerte.

		Animal a4 = new Gato("Machi", 3, "Atigrado", 4);
		a4.hacerSonido(); // Polimorfismo: ejecuta Gato.hacerSonido()
		// a4.personalidad(); // NOTE:no se puede ejecutar un método, si la referencia
		// no tiene
		// ↓↓↓
		// => ERROR: The method personalidad() is undefined for the type Animal
		// Solución: para acceder a métodos propios de Gato, se debe hacer downcasting
		// ((Gato)a4).personalidad();
		// downcasting: breaks encapsulation, loss of type safety,
		// se debe hacer con seguridad
		System.out.println("***downcasting con seguridad - instanceof***");
		if (a4 instanceof Gato)
			((Gato) a4).personalidad();

		System.out.println("\n*** 3 ***\n--------");
		// this is after moverse and uncommnet GatoSiames
		Animal[] animales = {new Perro("Kira", 50, "Labrador", 2),
								new Gato("Michi", 7, "Atigrado", 4),
								new GatoSiames("Simi", 5, "Siamés", 7),
								new Perro("Wati", 50, "Pastor Aleman", 2)};
	
		for (Animal a : animales) {
			System.out.println("=> " + a.getClass().getSimpleName().toUpperCase());
			if (a instanceof Gato) {
				((Gato) a).personalidad();
			}

			a.hacerSonido();
			a.moverse();
			System.out.println("");
		} 
	}
}

//atigrado=cirmos, sigilosamente=lopakodva