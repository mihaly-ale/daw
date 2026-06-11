package movilOficina;

import movil.Movil;

public class MóvilEmpresarial {

	public static void main(String[] args) {
		Movil oficinaMovil = new Movil("HTC");
		// se puede crear un objeto de la clase Movil, porque la clase Movil es public
		// public class Movil { ...}
		
		System.out.println(oficinaMovil.verCaracteristicas());
		//  Marca: HTC
		//  Color: null
		//  Gama: null
	}
}

//ACCESS MODIFIERS IN JAVA
//------------------------
//	public → accessible from anywhere the class is visible.

//	private → accessible only inside the class.

//	protected → accessible in the same package and in subclasses.

//	no modifier → accessible only in the same package.
