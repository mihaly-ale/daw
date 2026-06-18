package $examen_0422;

public class PesoNegativoException extends NullPointerException {

	PesoNegativoException(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "PesoNegativoException: " + getMessage() + ".";

	}
}
