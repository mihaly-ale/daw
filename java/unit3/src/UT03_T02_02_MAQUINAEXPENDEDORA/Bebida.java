package UT03_T02_02_MAQUINAEXPENDEDORA;

public class Bebida extends Producto {

	private boolean conAzucar;

	// const
	public Bebida(String nombre, int precioCentimos, boolean conAzucar) {
		super(nombre, precioCentimos);
		this.conAzucar = conAzucar;
	}

	public String imprimir() {
		return super.imprimirBasico().toString() + " {azúcar = " + tipo() + " }";
	};

	@Override
		public String tipo() {
		return this.getClass().getSimpleName();
	}

	public String isConAzucar() {
		return conAzucar == true ? "si" : "no";
	}
}
