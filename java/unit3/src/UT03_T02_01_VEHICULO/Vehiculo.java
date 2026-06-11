package UT03_T02_01_VEHICULO;

abstract class Vehiculo {
	
	private String matricula;
	private String color;
	private String modelo;
	private int velocidadMaxima;
	private int numeroRuedas;
	
	
	public Vehiculo(String matricula, String color, String modelo, int numeroRuedas, int velocidadMaxima) {
		this.matricula = Validaciones.validarMatricula(matricula);
		this.color = color;
		this.modelo = modelo;
		this.numeroRuedas = numeroRuedas;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	public void acelerar() {
		System.out.println("\tAcelerando ...");
	};
	
	public void frenar() {
		System.out.println("\tFrenando...");
	};
	
	public void cambiarVelocidad() {
		System.out.println("\tCambio velocidad ...");
	}

	@Override
	public String toString() {
		return "\t[matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", numero de ruedas=" + numeroRuedas + ", la velocidad maxima=" + velocidadMaxima;
	};
}

