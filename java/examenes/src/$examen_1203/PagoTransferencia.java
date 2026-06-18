package $examen_1203;

import java.time.LocalDate;

public class PagoTransferencia extends MetodoPago {

	private String ibanDestino;

	// constr
	public PagoTransferencia(Usuario usuario, String ibanDestino) {
		super(TipoMetodoPago.TRANSFERENCIA, usuario);
		this.ibanDestino = ibanDestino;
	}

	@Override
	boolean comprobarSaldo(double cantidad) {
		System.out.println("pago con transferencia");
		return getUsuario().tieneSaldoSuficiente(cantidad);
	}

}
