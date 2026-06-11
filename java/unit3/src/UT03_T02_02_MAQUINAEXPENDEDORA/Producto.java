package UT03_T02_02_MAQUINAEXPENDEDORA;

abstract class Producto implements Vendible{
	private String nombre;
	private int precioCentimos;

	//const
	public Producto(String nombre, int precioCentimos) {
		this.nombre = nombre;
		this.precioCentimos = precioCentimos;
	}

	// metodos
	public abstract String tipo();
	
	public String imprimirBasico() {
		return tipo() +  "{nombre=" + nombre + ", precio=" + String.format("%.2f", precioCentimos/100f) + "€"
				+ ""
				+ "}";
	};

	//getters, setters	
	public String nombre() {
		return nombre;
	}

	public int precioCentimos() {
		return precioCentimos;
	}
}
