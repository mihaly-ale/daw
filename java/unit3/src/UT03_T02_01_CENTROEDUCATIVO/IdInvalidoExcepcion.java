package UT03_T02_01_CENTROEDUCATIVO;

public class IdInvalidoExcepcion extends RuntimeException {
	
	private final String id;

	public IdInvalidoExcepcion(String mensaje, String id) {
		super(mensaje);
		this.id = id;
	}

	@Override
	public String toString() {
		return "IdInvalidoExcepcion: " + getMessage()  +  "[id=" + id + "]";
	}
}
