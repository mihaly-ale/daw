package UT03_T02_02_MAQUINAEXPENDEDORA;

public class SinCambioException extends RuntimeException {

	private final String cajonMaquina;

	public SinCambioException(String mensaje, String cajonMaquina) {
		super(mensaje);
		this.cajonMaquina = cajonMaquina;
	}

	@Override
	public String toString() {
		return "SinCambioException : " + getMessage() + "[cajonMaquina=" + cajonMaquina + "]";
	}

}
