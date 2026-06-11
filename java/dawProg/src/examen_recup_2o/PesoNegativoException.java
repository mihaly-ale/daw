package examen_recup_2o;

public class PesoNegativoException extends NullPointerException {

	PesoNegativoException(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "PesoNegativoException: " + getMessage() + ".";

	}
}
