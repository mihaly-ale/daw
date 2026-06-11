package UT03_T02_01_VEHICULO;

public enum TipoCamion {
	
	LIGERO(120, 10), PESADO(90, 8), ARTICULADO(85, 6);
	private int velocidad;	
	private int numRuedas;
	
	private TipoCamion(int velocidad, int numRuedas) {
		this.velocidad = velocidad;
		this.numRuedas = numRuedas;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}	
	
	
	
	
}


