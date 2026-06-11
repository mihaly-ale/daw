package tema3;

class Objeto {
	int numero;
}

public class UT02_T03_E13 {
	public static void main(String[] args) {

		Objeto x = new Objeto();
		Objeto y = new Objeto();
		x.numero = 30;
		y.numero = 60;

		System.out.println("x.numero=" + x.numero + " y.numero=" + y.numero);
		// x.numero = 30, y.numero = 60
		
		// Asignación
		x = y;
		System.out.println("x.numero=" + x.numero + " y.numero=" + y.numero);
		// x.numero = 60, y.numero = 60
		
		x.numero = 90;
		System.out.println("x.numero=" + x.numero + " y.numero=" + y.numero);
		// x.numero = 90, y.numero = 60 => porque es 90?
		// los dos objetos (x, y) apuntan al mismo lugar en la memoria,
		// así que un cambio de atributo de cualquiera de los dos afecta el otro
	}
}
