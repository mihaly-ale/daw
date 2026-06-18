package $examen_1203_redo;

public enum TipoMetodoPagoX {

	TARJETA(2.5), TRANSFERENCIA(1), PAYPAL(3.2);

	final double comison;

	private TipoMetodoPagoX(double comison) {
		this.comison = comison;
	}

	public double calcularTotal(double importe) {	
		importe += importe * getComison() / 100 ;
		System.out.printf("%.2f%n", importe);
		return importe; 
	}

	public double getComison() {
		return comison;
	}
}
