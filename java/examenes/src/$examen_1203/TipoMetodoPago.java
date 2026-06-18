package $examen_1203;

public enum TipoMetodoPago {

	TARJETA(2.5), TRANSFERENCIA(1), PAYPAL(3.2);

	private double comision;

	// const
	private TipoMetodoPago(double comision) {
		this.comision = comision;
	}

	// getter
	public double getComision() {
		return comision;
	}

	// metodos
	public double calcularTotal(double importe) {
		importe += importe * getComision() / 100;
		System.out.printf("Pago con importe %.2f\n", importe);
		return importe;
	}
}
