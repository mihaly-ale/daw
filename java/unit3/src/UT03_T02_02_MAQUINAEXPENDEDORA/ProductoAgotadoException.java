package UT03_T02_02_MAQUINAEXPENDEDORA;

public class ProductoAgotadoException extends RuntimeException {

	private final String nombreProducto;

	public ProductoAgotadoException(String mensaje, String nombreProducto) {
		super(mensaje);
		this.nombreProducto = nombreProducto;
	}

	@Override
	public String toString() {
		return "ProductoAgotadoException: " + getMessage() + "[nombreProducto=" + nombreProducto + "]";
	}

}
