package $examen1203_redo;

import java.time.LocalDate;

public class PagoTarjeta extends MetodoPago {
	private String numeroTarjeta;
	private LocalDate fechaCaducidad;
	
	
	public PagoTarjeta(TipoMetodoPagoX tipoMp, UsuarioX usuario, String numeroTarjeta, LocalDate fechaCaducidad) {
		super(tipoMp, usuario);
		this.numeroTarjeta = numeroTarjeta;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	@Override
	void pagar(double cantidad) {
		
		if(getFechaCaducidad().isBefore(LocalDate.now())) {
System.out.println("Trajeta caducada, no se puede pagar.");			
		} else {
			usuario.descontar(super.getTipoMp().calcularTotal(cantidad));
		}
		
	}
	
	
	@Override
	void comprobarSaldo(double cantidad) {		
		usuario.tieneSaldosuficiente(cantidad);		
	}
	

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	

}
