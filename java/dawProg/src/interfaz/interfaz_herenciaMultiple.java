package interfaz;

import java.util.ArrayList;

// enum simple package-private (se ve en package interfaz;)
enum Alimento {
	CARNE("carne"), PESCADO("pescado"), HIERBA("hierba"), FRUTA("fruta"), GRANO("grano");

	private final String etiqueta;

	private Alimento(String etiqueta) {
		this.etiqueta = etiqueta;
	}
}

//interfaces
interface Comedor {
	void comer(Alimento alimento); // NOTE: implícitamente public y abstract
}

interface SerVivoX {
	default void respirar() { // NOTE: implícitamente public
		System.out.println("Respirando oxigeno ...");
	}
}

// IMPLEMENTACIONES DE INTERFACES

///class SerVivoBase implements SerVivoX, Comedor {
///	private final String nombre;
///
///	private ArrayList<Alimento> alimentosPermitidos = new ArrayList<>();
///
///	public SerVivoBase(String nombre) {
///		this.nombre = nombre;
///		alimentosPermitidos.add(Alimento.CARNE); // \
///		alimentosPermitidos.add(Alimento.PESCADO); // \
///		alimentosPermitidos.add(Alimento.HIERBA); // - NOTE: cada instancia con los mismos alimentos
///		alimentosPermitidos.add(Alimento.FRUTA); // / método comer tampoco tiene sentido
///		alimentosPermitidos.add(Alimento.GRANO); // /
///	}
///
///	@Override
///	public void comer(Alimento alimento) {
///		System.out.println(nombre + " está comiendo " + alimento);
///	}
///
///	public String getNombre() {
///		return nombre;
///	}
///}
///    SOLUCIÓN ↓↓↓

abstract class SerVivoBase implements SerVivoX, Comedor {
	private final String nombre;

	public SerVivoBase(String nombre) {
		this.nombre = nombre;
	}

	// método abstracto
	public abstract ArrayList<Alimento> alimentosPermitidos();

	@Override
	public void comer(Alimento alimento) {
		if (!alimentosPermitidos().contains(alimento)) {
			throw new IllegalArgumentException(nombre + " no puede comer " + alimento);
		}

		System.out.println(nombre + " está comiendo " + alimento);
	}
} // SerVivoBase

abstract class AnimalX extends SerVivoBase {
	private final String especie;

	public AnimalX(String especie, String nombre) {
		super(nombre);
		this.especie = especie;
	}
} // AnimalX

class GatoX extends AnimalX {

	public GatoX(String nombre) {
		super("gato", nombre); // llama super de AnimalX => SerVivoBase()
	}

	@Override // tiene obligación de implementar 'alimentosPermitidos'
	public ArrayList<Alimento> alimentosPermitidos() {
		ArrayList<Alimento> comida = new ArrayList<>();

		comida.add(Alimento.CARNE);
		comida.add(Alimento.PESCADO);

		return comida;
	}
} // GatoX

class Vaca extends AnimalX {

	public Vaca(String nombre) {
		super("vaca", nombre);
	}

	@Override
	public ArrayList<Alimento> alimentosPermitidos() {
		ArrayList<Alimento> comida = new ArrayList<>();

		comida.add(Alimento.HIERBA);
		comida.add(Alimento.GRANO);

		return comida;
	}

} // vaca

//class Cerdo extends Animal {
//	// con un constructor vayamos ✈️
//}

public class interfaz_herenciaMultiple {

	public static void main(String[] args) {
///		// con "class SerVivoBase implements SerVivoX, Comedor" (línea 29)
//		SerVivoBase simba = new SerVivoBase("Simba");
//		// NOTE: diseño fracasado (alimentosPermitidos es fijo en la clase más alta) 
//		simba.comer(Alimento.CARNE); // ✅
//		simba.comer(Alimento.GRANO); // "Simba está comiendo GRANO" ❌❌❌

///		// con "abstract class SerVivoBas ... "
/// 	// => comportamiento en la clase abstracta (comer con validación)
/// 	// => fuente de datos alimentoPermitidos (abstracto, se acalara en clases hijas)
		GatoX simba = new GatoX("Simba");
		simba.comer(Alimento.CARNE);
		// simba.comer(Alimento.GRANO); // ERROR: para la ejecución
		// SOLUCIÓN ↓↓↓

		AnimalX mabo = new Vaca("Mabo");

		try {
			simba.comer(Alimento.PESCADO);
			simba.comer(Alimento.HIERBA);

			mabo.comer(Alimento.CARNE);
			mabo.comer(Alimento.HIERBA);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ejecución continua");
	}
}
