package UT03_T02_02_MAQUINAEXPENDEDORA;

public record CodigoProducto(String codigoProducto) {

	public CodigoProducto {

		if (codigoProducto == null || codigoProducto.isBlank()) {
			throw new IllegalArgumentException("Codigo del producto no puede ser nulo o vacío.");
		}

		codigoProducto = codigoProducto.substring(0, 1).toUpperCase() + codigoProducto.substring(1);

		if (!codigoProducto.matches("^[A-Z][0-9]$")) {
			throw new IllegalArgumentException(
					"Formato del código del producto es inválido. Debe ser una mayúscula y un número.");
		}
	}

}
