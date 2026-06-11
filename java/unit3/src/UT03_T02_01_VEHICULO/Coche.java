package UT03_T02_01_VEHICULO;

import java.text.DecimalFormat;

public class Coche extends Vehiculo {

	private boolean asientosCuero, climatizador;

	private int pesoPlataforma;
	private int pesoCarroceria;
	private int pesoTotal;

	private float precioBase;
	private float precioFinal;

	// constructor
	public Coche(String matricula, String color, String modelo, boolean asientosCuero, boolean climatizador) {
		super(matricula, color, modelo, 4, 200);
		pesoPlataforma = 500;
		pesoCarroceria = 200;
		precioBase = 10000;
		this.asientosCuero = asientosCuero;
		this.climatizador = climatizador;
	}

	// métodos

	@Override
	public String toString() {
		return super.toString() + ", pesoTotal=" + getPesoTotal() + ", precioFinal=" + getPrecioFinal()
				+ isAsientosCuero() + isClimatizador() + "]";
	}

	// getters, setters
	public String isAsientosCuero() {
		return asientosCuero == true ? ", tiene asientos cuero" : ", no tiene asientos cuero";
	}

	public void setAsientosCuero(String booleano) {

		if (booleano == "si") {
			this.asientosCuero = true;
		}
	}

	public String isClimatizador() {
		return climatizador == true ? ", tiene climatizador" : ",  no tiene climatizador";
	}

	public void setClimatizador(String booleano) {
		if (booleano == "si") {
			this.climatizador = true;
		}
	}

	public int getPesoTotal() {
		int pesoAsientos = this.asientosCuero ? 50 : 0;
		int pesoClima = this.climatizador ? 20 : 0;

		pesoTotal = pesoCarroceria + pesoPlataforma + pesoAsientos + pesoClima;

		return pesoTotal;
	}

	public void setPesoTotal(int pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public float getPrecioFinal() {
		float precioAsientos = this.asientosCuero ? 1500 : 0;
		float precioClima = this.climatizador ? 2000 : 0;

		precioFinal = precioBase + precioAsientos + precioClima;

		return precioFinal;
	}

	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}

}
