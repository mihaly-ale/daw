package UT03_T02_02_MAQUINAEXPENDEDORA;

public class Sandwich extends Producto {

	private String tipoPan;

	// const
	public Sandwich(String nombre, int precioCentimos, String tipoPan) {
		super(nombre, precioCentimos);
		
		if (tipoPan == null || tipoPan.isBlank()) {
			this.tipoPan = "blanco";
		} else {
			this.tipoPan = tipoPan;			
		}
	}

	public String imprimir() {
		return super.imprimirBasico().toString() + " {pan = " + tipo() + " }";
	};

	@Override
	public String tipo() {		
		return tipoPan;
	}
}