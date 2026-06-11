package polimorfismo;

class Personaje {
	public void atacar() {
		System.out.println("El personaje ataca.");
	}
} // Personaje

class Guerrero extends Personaje {

	@Override
	public void atacar() {
		System.out.println("El guerrero ataca con su espada.");
	}

	public void modoFuria() {
		System.out.println("El guerrero entra en modo furia y duplica su fuerza.");
	}
} // Guerrero

class Mago extends Personaje {
//
//	@Override
//	public void atacar() {
//		super.atacar();
//		System.out.println("El mago lanza un hechizo de ataque mágico.");
//	}

	public void lanzarHechizo() {
		System.out.println("El mago lanza un hechizo especial.");
	}
} // Mago

public class polimorfismoConCasting2 {
	public static void main(String[] args) {

		// Refundición de los objetos
		// ***************
		Mago m = new Mago(); // no es polomorfismo

		m.atacar(); // método llama super
		m.lanzarHechizo();

		// UPCASTING
		System.out.print("\n****\nUPCASTING\n Personaje\n ↑↑↑\n Mago\n\n");
		Personaje p = m; // = Personaje p = new Mago();  NOTE:polimorfismo - UPCASTING
		System.out.println(p instanceof Mago); // true
		
		p.atacar(); // metodo del mago, realiza el enlazo dinamico *
		// Personaje tiene el método ✅ (no error de compilación)
		// en el tiempo de ejecución (runtime) => Objeto es Mago => llama el método más específico		
		
		/// p.lanzarHechico(); // ERROR: The method lanzarHechico() is undefined for the type Personaje 
		// Personaje no declara el método lanzarHechizo - el compilador para la ejecución
		
		/// Clean mental model
		/// 1. Compiler → “Is this method callable from this reference type?” (restriction)
		/// 2. Runtime → “Which version of this method should I execute?” (implementation)
		System.out.println("****");

		// DOWNCASTING
		Personaje p2 = new Guerrero(); // NOTE:polimorfismo - UPCASTING
		System.out.println(p2 instanceof Guerrero); // true
		// Guerrero g = p2; // ERROR: Type mismatch: cannot convert from Personaje to Guerrero
		/// No todos los Personajes son Guerreros! Guerrero g = new Personaje();
		/// El compilador solo se ve el tipo de referencia.
		 
		Guerrero g = (Guerrero) p2; // NOTE: DOWNCASTING ocurre aqui
		/// puede lanzar un error si p2 no se puede convertir en Guerrero
		
		// NOTE: downcasting seguro
		// 1
		if (p2 instanceof Guerrero) {
			g = (Guerrero) p2;
			g.atacar();
		}
		
		// 2
		if (p2 instanceof Guerrero g1) { // JAVA moderno
			g1.atacar();
		}

	}
}

// * enlazo dinámico = dynamic binding
/*
 * Method overriding is one of the ways in which Java supports Runtime
 * Polymorphism. Dynamic method dispatch is the mechanism by which a call to an
 * OVERRIDEN METHOD (!!!) is resolved at run time, rather than compile time.
 * 
 * When an overridden method is called through a superclass reference, Java
 * determines which version(superclass/subclasses) of that method is to be
 * executed based upon the type of the object being referred to at the time the
 * call occurs. Thus, this determination is made at run time.
 * ...
 * 
 * https://www.geeksforgeeks.org/java/dynamic-method-dispatch-runtime-polymorphism-java/
 */

