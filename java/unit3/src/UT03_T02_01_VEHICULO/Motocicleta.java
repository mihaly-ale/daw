package UT03_T02_01_VEHICULO;

public class Motocicleta extends Vehiculo {

	private static final int MOTO_NUM_RUEDAS = 2;
	private String cilindrada;

	public Motocicleta(String matricula, String color, String modelo, String cilindrada) {
		super(matricula, color, modelo, MOTO_NUM_RUEDAS,
				calcularVelocidadMaxima(Validaciones.comprobarNuloVacio(cilindrada, "cilindrada")));
		this.cilindrada = cilindrada.trim();
	}

	public void moverManillar() {
		System.out.println("\tmoverManillar ...");
	};

	private static int calcularVelocidadMaxima(String cilindrada) {
		int velocidad = 0;
		int parsedCilindrada = Integer.parseInt(cilindrada);

		if (parsedCilindrada == 125) {
			velocidad = 110;
		} else if (parsedCilindrada > 125 && parsedCilindrada <= 500) {
			velocidad = 180;
		} else if (parsedCilindrada > 500 && parsedCilindrada < 1000) {
			velocidad = 280;
		} else {
			throw new IllegalArgumentException("Error: cilindrada fuera de rango.");
		}

		return velocidad;
	}

	@Override
	public String toString() {
		return super.toString() + ", cilindrada=" + cilindrada + "]";
	};
}
