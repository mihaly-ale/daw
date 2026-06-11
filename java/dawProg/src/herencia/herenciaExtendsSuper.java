package herencia;

class Clase1 { // heredado de Object, por eso da métodos de Object (toString(), void(), etc)
	private int miVar1 = 11;
	private int miVar2 = 22;

	// this is with super
	public Clase1(int miVar1, int miVar2) {
		this.miVar1 = miVar1;
		this.miVar2 = miVar2;
	}

	public Clase1() { // add to function after super
	}

	@Override
	public String toString() {
		return "Clase1 [miVar1=" + miVar1 + ", miVar2=" + miVar2 + "]";
	}

	public String miMetodoClase1() {
		return "El valor de mi miVar2 es " + miVar2;
	};
};

// extends:  class Dog extends Animal
// class Clase2 sin extends solo es una clase independente y no existe herencia con Clase1
class Clase2 extends Clase1 {
	private int miVar3;

	// antes de herencia (extends)
//	public Clase2(int miVar3) { 
//		this.miVar3 = miVar3;
//	}
//	@Override
//	public String toString() {
//		return "Clase2 [miVar3=" + miVar3 + "]";
//	}

	public Clase2(int miVar3, int miVar2, int miVar1) { // con super
		super(miVar1, miVar2);// referncia a padre, SIEMPRE TIENE QUE SER LA PRIMERA
		this.miVar3 = miVar3;
	}

	@Override
	public String toString() {
		return super.toString() + " Clase2 [miVar3=" + miVar3 + "]";
	}

	@Override
	public String miMetodoClase1() {
		return super.miMetodoClase1() + ". +  Comportamiento propio.";
	}
}

public class herenciaExtendsSuper {

	public static void main(String[] args) {
// antes de super		
//		Clase1 obj1 = new Clase1();
//		Clase2 obj2 = new Clase2(33);
		// System.out.println(obj1.toString()); // sin un método personalizado (@override) visualiza la direccion de la memoria - hereda el método toString() de Object
		// System.out.println(obj1.miMetodoClase1()); // El valor de mi miVar2 es ...
		
		
// con super
		// Clase2 -- super --> Clase1 - con el super su atributos son 3
		Clase2 obj2 = new Clase2(11, 22, 33);
		System.out.println(obj2.miMetodoClase1()); // heredado el metodo con el super + muestra su propio método

		Clase1 obj1 = new Clase1();
		System.out.println(obj1.miMetodoClase1()); // El valor de mi ... 22. - atributos tienen valores por defecto.

		// System.out.println(obj2.toString()); // Clase2 [miVar3=33] // sin super

		System.out.println("\n*****con super***** obj2:"
				+ "\n");
		System.out.println(obj2.toString()); // Clase1 [miVar1=11, miVar2=22]Clase2 [miVar3=33]
	}

}
