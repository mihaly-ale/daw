package $examen1203;

abstract class MetodoPago {

	TipoMetodoPago tipoMP;
	private Usuario usuario;

	// const
	public MetodoPago(TipoMetodoPago tipoMP, Usuario usuario) {
		this.tipoMP = tipoMP;
		this.usuario = usuario;
	}
	

	abstract boolean comprobarSaldo(double cantidad);

	void pagar(double cantidad) {
		if (comprobarSaldo(cantidad)) {
			usuario.descontar(tipoMP.calcularTotal(cantidad));
		} else {
			throw new ValidarSaldoCuenta("saldo insuficiente");
//			System.out.println("no pago realizado");
		}
	}

	// getters, setters
	public TipoMetodoPago getTipoMp() {
		return tipoMP;
	}

	public void setTipoMp(TipoMetodoPago tipoMP) {
		this.tipoMP = tipoMP;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
