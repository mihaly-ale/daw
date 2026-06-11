package UT03_T02_01_VEHICULO;

import java.util.Objects;

public class Camion extends Vehiculo {

	private String capacidadCarga;
	private TipoCamion tipo;

	public Camion(String matricula, String color, String modelo, String tipo, String capacidadCarga) {
		super(matricula, color, modelo, getNumeroRuedas(tipo), getVelocidadMaxima(tipo));
		this.capacidadCarga = Validaciones.comprobarNuloVacio(capacidadCarga, "capacidad");
		this.tipo = Enum.valueOf(TipoCamion.class, tipo.toUpperCase());
	}

	// getters
	private static int getNumeroRuedas(String tipo) {
		TipoCamion camion = null;

		try {
			camion = Enum.valueOf(TipoCamion.class, tipo.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Error al crear el camion: el tipo debe ser ligero, articulado o pesado.");
		}

		return camion.getNumRuedas();
	};

	private static int getVelocidadMaxima(String tipo) {
		TipoCamion camion = null;

		try {
			camion = Enum.valueOf(TipoCamion.class, tipo.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Error al crear el camion: el tipo debe ser ligero, articulado o pesado.");
		}

		return camion.getVelocidad();
	};
	

	// metodos
	@Override
	public String toString() {
		return super.toString() + ", capacidadCarga= " + capacidadCarga + "]";
	};

	public void descargarPeso() {
		System.out.println("\tDescargar peso ...");
	};
}
