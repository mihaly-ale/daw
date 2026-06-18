package $examen_1203;

public class ValidarSaldoCuenta extends RuntimeException {
	

	public ValidarSaldoCuenta(String mensaje) {
		super(mensaje);		
	}

	@Override
	public String toString() {
		return "Exception: " + getClass().getSimpleName() + " " + getMessage();
	}
	
	
}
