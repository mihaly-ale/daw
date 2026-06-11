package UT03_T02_02_MAQUINAEXPENDEDORA;

public class Snack extends Producto {
	
	private boolean sinGluten;

	// const
	public Snack(String nombre, int precioCentimos, boolean sinGluten) {
		super(nombre, precioCentimos);
		this.sinGluten = sinGluten;
	}

	public String imprimir() {
		return super.imprimirBasico().toString() + " {sin gluten = " + tipo() + " }";
	};

	@Override
	public String tipo() {
		return this.getClass().getSimpleName();
	}

	public String isSinGluten() {
		return sinGluten == true ? "si" : "no";
	}	
}
