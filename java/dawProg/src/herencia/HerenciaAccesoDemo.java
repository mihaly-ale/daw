package herencia;

class ClaseA {
	// 1.
//	public int x = 10;
	private int x = 10;

	public int getX() {
		return x;
	}

	public int getXClaA() {
		return x;
	}

	// 2.4
	@Override
	public String toString() {
		return "ClaseA [x=" + x + "]";
	}
}// clase A

class ClaseB extends ClaseA {
	// 1. 
//	public int x = 20;
	private int x = 20;

	// 2.1 
	public int getX() {
		return x;
	}

	
	public int getXCLaB() {
		return x;
	}

	// 2.4
	@Override
	public String toString() {
		return super.toString() + "ClaseB [x=" + x + "]";
	}
} // clase B

class ClaseC extends ClaseB {
	private int x = 30;

	public String devolverValores() {
		// 1.
		// -- publicos son los atributos - metod devuelva string
//		return " ClaseC " + this.x + " - ClaseB: " + super.x + " - ClaseA: " + ((ClaseA)this).x;
//		return " ClaseC " + ((ClaseA) this).x + " - ClaseB: " + ((ClaseA) this).x + " - ClaseA: " + ((ClaseA) this).x;
		// viola encapsulamiento, porque los atributos son publicos

		// 2.1
		// -- utilizar un getter: encapsulamiento ✔️
		// como acceder Clase A ???
		// return "ClaseC: " + this.x + " - ClaseB: " + super.getX(); 
		// sin getter no se puede acceder un atributo privado

		// 2.2
		// -- acceder "x" de ClaseA despues añadido su getter
		// return "ClaseC: " + this.x + " - ClaseB: " + super.getX() + " - ClaseA: " +
		// ((ClaseA) this).getX();
		// un cast: cast "this" a ClaseA y utilizar su getter - Por qué??? =>
		// el getter es sobreescrito en el clase B => más Soluciónes: 2.3 o 2.4

		// 2.3 sobreescribir los metodos en cada nivel
		// return "ClaseC: " + this.x + " - ClaseB: " + super.getXCLaB() + " - ClaseA: "
		// + super.getXClaA();
		
		return ""; // sólo para satisfacer el valor de retorno, no parte del código

	}

	// 2.4 más fácil utilizar el método toString

	@Override
	public String toString() {
		return super.toString() + "ClaseC [x=" + x + "]";
	}

} // clase C

public class HerenciaAccesoDemo {

	public static void main(String[] args) {

		ClaseC obj = new ClaseC();
		System.out.println(obj.devolverValores());
		System.out.println(obj.toString());
	}
}
