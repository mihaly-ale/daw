package $examen1203_redo;

public class PagoTransferencia extends MetodoPago {

	String ibanDestino;

	public PagoTransferencia(TipoMetodoPagoX tipoMp, UsuarioX usuario) {
		super(tipoMp, usuario);
	}

	@Override
	void pagar(double cantidad) {
		usuario.descontar(super.getTipoMp().calcularTotal(cantidad));
	}

	@Override
	void comprobarSaldo(double cantidad) {
		 usuario.tieneSaldosuficiente(cantidad);

	}

}
