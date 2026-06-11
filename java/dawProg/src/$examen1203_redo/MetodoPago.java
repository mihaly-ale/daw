package $examen1203_redo;

public abstract class MetodoPago {
	
	TipoMetodoPagoX tipoMp;
	UsuarioX usuario;
	
	public MetodoPago(TipoMetodoPagoX tipoMp, UsuarioX usuario) {
		
		if (tipoMp == null) {
            throw new excepcionPersonalizada("El tipo de método de pago no es válido");
        }
		
		this.tipoMp = tipoMp;
		this.usuario = usuario;
	}
	
	abstract void pagar(double cantidad);
	
	abstract void comprobarSaldo(double cantidad);

	public TipoMetodoPagoX getTipoMp() {
		return tipoMp;
	}

	public void setTipoMp(TipoMetodoPagoX tipoMp) {
		this.tipoMp = tipoMp;
	}

	public UsuarioX getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioX usuario) {
		this.usuario = usuario;
	}
	
	

}
