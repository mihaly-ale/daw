package $examen1203;

import java.time.LocalDate;

public class PagoTarjeta extends MetodoPago {

	private String numeroTarjeta;
	private LocalDate fechaCaucidad;

	// constr
	public PagoTarjeta(Usuario usuario, String numeroTarjeta, LocalDate fechaCaucidad) {
		super(TipoMetodoPago.TARJETA, usuario);		
		this.numeroTarjeta = numeroTarjeta;
		this.fechaCaucidad = fechaCaucidad;
	}

	// getters, setters
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDate getFechaCaucidad() {
		return fechaCaucidad;
	}

	public void setFechaCaucidad(LocalDate fechaCaucidad) {
		this.fechaCaucidad = fechaCaucidad;
	}

	
	
	@Override
	boolean comprobarSaldo(double cantidad) {
		return getUsuario().tieneSaldoSuficiente(cantidad) && fechaCaucidad.isAfter(LocalDate.now());
	}
	

}
