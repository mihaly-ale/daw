package $examen_1203_redo;

public class excepcionPersonalizada extends RuntimeException {

	excepcionPersonalizada(String mensaje) {
		super(mensaje);
		}

	@Override
	public String toString() {
		return "ExcepcionPersonalizada: " + getMessage() + ".";
	}

}
