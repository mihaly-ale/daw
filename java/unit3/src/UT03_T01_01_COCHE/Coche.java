package UT03_T01_01_COCHE;

import java.text.DecimalFormat;

public class Coche {

	// constructores
	public Coche() { // constructor por defecto
		pesoPlataforma = 500;
		pesoCarroceria = 200;
		precioBase = 10000;
		this.color = "Blanco";
	}

	public Coche(String color, boolean asientosCuero, boolean climatizador) { // constructor sobrecargado
		pesoPlataforma = 500;
		pesoCarroceria = 200;
		precioBase = 10000;
		this.color = color;
		this.asientosCuero = asientosCuero;
		this.climatizador = climatizador;
	}

	// atributos
	private String color;
	private boolean asientosCuero, climatizador;

	private int pesoPlataforma;
	private int pesoCarroceria;
	private int pesoTotal;

	private float precioBase;
	private float precioFinal;

	// métodos
	public String dimeDatosGenerales() {

		DecimalFormat formato = new DecimalFormat("#,###.00\u20AC");
		
		return "\tEl color que tengo es: " + this.color + "\n\tEl coche tiene asientos de "
				+ (isAsientosCuero() == true ? "cuero" : "serie") + "\n\tEl coche "
				+ (isClimatizador() == true ? "incorpora climatizador" : "lleva aire acondicionado") + "\n\tPeso: "
				+ getPesoTotal() + "Kg" + "\n\tPrecio Total: " + formato.format(getPrecioFinal());
	}

	// getters, setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAsientosCuero() {
		return asientosCuero;
	}

	public void setAsientosCuero(String booleano) {

		if (booleano == "si") {
			this.asientosCuero = true;
		}
	}

	public boolean isClimatizador() {
		return climatizador;
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
