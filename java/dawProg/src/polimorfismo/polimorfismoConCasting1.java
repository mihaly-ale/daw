package polimorfismo;

// interfaz: 3 tipos de métodos
/// 1 - por defecto publico y abstracto
/// 2 - default - NOTE:sin cuerpo
/// 3 - estático  - utilidad

interface Movil {
	default void iniciar() {
		System.out.println("Iniciar con el Movil.");
	}

	void parar(); 
}

interface Energizado {
	default void iniciar() {
		System.out.println("Iniciar de Energizado.");
	}

	void parar();
}

interface SistemaComplejo extends Movil, Energizado {

	@Override
	default void iniciar() {
		// super.iniciar(); // super de cuál? ERROR: super reference is illegal in interface context
		Energizado.super.iniciar();
		Movil.super.iniciar();
		System.out.println("iniciar de SistemeComplejo");
	}

}

class Robot implements SistemaComplejo {

	public void girar() {
		System.out.println("Girando ...");
	}

	@Override
	public void parar() {
		System.out.println("Parando ...");
	}

}

public class polimorfismoConCasting1 {
	public static void main(String[] args) {
		Robot miR = new Robot();
		// una referencia de objeto se puede crear, pero un interface no se puede instancar

		miR.iniciar();
		miR.parar();
		miR.girar();
		
		SistemaComplejo miR2 = new Robot(); // Polimorfismo
		/// Tipo de referencia: SistemaComplejo, tipo runtime(object) Robot
		/// complicación -> SOLO referencia (upcasting? ✅, método? ❌)		
		// miR2.girar(); // ERROR: The method girar() is undefined for the type SistemaComplejo
		// SOLUCIÓN ↓↓↓
		
		((Robot)miR2).girar(); // puede lanzar error si casting no es válido
		
		if (miR2 instanceof Robot) {
			((Robot)miR2).girar();
		}
		
		if (miR2 instanceof Robot r) {
			r.girar();
		}
		
	}
}
