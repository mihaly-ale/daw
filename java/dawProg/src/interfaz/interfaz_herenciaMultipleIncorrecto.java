package interfaz;

// This implemantation is based on  interfaz_herenciaMultiple.java, but it is only to showcase a bad design, hence it feeds from the correct version (ALimento, Comedor)

import java.util.ArrayList;

//enum Alimento y interface Comedor es de interfaz_herenciaMultiple.java
/// classes privadas de paquete interfaz;

interface SerVivoY {
	default void respirar() {
		System.out.println("Respirando oxigeno ...");
	}
}

//IMPLEMENTACIONES DE INTERFACES

// NOTE: una implementación fracasada sin utilizar clase abstracta
/// ver: interfaz.interfaz_herenciaMultiple linea 27
abstract class SerVivoBaseErroneo implements SerVivoY, Comedor {
	// método comer es de Comedor (interfaz_herenciaMultiple.java)
	private final String nombre;

	public SerVivoBaseErroneo(String nombre) {
		this.nombre = nombre;
	}

	public abstract ArrayList<Alimento> alimentosPermitidos();

	public String getNombre() {
		return nombre;
	}
} // servivobaseerroneo

abstract class AnimalXX extends SerVivoBaseErroneo {

	public AnimalXX(String especie) {
		super(especie);
	}
}

class GatoXX extends AnimalXX {

	public GatoXX(String especie) {
		super(especie);
	}

	@Override
	public void comer(Alimento alimento) {
		ArrayList<Alimento> comida = alimentosPermitidos();

		if (!comida.contains(alimento)) {
			throw new IllegalArgumentException(super.getNombre() + " no puede comer " + alimento);
		}

		System.out.println(super.getNombre() + " come " + alimento);

	}

	@Override
	public ArrayList<Alimento> alimentosPermitidos() {
		ArrayList<Alimento> comida = new ArrayList<>();

		comida.add(Alimento.CARNE);
		comida.add(Alimento.PESCADO);

		return comida;
	}

} // gatoxx

class VacaXX extends AnimalXX {

	public VacaXX(String especie) {
		super(especie);
	}

	// NOTE: duplicado - ver línea 49
	/// cada clase tiene que implementar los métodos
	/// más fácil encotrar el error, pero el mantenemiento es una pesadilla
	/// en caso de la implementación mala de validación hay que cambiar cada método 👎👎👎
	@Override
	public void comer(Alimento alimento) {
		ArrayList<Alimento> comida = alimentosPermitidos();

		if (!comida.contains(alimento)) {
			throw new IllegalArgumentException(super.getNombre() + " no puede comer " + alimento);
		}

		System.out.println(super.getNombre() + " come " + alimento);

	}

	// NOTE: duplicado - ver línea 61
	@Override
	public ArrayList<Alimento> alimentosPermitidos() {
		ArrayList<Alimento> comida = new ArrayList<>();

		comida.add(Alimento.HIERBA);
		comida.add(Alimento.GRANO);

		return comida;
	}

} // vacaxx

//class CerdoXX extends AnimalXX {
//	// pide implemtación de métodos (2), constructor
//}


public class interfaz_herenciaMultipleIncorrecto {

	public static void main(String[] args) {

		AnimalXX simba = new GatoXX("Simba");
		AnimalXX mabo = new VacaXX("Mabo");

		try {
			simba.comer(Alimento.CARNE);
			simba.comer(Alimento.HIERBA);

			mabo.comer(Alimento.CARNE);
			mabo.comer(Alimento.HIERBA);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
